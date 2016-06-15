"use strict";

var ws = null;
var started = false;
var connected = false;
var dataSource;
var dataType;
var encodeType;
var token;
var partOneURI = "";
var clear = "clear";
var features = [];
var featureCount = 0;
var maxFeatures = 100;
var recordsReceived = 0;
var clusters;
var map;
var intervalFunc;
var marker;
var coord_id = '';
var coordinate;
var counter = 0;
var coordinateMappings = {};
var roadSegments = [];
var markers = [];
var layerMarkers;
var layerLines;
var segmentDocId = null;
var segmentLat = null;
var segmentLng = null;
var segmentClickActive = false;
var isTest = false;
var records;
var recordsPerBatch;
var milisecondsBetween;
var recordLoc = 0;
var numFiles = 0;


$(document)
      .ready(
            function() {

               $("#map")
                     .prepend(
                           '<div id="popup" style="border-style: solid; background-color: white; border-width: 2px; padding: 3px; "><div id="popupcontent" style="height: auto; max-height: 200px; width: auto; max-width: 200px; overflow-y: scroll;"></div><button id="prevEntry" style="width: 49%;">Previous<br>Entry</button><button id="nextEntry" style="width: 49%;">Next<br>Entry</button></div></div>');
               var container = document.getElementById('popup');

               var overlay = new ol.Overlay(({
                  element : container,
                  autoPan : true,
                  autoPanAnimation : {
                     duration : 250
                  }
               }));

               map = new ol.Map({
                  layers : [ new ol.layer.Tile({
                     source : new ol.source.MapQuest({
                        layer : 'osm'
                     })
                  }) ],
                  overlays : [ overlay ],
                  target : 'map',
                  view : new ol.View({
                     center : ol.proj.fromLonLat([ 37.41, 8.82 ]),
                     zoom : 18
                  })
               });

               map.getView().setCenter(getLonLat());

               map.on('moveend', setLonLat);

               /*
                * Setting up the entry button listeners
                */

               var now = new Date();
               var yesterday = new Date();
               yesterday.setDate(now.getDate() - 1);
               $("#startDate").val(yesterday.toISOString());
               $("#endDate").val(now.toISOString());

               $('#nextEntry')
                     .on(
                           'click',
                           function() {
                              try {
                                 if (counter < coordinateMappings[coord_id].length - 1) {
                                    counter = counter + 1;
                                    document.getElementById('popupcontent').innerHTML = coordinateMappings[coord_id][counter];
                                    overlay.setPosition(coordinate);
                                    $('#prevEntry').html('Previous<br>Entry');
                                 } else {
                                    $('#nextEntry').html('No more<br>entries');
                                    setTimeout(function() {
                                       $('#nextEntry').html('Next<br>Entry');
                                    }, 2000);
                                 }
                              } catch (error) {
                              }
                           });

               $('#prevEntry')
                     .on(
                           'click',
                           function() {
                              if (counter > 0) {
                                 counter = counter - 1;
                                 document.getElementById('popupcontent').innerHTML = coordinateMappings[coord_id][counter];
                                 overlay.setPosition(coordinate);
                                 $('#nextEntry').html('Next<br>Entry');
                              } else {
                                 $('#prevEntry').html('No more<br>values');
                                 setTimeout(function() {
                                    $('#prevEntry').html('Previous<br>Entry');
                                 }, 2000);
                              }

                           });

               /*
                * Double click interaction so that the geoJson overlay Does not
                * register as a feature
                */

               var selectClick = new ol.interaction.DoubleClickZoom({
                  condition : ol.events.condition.click
               });
               map.addInteraction(selectClick);

               /*
                * If the map is clicked it will check to see if it was a feature
                * that was clicked if not then it will remove any feature that
                * is open
                * 
                * The try/catch is to ensure that the clicked feature only has
                * one data coordinate within and it is not clustered
                */

               map
                     .on(
                           'click',
                           function(evt) {
                              if (segmentClickActive) {
                                 var newSeg = new ol.proj.transform(
                                       evt.coordinate, 'EPSG:3857', 'EPSG:4326');
                                 $('#' + segmentLng).val(newSeg[0]);
                                 $('#' + segmentLat).val(newSeg[1]);
                                 $('#' + segmentDocId).text('Set Coordinates');
                                 
                                 createRoads();
                                 
                                 segmentDocId = null;
                                 segmentLng = null;
                                 segmentLat = null;
                                 segmentClickActive = false;
                              } else {
                                 try {
                                    var feature = map.forEachFeatureAtPixel(
                                          evt.pixel, function(feature, layer) {
                                             return feature;
                                          });
                                    if (feature) {
                                       if (coord_id != feature.getGeometry()
                                             .getCoordinates()) {
                                          coord_id = feature.getGeometry()
                                                .getCoordinates();
                                          counter = 0;
                                          $('#nextEntry').html('Next<br>Entry');
                                          $('#prevEntry').html(
                                                'Previous<br>Entry');
                                          $('#prevEntry').show();
                                          $('#nextEntry').show();
                                       }

                                       document.getElementById('popupcontent').innerHTML = coordinateMappings[coord_id][counter];
                                       if (coordinateMappings[coord_id].length == 1) {
                                          $('#prevEntry').hide();
                                          $('#nextEntry').hide();
                                       }
                                       coordinate = evt.coordinate;
                                       overlay.setPosition(coordinate);
                                    } else {
                                       overlay.setPosition(undefined);
                                       counter = 0;
                                    }
                                 } catch (err) {
                                    overlay.setPosition(undefined);
                                    counter = 0;
                                 }
                              }
                           });

               $('#maxFeatures').change(function() {
                  var newMax = parseInt($(this).val());
                  if (maxFeatures > newMax) {
                     features = features.splice(0, newMax);
                  }

                  if (featureCount > newMax)
                     featureCount = 0;

                  if (isNumeric($(this).val())) {
                     maxFeatures = newMax;
                  }
               });
               
               $('#n1Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n1Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n2Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n2Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n3Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n3Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n4Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n4Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n5Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n5Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n6Lat').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });
               $('#n6Lng').change(function() {
                  if (isNumeric($(this).val()))
                     createRoads();
               });

               $('#nwLat').change(function() {
                  if (isNumeric($(this).val()))
                     map.getView().setCenter(getLonLat());
               });
               $('#nwLon').change(function() {
                  if (isNumeric($(this).val()))
                     map.getView().setCenter(getLonLat());
               });
               $('#seLat').change(function() {
                  if (isNumeric($(this).val()))
                     map.getView().setCenter(getLonLat());
               });
               $('#seLon').change(function() {
                  if (isNumeric($(this).val()))
                     map.getView().setCenter(getLonLat());
               });

               $("input[name=data]:radio").attr('disabled', true);
               $("#selectDataForm").hide();
               $('.column-center').hide();
               $('.column-right').hide();
               sourceController(clear);

               $("input[name=source]:radio").change(function() {

                  dataSource = $(this).val();
                  
                  /* reset connection */
                  disconnect();

                  $('.column-center').show()
                  $('.column-right').show();
                  $("input[name=data]:radio").attr('disabled', false);
                  $("#selectDataForm").show();

                  sourceController(clear)
                  createRoads();

                  isTest = false;
                  if (dataSource == "SDC") {
                     partOneURI = "/ode/api/ws/sub/";

                     $('#advisoryRadio').hide();
                     $('#aggRadio').show();
                     $('.testRadio').hide();
                     $('#vehicleRadio').show();
                     $('#intersectionRadio').show();
                     $('#mapRadio').show();
                     $('#spatRadio').show();
                     $('#skipLimit').hide();
                     $('#deposit').show();
                     
                  } else if (dataSource == "SDPC") {
                     partOneURI = "/ode/api/ws/qry/";

                     $('#advisoryRadio').hide();
                     $('#aggRadio').show();
                     $('.testRadio').hide();
                     $('#intersectionRadio').show();
                     $('#mapRadio').show();
                     $('#spatRadio').show();
                     $('#vehicleRadio').show();
                     $('#deposit').hide();
                  } else if (dataSource == "SDW") {
                     partOneURI = "/ode/api/ws/qry/";

                     $('#advisoryRadio').show();
                     $('#aggRadio').show();
                     $('#intersectionRadio').show();
                     $('#mapRadio').show();
                     $('#spatRadio').show();
                     $('#vehicleRadio').show();
                     $('.testRadio').hide();
                     $('#deposit').hide();
                  } else if (dataSource == "TEST_UPLOAD") {
                     isTest = true;
                     partOneURI = "/ode/api/ws/tst/";

                     $('.testRadio').show();
                     $('#aggRadio').hide();
                     $('#advisoryRadio').hide();
                     $('#intersectionRadio').hide();
                     $('#mapRadio').hide();
                     $('#spatRadio').hide();
                     $('#vehicleRadio').hide();
                     $('#skipLimit').show();
                     $('#deposit').hide();
                  } else if (dataSource == "DEPOSIT_SDC") {
                     partOneURI = "/ode/api/ws/dep/";

                     $('.testRadio').hide();
                     $('#aggRadio').hide();
                     $('#vehicleRadio').show();
                     $('#advisoryRadio').show();
                     $('#intersectionRadio').hide();
                     $('#mapRadio').hide();
                     $('#spatRadio').hide();
                     $('#asnBase64Radio').show();
                     $('#asnHexRadio').show();
                     $('#vehJsonRadio').show();
                     $('.geoRegion').hide();
                  } else if (dataSource == "DEPOSIT_SDW") {
                     partOneURI = "/ode/api/ws/dep/";

                     $('.testRadio').hide();
                     $('#aggRadio').hide();
                     $('#vehicleRadio').show();
                     $('#advisoryRadio').show();
                     $('#intersectionRadio').hide();
                     $('#mapRadio').hide();
                     $('#spatRadio').hide();
                     $('#asnBase64Radio').show();
                     $('#asnHexRadio').show();
                     $('#advJsonRadio').show();
                     $('.geoRegion').hide();
                  }

                  $("input[name=data]:radio").attr('checked', false);
                  if (token != null)
                     updateRequestUri();
                  else {
                     document.getElementById('requestUri').value = "";
                  }
               });

               $("input[name=data]:radio").change(function() {
                  dataType = $(this).val();
                  disconnect();
                  
                  if (dataType == "veh") {
                     $('.geoRegion').show();
                     if (dataSource == "SDC")
                        $('.skipLimit').hide();
                     else
                        $('.skipLimit').show();
                     $('.mapIndicators').show();
                     $('.roadSeg').show();
                  } else if (dataType == "agg") {
                     $('.geoRegion').show();
                     if (dataSource == "SDC")
                        $('.skipLimit').hide();
                     else
                        $('.skipLimit').show();
                     $('.mapIndicators').hide();
                     $('.roadSeg').show();
                  } else if (dataType == "int" || dataType == "spat" || dataType == "map") {
                     $('.geoRegion').show();
                     if (dataSource == "SDC")
                        $('.skipLimit').hide();
                     else
                        $('.skipLimit').show();
                     $('.mapIndicators').hide();
                     $('.roadSeg').hide();
                  } else if (dataType == "adv") {
                     $('.geoRegion').show();
                     if (dataSource == "SDC")
                        $('.skipLimit').hide();
                     else
                        $('.skipLimit').show();
                     $('.mapIndicators').hide();
                     $('.roadSeg').hide();
                  } else {
                     $('.geoRegion').hide();
                     $('.skipLimit').hide();
                     $('.mapIndicators').hide();
                     $('.roadSeg').hide();
                     
                     if (dataType == "asnbase64") {
                        encodeType = "base64";
                     } else if (dataType == "asnhex") {
                        encodeType = "hex";
                     } else {
                        encodeType = "json";
                     }
                  }
                  
                  updateRequestUri();
               });

               // modal window handlers
               // dialog box example from Jquery UI web site
               var dialog, form,
               // From
               // http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#e-mail-state-%28type=email%29
               emailRegex = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/, name = $("#name"), email = $("#email"), password = $("#password"), allFields = $(
                     []).add(email).add(password), tips = $(".validateTips");

               dialog = $("#dialog-form").dialog({
                  autoOpen : false,
                  height : 330,
                  width : 350,
                  modal : true,
                  buttons : {
                     "OK" : addUser,
                     Cancel : function() {
                        dialog.dialog("close");
                     }
                  },
                  close : function() {
                     form[0].reset();
                     allFields.removeClass("ui-state-error");
                  }
               });

               form = dialog.find("form").on("submit", function(event) {
                  event.preventDefault();
                  addUser();
               });

               $("#get-token").on("click", function() {
                  dialog.dialog("open");
               });

               if (token == null) {
                  dialog.dialog("open");
               }

               function updateTips(t) {
                  tips.text(t).addClass("ui-state-highlight");
                  setTimeout(function() {
                     tips.removeClass("ui-state-highlight", 1500);
                  }, 500);
               }

               function checkLength(o, n, min, max) {
                  if (o.val().length > max || o.val().length < min) {
                     o.addClass("ui-state-error");
                     updateTips("Length of " + n + " must be between " + min
                           + " and " + max + ".");
                     return false;
                  } else {
                     return true;
                  }
               }

               function checkRegexp(o, regexp, n) {
                  if (!(regexp.test(o.val()))) {
                     o.addClass("ui-state-error");
                     updateTips(n);
                     return false;
                  } else {
                     return true;
                  }
               }

               function addUser() {
                  var valid = true;
                  allFields.removeClass("ui-state-error");

                  valid = valid && checkLength(email, "email", 6, 80);
                  valid = valid && checkLength(password, "password", 4, 24);

                  valid = valid
                        && checkRegexp(
                              name,
                              /^[a-z]([0-9a-z_\s])+$/i,
                              "Username may consist of a-z, 0-9, underscores, spaces and must begin with a letter.");
                  valid = valid
                        && checkRegexp(email, emailRegex, "eg. ui@jquery.com");
                  valid = valid
                        && checkRegexp(password, /^[0-9a-zA-Z!#$%&*_\-]+$/,
                              "Password field only allow : a-z 0-9!#$%&*_-");

                  if (valid) {
                     getToken(email.val(), password.val());
                     dialog.dialog("close");
                  }
                  return valid;
               }
               
               setButtonHoverOver('clear-map', true);
               setButtonHoverOver('clear-sent-console', true);
               setButtonHoverOver('clear-received-console', true);

            });

function sourceController(clazz) {
   $('.geoRegion').hide();
   $('.skipLimit').hide();
   $('.mapIndicators').hide();
   $('.roadSeg').hide();
   
   if (window.location.hostname == 'ec2-52-87-98-38.compute-1.amazonaws.com' ||
       window.location.hostname == '52.87.98.38') {
      $('.testRadio').hide();
   }

   if (clazz != clear) {
      $(clazz).show();
   }
}

function updateRequestUri() {
   if (window.location.protocol == "http:") {
      document.getElementById('requestUri').value = "ws://"
            + window.location.host + partOneURI + dataType + "?token="
            + token;
   } else {
      document.getElementById('requestUri').value = "wss://"
            + window.location.host + partOneURI + dataType + "?token="
            + token;
   }
   setConnectionState(connected, false);
}

function setConnectionState(c, s) {
   if (dataSource == null || dataType == null
       || (numFiles == 0 && 
           (dataSource == "DEPOSIT_SDC" || dataSource == "DEPOSIT_SDW"))) {
      connected = false;
      
      setButtonHoverOver('connect', false);
   } else {
      connected = c;
      started = s;
      
      setButtonHoverOver('connect', (token != null));
   }

   if (!connected)
      started = false;

   setButtonHoverOver('disconnect', connected);
   setButtonHoverOver('send', (started || connected));
   setButtonHoverOver('get-token', true);
}

function setButtonHoverOver(buttonId, enabled) {
   $('#' + buttonId).prop("disabled",!enabled);
   if (enabled)
      $('#' + buttonId).hover(function() {
         $(this).addClass('ui-state-hover');
      }, function() {
         $(this).removeClass('ui-state-hover');
      });
   else {
      $('#' + buttonId).unbind('mouseout keyup mouseup hover');
      $('#' + buttonId).removeClass('ui-state-hover');
   }
}

function connect() {
   var clustersUpdateCnt = 0;
   var updateClustersConstant = 0;
   var requestUri;
   if (dataSource != "TEST_UPLOAD") {
      requestUri = $('#requestUri').val();
   } else {
      requestUri = $('#requestUri').val() + $('#requestId').val();

   }
   if (requestUri == '') {
      alert('Please select server side connection implementation.');
      return;
   }
   if ('WebSocket' in window) {
      ws = new WebSocket(requestUri);
   } else if ('MozWebSocket' in window) {
      ws = new MozWebSocket(requestUri);
   } else {
      alert('WebSocket is not supported by this browser.');
      return;
   }
   ws.onopen = function(event) {
      setConnectionState(true, false);
      log("sent-console", 'Info: WebSocket connection opened.');
      intervalFunc = setInterval(updateClustersOnMap, 3000)
      features = [];
      coordinateMappings = {};
      recordsReceived = 0;
   };
   ws.onmessage = function(event) {
      if (!started && dataSource != "TEST_UPLOAD") { // does not happen in upload
         var message = JSON.parse(event.data);
         if (message["payload"] != null && 
             message["payload"]["code"] == "SUCCESS") {
            setConnectionState(true, true);
         }
      }
      log("received-console", event.data);
      if (++clustersUpdateCnt >= updateClustersConstant) {
         updateClustersConstant = updateClusters(event.data);
         clustersUpdateCnt = 0;
      }

      var pl = getPayload(event.data);
      var haveRequestId = pl !== undefined && pl !== false && pl !== null
            && pl.requestId !== undefined;
      if (haveRequestId) {
         $('#requestId').val(pl.requestId);

         if (isTest) {
            window.open("upload.xhtml#" + $('#requestId').val() + "#"
                  + dataType, '_blank');
         }
      }

   };
   ws.onclose = function(event) {
      setConnectionState(false, false);
      log("sent-console", 'Info: WebSocket connection closed, Code: ' + event.code
            + (event.reason == "" ? "" : ", Reason: " + event.reason));
      clearInterval(intervalFunc);
   };
   ws.onerror = function(event) {
      setConnectionState(false, false);
      log("sent-console", 'Info: WebSocket connection closed, Code: ' + event.code
            + (event.reason == "" ? "" : ", Reason: " + event.reason));
      clearInterval(intervalFunc);
   };
}

function disconnect() {
   if (ws != null) {
      ws.close();
      ws = null;
   }
   featureCount = 0;
   features = [];
   coordinateMappings = {};
   clearInterval(intervalFunc);
   setConnectionState(false, false);
   $('#requestId').val("");
}

function send() {
   var request = {};
   request["dataSource"] = dataSource;
   if (ws != null) {
      request["nwLat"] = document.getElementById('nwLat').value;
      request["nwLon"] = document.getElementById('nwLon').value;
      request["seLat"] = document.getElementById('seLat').value;
      request["seLon"] = document.getElementById('seLon').value;
      if (dataSource == "TEST_UPLOAD" || dataSource == "SDPC" || dataSource == "SDW") {

         var requestStart = document.getElementById('startDate').value;
         var requestEnd = document.getElementById('endDate').value;
         var requestSkip = $("#skip").val();
         var requestLimit = $("#limit").val();

         if (requestStart.length !== 0) {
            request["startDate"] = requestStart;
         }
         if (requestEnd.length !== 0) {
            request["endDate"] = requestEnd;
         }
         if (requestSkip.length !== 0) {
            request["skip"] = requestSkip;
         }
         if (requestLimit.length !== 0) {
            request["limit"] = requestLimit;
         }

      }

      if (dataType == "veh" || dataType == "agg") { 
         var s1 = {};
         s1["id"] = document.getElementById('n1').value + '-'
               + document.getElementById('n2').value;
         s1["startPoint"] = {
            "latitude" : document.getElementById('n1Lat').value,
            "longitude" : document.getElementById('n1Lng').value
         };// W. Larned and Shelby
         s1["endPoint"] = {
            "latitude" : document.getElementById('n2Lat').value,
            "longitude" : document.getElementById('n2Lng').value
         };// W. Larned and Griswold
   
         var s2 = {};
         s2["id"] = document.getElementById('n2').value + '-'
               + document.getElementById('n3').value;
         s2["prevSegment"] = s1["id"];
         s2["endPoint"] = {
            "latitude" : document.getElementById('n3Lat').value,
            "longitude" : document.getElementById('n3Lng').value
         };// W. Larned and Randolph
   
         var s3 = {};
         s3["id"] = document.getElementById('n4').value + '-'
               + document.getElementById('n5').value;
         s3["startPoint"] = {
            "latitude" : document.getElementById('n4Lat').value,
            "longitude" : document.getElementById('n4Lng').value
         };// TelegraphBingham
         s3["endPoint"] = {
            "latitude" : document.getElementById('n5Lat').value,
            "longitude" : document.getElementById('n5Lng').value
         };// TelegraphW12Mile
   
         var s4 = {};
         s4["id"] = document.getElementById('n5').value + '-'
               + document.getElementById('n6').value;
         s4["prevSegment"] = s3["id"];
         s4["endPoint"] = {
            "latitude" : document.getElementById('n6Lat').value,
            "longitude" : document.getElementById('n6Lng').value
         };// TelegraphCivicCtr
   
         var polyline = [];
         polyline.push(s1);
         polyline.push(s2);
         polyline.push(s3);
         polyline.push(s4);
   
         request["polyline"] = {
            "segments" : polyline
         };
      }

      if (dataSource == "DEPOSIT_SDC" || dataSource == "DEPOSIT_SDW") { // deposit
         sendFiles();
      } else {
         var reqStr = JSON.stringify(request);
         ws.send(reqStr);
         log("sent-console", 'Sent: ' + reqStr);
      }
   } else {
      alert('WebSocket connection not established, please connect.');
   }

}

function log(consoleId, msgOrData) {

   var console = document.getElementById(consoleId);

   var p = document.createElement('p');
   p.style.wordWrap = 'break-word';
   p.appendChild(document.createTextNode(msgOrData));
   console.appendChild(p);
   while (console.childNodes.length > 1000) {
      console.removeChild(console.firstChild);
   }
   console.scrollTop = console.scrollHeight;
}

function handleFileSelect(files) {
   showFileList(files);
   if (!connected)
      setConnectionState(false, false);
}

function showFileList(files) {
   // files is a FileList of File objects. List some properties.
   var output = [];
   numFiles = files.length
   for (var i = 0 ; i < numFiles; i++) {
      var file = files[i];
      output.push('<li><strong>', escape(file.name), '</strong> (', file.type
            || 'n/a', ') - ', file.size, ' bytes, last modified: ',
            file.lastModifiedDate ? file.lastModifiedDate.toLocaleDateString()
                  : 'n/a', '</li>');
   }
   document.getElementById('list').innerHTML = '<ul>' + output.join('')
         + '</ul>';
}

function showThumbnail(file) {
   var reader = new FileReader();

   // Closure to capture the file information.
   reader.onload = (function(theFile) {
      return function(e) {
         // Render thumbnail.
         var span = document.createElement('span');
         span.innerHTML = [ '<img class="thumb" src="', e.target.result,
               '" title="', escape(theFile.name), '"/>' ].join('');
         document.getElementById('list').insertBefore(span, null);
      };
   })(file);

   // Read in the image file as a data URL.
   reader.readAsDataURL(file);
}

function sendFiles() {
   var reader = new FileReader();
   recordsPerBatch = parseInt($("#recordsPerBatch").val());
   milisecondsBetween = parseInt($("#timeBuffer").val());
   reader.onloadend = function(evt) {
      var fileData = new String(reader.result);
      records = fileData.split('\n');
      if (isNaN(recordsPerBatch) || isNaN(milisecondsBetween)) {
         for (var i = 0, numRecords = records.length; i < numRecords && ws != null; i++) {
            var request = {};
            request['dataSource'] = dataSource;
            request['dataType'] = dataType;
            request['encodeType'] = encodeType;
            request['data'] = records[i];
            var reqStr = JSON.stringify(request);
            ws.send(reqStr);
         }
      }
   };

   var files = $("#files").prop("files");
   for (var i = 0, numFiles = files.length; i < numFiles; i++) {
      var file = files[i];
      reader.readAsText(file);

      if (!isNaN(recordsPerBatch) && !isNaN(milisecondsBetween)) {
         recordLoc = 0;
         var sendInt = window
               .setInterval(
                     function() {
                        if (records != undefined) {
                           for (var subj = recordLoc + recordsPerBatch; 
                                recordLoc < records.length
                                && recordLoc < subj
                                && ws != null; recordLoc++) {
                              recordsPerBatch = parseInt($("#recordsPerBatch").val());
                              var request = {};
                              request['dataSource'] = dataSource;
                              request['dataType'] = dataType;
                              request['encodeType'] = encodeType;
                              request['data'] = records[recordLoc];
                              var reqStr = JSON.stringify(request);
                              ws.send(reqStr);
                              // console.log("sent " + recordLoc);
                           }
                        }
                        if (recordLoc >= records.length) {
                           clearInterval(sendInt);
                        }
                     }, milisecondsBetween);
      }
   }
}

function getToken(email, password) {
   var url = window.location.protocol + '//' + window.location.host
         + '/ode/api/auth/login';
   $.ajax({
      type : "GET",
      dataType : 'json',
      url : url,
      async : false,
      headers : {
         "Authorization" : "Basic " + btoa(email + ":" + password)
      },
      success : function(data) {
         log("received-console", "Login Response: " + JSON.stringify(data));
         var payload = data["payload"];
         if (payload != null) {
            token = payload["token"];
            if (token != null) {
               updateRequestUri();
            }
         } else {
            token = null;
         }
      },
      error : function(jqXHR, textStatus, errorThrown) {
         var jsonMsg = {'Status': textStatus, 
                    'Error Thrown':errorThrown,  
                    'Details': JSON.stringify(jqXHR)};
         var msg = JSON.stringify(jsonMsg);
         alert(msg);

         log("sent-console", msg);
      }
   });
}

function clearLog(consoleId) {
   $('#'+consoleId).text("");
   if (consoleId == 'received-console') {
      recordsReceived = 0;
      $('#recordCounter').val('Records Received: 0');
   }
}

/** MAP FUNCTIONS * */

/**
 * Returns the center coordinates Also, sets the bounds and zoom of the map As
 * close as possible to the given NW, SE corners given the aspect ratio
 */
function getLonLat() {
   var nwLat;
   var nwLon;
   var seLat;
   var seLon;

   nwLat = parseFloat($('#nwLat').val());
   nwLon = parseFloat($('#nwLon').val());
   seLat = parseFloat($('#seLat').val());
   seLon = parseFloat($('#seLon').val());

   var centerLat = (nwLat + seLat) / 2;
   var centerLon = (nwLon + seLon) / 2;
   var temp = ol.proj.fromLonLat([ centerLon, centerLat ]);

   var NWcorner = new ol.Feature({
      geometry : new ol.geom.Point(ol.proj.fromLonLat([ nwLon, nwLat ]))
   });

   var SEcorner = new ol.Feature({
      geometry : new ol.geom.Point(ol.proj.fromLonLat([ seLon, seLat ]))
   });

   var bounds = [];
   bounds.push(NWcorner);
   bounds.push(SEcorner);

   var source = new ol.source.Vector({
      features : bounds
   });

   map.getView().fit(source.getExtent(), map.getSize());
   setLonLat();
   return temp;
}

function setLonLat() {
   var extent = map.getView().calculateExtent(map.getSize());

   var nw = new ol.proj.transform([ extent[0], extent[3] ], 'EPSG:3857',
         'EPSG:4326');
   var se = new ol.proj.transform([ extent[2], extent[1] ], 'EPSG:3857',
         'EPSG:4326');

   $('#nwLat').val(nw[1]);
   $('#nwLon').val(nw[0]);
   $('#seLat').val(se[1]);
   $('#seLon').val(se[0]);
}

function getPayload(str) {
   try {
      return JSON.parse(str).payload;
   } catch (e) {
      return false;
   }
}

function getMetadata(str) {
   try {
      return JSON.parse(str).metadata;
   } catch (e) {
      return false;
   }
}

function updateClusters(str) {
   var pl = getPayload(str);
   var metadata = getMetadata(str);
   var recordsReceivedIncrement = 1;
   
//   if (metadata.latency != null)
//      recordsReceivedIncrement = Math.ceil(parseInt(metadata.latency) / 100);
//   else
//      recordsReceivedIncrement = 100;
   
   if (pl !== undefined && pl !== false && pl !== null && pl.dataType === "VehicleData") {
      recordsReceived += recordsReceivedIncrement;
      var lon = parseFloat(pl.longitude);
      var lat = parseFloat(pl.latitude);
      var temp = ol.proj.fromLonLat([ lon, lat ]);
      if (!isNaN(temp[0]) && !isNaN(temp[1])) {
         var titleHtml = "<center>";
         var key;
         for (key in pl) {
            if (pl.hasOwnProperty(key)) {
               titleHtml += "<strong>" + key + "</strong><br/>" + pl[key]
                     + "<br/>";
            }
         }
         titleHtml += "</center>";

         var vFeature = new ol.Feature(new ol.geom.Point(ol.proj.fromLonLat([
               lon, lat ])));
         if (coordinateMappings[vFeature.getGeometry().getCoordinates()] === undefined
               || coordinateMappings[vFeature.getGeometry().getCoordinates()] === null) {
            if (featureCount >= maxFeatures) {
               featureCount = 0;
               if (features[featureCount] != undefined) {
                  coordinateMappings[features[featureCount].getGeometry()
                        .getCoordinates()] = null;
               } else if (features[featureCount] != null) {
                  coordinateMappings[features[featureCount].getGeometry()
                        .getCoordinates()] = null;
               }
               coordinateMappings[vFeature.getGeometry().getCoordinates()] = [ titleHtml ];
               features[featureCount] = (vFeature);
               featureCount++;
            } else {
               if (features[featureCount] != undefined) {
                  coordinateMappings[features[featureCount].getGeometry()
                        .getCoordinates()] = null;
               } else if (features[featureCount] != null) {
                  coordinateMappings[features[featureCount].getGeometry()
                        .getCoordinates()] = null;
               }
               features[featureCount] = (vFeature);
               featureCount++;
               coordinateMappings[vFeature.getGeometry().getCoordinates()] = [ titleHtml ];
            }
         } else {
            var arr = coordinateMappings[vFeature.getGeometry()
                  .getCoordinates()];
            coordinateMappings[vFeature.getGeometry().getCoordinates()] = arr
                  .concat(titleHtml);
         }
      }
   } else if (pl !== undefined && pl !== false && pl !== null
           && pl.code === undefined && pl.token === undefined
           && (pl.tag === undefined || pl.tag === 'DEPOSITED')) { // avoid success and token responses in payload
      recordsReceived += recordsReceivedIncrement;
   }

   return recordsReceivedIncrement;
}

function clearMap() {
   features = [];
   coordinateMappings = {};
   featureCount = 0;
   updateClustersOnMap();
}

function updateClustersOnMap() {

   $('#recordCounter').val('Records Received: ' + recordsReceived);

   var source = new ol.source.Vector({
      features : features
   });

   var clusterSource = new ol.source.Cluster({
      distance : 5,
      source : source
   });

   /*
    * Style elements to allow for the blue circles and text overlays for the
    * number of elements inside each node
    */
   map.removeLayer(clusters);
   var styleCache = {};
   clusters = new ol.layer.Vector({
      source : clusterSource,
      style : function(feature, resolution) {
         var size = feature.get('features').length;
         var style = styleCache[size];
         if (!style) {
            style = [ new ol.style.Style({
               image : new ol.style.Circle({
                  radius : 10,
                  stroke : new ol.style.Stroke({
                     color : '#fff'
                  }),
                  fill : new ol.style.Fill({
                     color : '#ce0000'
                  })
               }),
               text : new ol.style.Text({
                  text : size.toString(),
                  fill : new ol.style.Fill({
                     color : '#fff'
                  })
               })
            }) ];
            styleCache[size] = style;
         }
         return style;
      }
   });

   map.addLayer(clusters);
}

function createRoads() {
   map.removeLayer(layerMarkers);
   map.removeLayer(layerLines);

   roadSegments = [];
   roadSegments.push([ $('#n1Lat').val(), $('#n1Lng').val() ]);
   roadSegments.push([ $('#n2Lat').val(), $('#n2Lng').val() ]);
   roadSegments.push([ $('#n3Lat').val(), $('#n3Lng').val() ]);
   roadSegments.push([ $('#n4Lat').val(), $('#n4Lng').val() ]);
   roadSegments.push([ $('#n5Lat').val(), $('#n5Lng').val() ]);
   roadSegments.push([ $('#n6Lat').val(), $('#n6Lng').val() ]);

   layerMarkers = AddMarkers();
   layerLines = new ol.layer.Vector({
      source : new ol.source.Vector({
         features : [ new ol.Feature({
            geometry : new ol.geom.LineString(markers, 'XY'),
            name : 'Line'
         }) ]
      })
   });

   map.addLayer(layerMarkers);
   map.addLayer(layerLines);
}

function AddMarkers() {
   // create a bunch of icons and add to source vector
   var vectorSource = new ol.source.Vector({});
   for (var i = 0; i < roadSegments.length; i++) {
      var x = parseFloat(roadSegments[i][1]); // lon
      var y = parseFloat(roadSegments[i][0]); // lat

      var iconFeature = new ol.Feature({
         geometry : new ol.geom.Point(ol.proj.fromLonLat([ x, y ])),
         name : 'Marker ' + i
      });
      markers[i] = ol.proj.fromLonLat([ x, y ]);
      vectorSource.addFeature(iconFeature);
   }

   // add the feature vector to the layer vector, and apply a style to whole
   // layer
   var style;
   var vectorLayer = new ol.layer.Vector({
      source : vectorSource,
      style : function(feature, resolution) {
         style = [ new ol.style.Style({
            image : new ol.style.Circle({
               radius : 6,
               stroke : new ol.style.Stroke({
                  color : '#fff'
               }),
               fill : new ol.style.Fill({
                  color : '#3399CC'
               })
            })
         }) ];
         return style;
      }
   });
   return vectorLayer;
}

function setNode(buttonID, latID, lngID) {
   if (segmentDocId !== buttonID) {
      if (segmentDocId === null) {
         segmentClickActive = true;
         segmentDocId = buttonID;
         $('#' + segmentDocId).text('Click Map Location');
         segmentLat = latID;
         segmentLng = lngID;
      } else {
         segmentClickActive = false;
         $('#' + segmentDocId).text('Set Coordinates');
         segmentDocId = null;
         setSegment(buttonID, latID, lngID);
      }
   }
}

function openDeposit() {
   window.open("deposit.xhtml#" + dataType, '_blank');
}

function isNumeric(n) {
   return !isNaN(parseFloat(n)) && isFinite(n);
}
