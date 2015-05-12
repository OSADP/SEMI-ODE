package com.bah.ode.dds.client.ws;

import com.bah.ode.model.DdsRequest.Dialog;

public class ControlMessage {
	public enum Tag {
		CONNECTED,
		START,
		STOP,
		ERROR
	}

	private Tag tag;
	private String encoding;
	private Dialog dialog;
	
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
	
	
}
