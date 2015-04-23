package com.bah.ode.dds.client.ws;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListener;

public interface Listener extends FileAlterationListener {
	public abstract void sendRequest(File file);

}