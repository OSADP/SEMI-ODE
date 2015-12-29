package com.bah.ode.asn;

import java.util.ArrayList;

import com.bah.ode.asn.oss.dsrc.ExitService;
import com.bah.ode.asn.oss.dsrc.GenericSignage;
import com.bah.ode.asn.oss.dsrc.SpeedLimit;
import com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_;
import com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.Content;
import com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_.MsgId;
import com.bah.ode.asn.oss.dsrc.WorkZone;
import com.bah.ode.asn.oss.itis.ITIScodesAndText;
import com.bah.ode.model.OdeObject;

public class OdeAdvisoryDataFrame extends OdeObject {
   private static final long serialVersionUID = 1031726280264573342L;

   public enum TravelerInfoType {
      unknown, 
      advisory, 
      roadSignage, 
      commercialSignage
   }

   public class MessageId extends OdeChoice {

      private static final long serialVersionUID = 5091542631221985473L;

      public OdeFurtherInfoID furtherInfoID_chosen;
      public OdeRoadSignId roadSignID_chosen;
      
      public MessageId(MsgId msgId) {
         super();

         int chosenFlag = msgId.getChosenFlag();
         switch (chosenFlag) {
         case MsgId.furtherInfoID_chosen:
            furtherInfoID_chosen = new OdeFurtherInfoID(msgId.getFurtherInfoID());
            break;
         case MsgId.roadSignID_chosen:
            roadSignID_chosen = new OdeRoadSignId(msgId.getRoadSignID());
            break;
         }
      }

   }
   
   public class MessageContent extends OdeChoice {
      
      private static final long serialVersionUID = 3472684479212369295L;
      
      public class CodeOrText extends OdeChoice {

         private static final long serialVersionUID = 1686363207723189470L;

         public class Code extends OdeObject {

            private static final long serialVersionUID = -3360664978684621999L;
            
            public Integer code;

            public Code(Integer code) {
               super();
               this.code = code;
            }
            

         }
         
         
         public class Text extends OdeObject {

            private static final long serialVersionUID = -3360664978684621999L;
            
            public String text;

            public Text(String text) {
               super();
               this.text = text;
            }
            
         }

         public Code code_chosen;
         public Text text_chosen;
         
         public CodeOrText (Integer code, String text) {
            super();
            if (code != null) {
               code_chosen = new Code(code);
            } else if (text != null) {
               text_chosen = new Text(text);
            }
            
         }
      }

      public class CodeOrTextSequence extends OdeObject {

         private static final long serialVersionUID = 1704737577398211265L;

         public ArrayList<CodeOrText> sequence = 
               new ArrayList<MessageContent.CodeOrText>();
      }
      
      public CodeOrTextSequence advisory_chosen;
      public CodeOrTextSequence exitService_chosen;
      public CodeOrTextSequence genericSign_chosen;
      public CodeOrTextSequence speedLimit_chosen;
      public CodeOrTextSequence workZone_chosen;
      
      public MessageContent(Content content) {
         super();

         int chosenFlag = content.getChosenFlag();
         
         switch (chosenFlag) {
         case Content.advisory_chosen:
            advisory_chosen = new CodeOrTextSequence();
            ITIScodesAndText advisory = content.getAdvisory();
            for (ITIScodesAndText.Sequence_ e : advisory.elements) {
               switch (e.item.getChosenFlag()) {
               case ITIScodesAndText.Sequence_.Item.itis_chosen:
                  advisory_chosen.sequence.add(new CodeOrText(e.item.getItis().intValue(), null));
                  break;
               case ITIScodesAndText.Sequence_.Item.text_chosen:
                  advisory_chosen.sequence.add(new CodeOrText(null, e.item.getText().stringValue()));
                  break;
               }
            }
            break;
         case Content.exitService_chosen:
            exitService_chosen = new CodeOrTextSequence();
            ExitService exitService = content.getExitService();
            for (ExitService.Sequence_ e : exitService.elements) {
               switch (e.item.getChosenFlag()) {
               case ExitService.Sequence_.Item.itis_chosen:
                  exitService_chosen.sequence.add(new CodeOrText(e.item.getItis().intValue(), null));
                  break;
               case ExitService.Sequence_.Item.text_chosen:
                  exitService_chosen.sequence.add(new CodeOrText(null, e.item.getText().stringValue()));
                  break;
               }
            }
            break;
         case Content.genericSign_chosen:
            genericSign_chosen = new CodeOrTextSequence();
            GenericSignage genericSign = content.getGenericSign();
            for (GenericSignage.Sequence_ e : genericSign.elements) {
               switch (e.item.getChosenFlag()) {
               case GenericSignage.Sequence_.Item.itis_chosen:
                  genericSign_chosen.sequence.add(new CodeOrText(e.item.getItis().intValue(), null));
                  break;
               case GenericSignage.Sequence_.Item.text_chosen:
                  genericSign_chosen.sequence.add(new CodeOrText(null, e.item.getText().stringValue()));
                  break;
               }
            }
            break;
         case Content.speedLimit_chosen:
            speedLimit_chosen = new CodeOrTextSequence();
            SpeedLimit speedLimit = content.getSpeedLimit();
            for (SpeedLimit.Sequence_ e : speedLimit.elements) {
               switch (e.item.getChosenFlag()) {
               case SpeedLimit.Sequence_.Item.itis_chosen:
                  speedLimit_chosen.sequence.add(new CodeOrText(e.item.getItis().intValue(), null));
                  break;
               case SpeedLimit.Sequence_.Item.text_chosen:
                  speedLimit_chosen.sequence.add(new CodeOrText(null, e.item.getText().stringValue()));
                  break;
               }
            }
            break;
         case Content.workZone_chosen:
            workZone_chosen = new CodeOrTextSequence();
            WorkZone workZone = content.getWorkZone();
            for (WorkZone.Sequence_ e : workZone.elements) {
               switch (e.item.getChosenFlag()) {
               case WorkZone.Sequence_.Item.itis_chosen:
                  workZone_chosen.sequence.add(new CodeOrText(e.item.getItis().intValue(), null));
                  break;
               case WorkZone.Sequence_.Item.text_chosen:
                  workZone_chosen.sequence.add(new CodeOrText(null, e.item.getText().stringValue()));
                  break;
               }
            }
            break;
         }
      }

   }
   
   private TravelerInfoType frameType;
   private MessageId msgId;
   private Integer startYear;
   private Integer startTime;
   private Integer duratonTime;
   private Integer priority;
   private OdePosition3D commonAnchor;
   private Integer commonLaneWidth;
   private OdeDirectionOfUse commonDirectionality;
   private ArrayList<OdeValidRegion> regions;
   private MessageContent content;
   private String url;

   public OdeAdvisoryDataFrame(Sequence_ element) {
      setCommonAnchor(new OdePosition3D(element.getCommonAnchor()));
      if (element.getCommonDirectionality() != null)
         setCommonDirectionality(OdeDirectionOfUse.valueOf(element.getCommonDirectionality().name()));
      if (element.getCommonLaneWidth() != null)
         setCommonLaneWidth(element.getCommonLaneWidth().intValue());
      if (element.getContent() != null)
         setMessageContent(new MessageContent(element.getContent()));
      if (element.getDuratonTime() != null)
         setDuratonTime(element.getDuratonTime().intValue());
      if (element.getFrameType() != null)
         setFrameType(TravelerInfoType.valueOf(element.getFrameType().name()));
      setMessageId(new MessageId(element.getMsgId()));
      if (element.getPriority() != null)
         setPriority(element.getPriority().intValue());
      if (element.getRegions() != null)
         setRegions(OdeValidRegion.getRegions(element.getRegions().elements));
      if (element.getStartTime() != null)
         setStartTime(element.getStartTime().intValue());
      if (element.getStartYear() != null)
         setStartYear(element.getStartYear().intValue());
      if (element.getUrl() != null)
         setUrl(element.getUrl().stringValue());
   }

   public TravelerInfoType getFrameType() {
      return frameType;
   }

   public void setFrameType(TravelerInfoType frameType) {
      this.frameType = frameType;
   }

   public MessageId getMessageId() {
      return msgId;
   }

   public void setMessageId(MessageId msgId) {
      this.msgId = msgId;
   }

   public Integer getStartYear() {
      return startYear;
   }

   public void setStartYear(Integer startYear) {
      this.startYear = startYear;
   }

   public Integer getStartTime() {
      return startTime;
   }

   public void setStartTime(Integer startTime) {
      this.startTime = startTime;
   }

   public Integer getDuratonTime() {
      return duratonTime;
   }

   public void setDuratonTime(Integer duratonTime) {
      this.duratonTime = duratonTime;
   }

   public Integer getPriority() {
      return priority;
   }

   public void setPriority(Integer priority) {
      this.priority = priority;
   }

   public OdePosition3D getCommonAnchor() {
      return commonAnchor;
   }

   public void setCommonAnchor(OdePosition3D commonAnchor) {
      this.commonAnchor = commonAnchor;
   }

   public Integer getCommonLaneWidth() {
      return commonLaneWidth;
   }

   public void setCommonLaneWidth(Integer commonLaneWidth) {
      this.commonLaneWidth = commonLaneWidth;
   }

   public OdeDirectionOfUse getCommonDirectionality() {
      return commonDirectionality;
   }

   public void setCommonDirectionality(OdeDirectionOfUse commonDirectionality) {
      this.commonDirectionality = commonDirectionality;
   }

   public ArrayList<OdeValidRegion> getRegions() {
      return regions;
   }

   public void setRegions(ArrayList<OdeValidRegion> regions) {
      this.regions = regions;
   }

   public MessageContent getMessageContent() {
      return content;
   }

   public void setMessageContent(MessageContent content) {
      this.content = content;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((commonAnchor == null) ? 0 : commonAnchor.hashCode());
      result = prime * result + ((commonDirectionality == null) ? 0
            : commonDirectionality.hashCode());
      result = prime * result
            + ((commonLaneWidth == null) ? 0 : commonLaneWidth.hashCode());
      result = prime * result + ((content == null) ? 0 : content.hashCode());
      result = prime * result
            + ((duratonTime == null) ? 0 : duratonTime.hashCode());
      result = prime * result
            + ((frameType == null) ? 0 : frameType.hashCode());
      result = prime * result + ((msgId == null) ? 0 : msgId.hashCode());
      result = prime * result + ((priority == null) ? 0 : priority.hashCode());
      result = prime * result + ((regions == null) ? 0 : regions.hashCode());
      result = prime * result
            + ((startTime == null) ? 0 : startTime.hashCode());
      result = prime * result
            + ((startYear == null) ? 0 : startYear.hashCode());
      result = prime * result + ((url == null) ? 0 : url.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdeAdvisoryDataFrame other = (OdeAdvisoryDataFrame) obj;
      if (commonAnchor == null) {
         if (other.commonAnchor != null)
            return false;
      } else if (!commonAnchor.equals(other.commonAnchor))
         return false;
      if (commonDirectionality != other.commonDirectionality)
         return false;
      if (commonLaneWidth == null) {
         if (other.commonLaneWidth != null)
            return false;
      } else if (!commonLaneWidth.equals(other.commonLaneWidth))
         return false;
      if (content == null) {
         if (other.content != null)
            return false;
      } else if (!content.equals(other.content))
         return false;
      if (duratonTime == null) {
         if (other.duratonTime != null)
            return false;
      } else if (!duratonTime.equals(other.duratonTime))
         return false;
      if (frameType != other.frameType)
         return false;
      if (msgId == null) {
         if (other.msgId != null)
            return false;
      } else if (!msgId.equals(other.msgId))
         return false;
      if (priority == null) {
         if (other.priority != null)
            return false;
      } else if (!priority.equals(other.priority))
         return false;
      if (regions == null) {
         if (other.regions != null)
            return false;
      } else if (!regions.equals(other.regions))
         return false;
      if (startTime == null) {
         if (other.startTime != null)
            return false;
      } else if (!startTime.equals(other.startTime))
         return false;
      if (startYear == null) {
         if (other.startYear != null)
            return false;
      } else if (!startYear.equals(other.startYear))
         return false;
      if (url == null) {
         if (other.url != null)
            return false;
      } else if (!url.equals(other.url))
         return false;
      return true;
   }

   
}
