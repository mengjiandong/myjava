package com.mjd.logtest;

public class testlogger{
	private org.apache.log4j.Logger logger =
			org.apache.log4j.Logger.getLogger(getClass());

	private org.slf4j.Logger slf4j = 
			org.slf4j.LoggerFactory.getLogger(getClass());
	
	public void testLog4jLog() {
		this.logger.debug("hello world");
		this.logger.info("this info");
	}
	
	public void testslf4jLog() {
		this.slf4j.debug("lf4jLog debug {}, {}" , "XXX", "YYY" );
		this.slf4j.info("slf4j info {}, {} ", "AAA", "BBB");
	}
}