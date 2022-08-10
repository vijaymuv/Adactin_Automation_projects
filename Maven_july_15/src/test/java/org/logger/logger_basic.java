package org.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class logger_basic {
	public static Logger log = Logger.getLogger(logger_basic.class);
	public static void main(String[] args) {

		BasicConfigurator.configure();
		log.debug("degud");
		
		log.info("info");
		log.warn("Warn");
		log.error("error");
		log.fatal("fatal");
	}

}
