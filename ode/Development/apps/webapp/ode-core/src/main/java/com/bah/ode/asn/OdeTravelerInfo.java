package com.bah.ode.asn;

import java.util.ArrayList;

import com.bah.ode.asn.oss.dsrc.TravelerInformation;
import com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames;
import com.bah.ode.asn.oss.dsrc.TravelerInformation.DataFrames.Sequence_;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.CodecUtils;

public class OdeTravelerInfo extends OdeObject {

   private static final long serialVersionUID = 3570277012168173163L;

   private Integer dataFrameCount;
   private ArrayList<OdeAdvisoryDataFrame> dataFrames;
   private OdeDSRCmsgID msgID;
   private String packetID;
   private String typeName;
   private String urlB;

   public OdeTravelerInfo(TravelerInformation tim) {
      super();
      if (tim.getDataFrameCount() != null)
         setDataFrameCount(tim.getDataFrameCount().intValue());
      setDataFrames2(tim.getDataFrames());
      if (tim.getMsgID() != null)
         setMsgID(OdeDSRCmsgID.valueOf(tim.getMsgID().name()));
      if (tim.getPacketID() != null)
         setPacketID(CodecUtils.toHex(tim.getPacketID().byteArrayValue()));
      setTypeName(tim.getTypeName());
      if (tim.getUrlB() != null)
         setUrlB(tim.getUrlB().stringValue());
   }

   private void setDataFrames2(DataFrames dataFrames2) {
      if (dataFrames2 != null) {
         dataFrames = new ArrayList<OdeAdvisoryDataFrame>();
         ArrayList<Sequence_> elements = dataFrames2.elements;
         
         for (Sequence_ element : elements) {
            dataFrames.add(new OdeAdvisoryDataFrame(element));
         }
      }
   }

   public Integer getDataFrameCount() {
      return dataFrameCount;
   }

   public OdeTravelerInfo setDataFrameCount(Integer dataFrameCount) {
      this.dataFrameCount = dataFrameCount;
      return this;
   }

   public ArrayList<OdeAdvisoryDataFrame> getDataFrames() {
      return dataFrames;
   }

   public OdeTravelerInfo setDataFrames(ArrayList<OdeAdvisoryDataFrame> dataFrames) {
      this.dataFrames = dataFrames;
      return this;
   }

   public OdeDSRCmsgID getMsgID() {
      return msgID;
   }

   public OdeTravelerInfo setMsgID(OdeDSRCmsgID msgID) {
      this.msgID = msgID;
      return this;
   }

   public String getPacketID() {
      return packetID;
   }

   public OdeTravelerInfo setPacketID(String packetID) {
      this.packetID = packetID;
      return this;
   }

   public String getTypeName() {
      return typeName;
   }

   public OdeTravelerInfo setTypeName(String typeName) {
      this.typeName = typeName;
      return this;
   }

   public String getUrlB() {
      return urlB;
   }

   public OdeTravelerInfo setUrlB(String urlB) {
      this.urlB = urlB;
      return this;
   }

   
}
