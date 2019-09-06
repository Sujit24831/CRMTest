package com.crm.qa.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class); //logger for this class 
	
	public static void main(String[] args) {
		
	System.out.println("Hello world!");
	
	logger.info("this is information message in log4j");
	logger.error("this is information message in log4j");
	logger.warn("this is information message in log4j");
	logger.fatal("this is information message in log4j");

	
	}

}
