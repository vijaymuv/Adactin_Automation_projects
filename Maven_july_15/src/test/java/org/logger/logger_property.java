package org.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logger_property {
	public static Logger log = Logger.getLogger(logger_property.class);
	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j (1).properties");
		log.debug("degud");
		log.info("info");
		log.warn("Warn");
		log.error("error");
		log.fatal("fatal");
	}

}
