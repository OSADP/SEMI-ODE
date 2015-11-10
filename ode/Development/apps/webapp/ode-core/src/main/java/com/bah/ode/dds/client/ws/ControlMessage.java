/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
package com.bah.ode.dds.client.ws;

import com.bah.ode.model.DdsRequest.Dialog;

public class ControlMessage {
   public enum Tag {
      CONNECTED, START, STOP, ERROR
   }

   private Tag tag;
   private String encoding;
   private Dialog dialog;
   private Integer recordCount;
   private String connectionDetails;

   public ControlMessage() {
      super();
   }

   public ControlMessage(Tag tag, String encoding, Dialog dialog) {
      super();
      this.tag = tag;
      this.encoding = encoding;
      this.dialog = dialog;
   }

   public Tag getTag() {
      return tag;
   }

   public ControlMessage setTag(Tag tag) {
      this.tag = tag;
      return this;
   }

   public String getEncoding() {
      return encoding;
   }

   public ControlMessage setEncoding(String encoding) {
      this.encoding = encoding;
      return this;
   }

   public Dialog getDialog() {
      return dialog;
   }

   public ControlMessage setDialog(Dialog dialog) {
      this.dialog = dialog;
      return this;
   }

   public Integer getRecordCount() {
      return recordCount;
   }

   public ControlMessage setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
      return this;
   }

   public String getConnectionDetails() {
      return connectionDetails;
   }

   public ControlMessage setConnectionDetails(String connectionDetails) {
      this.connectionDetails = connectionDetails;
      return this;
   }

}
