package com.bah.ode.dds.client.ws;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractFileListener extends FileAlterationListenerAdaptor implements Listener {
   private static final Logger logger = LoggerFactory
         .getLogger(AbstractFileListener.class);

	@Override
	public void onFileCreate(File file) {
		logger.info("File created: " + file.getAbsolutePath());
		sendRequest(file);
	}

	@Override
	public void onFileChange(File file) {
		if (file.exists()) {
			logger.info("File changed: " + file.getAbsolutePath());
			sendRequest(file);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.bah.ode.dds.client.ws.Listener#sendRequest(java.io.File)
	 */
	public abstract void sendRequest(File file);
};
