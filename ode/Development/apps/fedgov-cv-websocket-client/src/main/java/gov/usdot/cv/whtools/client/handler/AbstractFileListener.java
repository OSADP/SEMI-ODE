package gov.usdot.cv.whtools.client.handler;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.log4j.Logger;

public abstract class AbstractFileListener extends FileAlterationListenerAdaptor implements Listener {
	private static final Logger logger = Logger.getLogger(AbstractFileListener.class.getName());

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
	 * @see gov.usdot.cv.whtools.client.handler.Listener#sendRequest(java.io.File)
	 */
	@Override
   public abstract void sendRequest(File file);
};
