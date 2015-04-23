/**
 * Copyright 2014 Leidos
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bah.ode.dds.client.ws;


import java.io.File;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestHandler {

	private static final Logger logger = LoggerFactory
	      .getLogger(RequestHandler.class);
	
	private String watchDirectory;
	private int pollingInterval = 2000;
	private Listener listener;

	public RequestHandler(String watchDirectory, Listener listener) {
		this.watchDirectory = watchDirectory;
		this.listener = listener;
	}

	public void start() {
		FileAlterationObserver observer = new FileAlterationObserver(this.watchDirectory);
		FileAlterationMonitor monitor = new FileAlterationMonitor(this.pollingInterval);
		
		observer.addListener(listener);
		monitor.addObserver(observer);
		try {
			monitor.start();
			logger.info("Watching for changes to query files in directory: " + new File(this.watchDirectory).getAbsolutePath());
		} catch (Exception e) {
			logger.info("DirectoryWatcher failed to start", e);
		}

	}
	
}
