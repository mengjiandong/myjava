package com.mjd;

import com.mjd.logtest.testlogger;
import com.mjd.netty.NettySocketServer;

public class Main{
	public static void main(String args[]) {
//		System.out.printf("hello world\r\n");
//		testlogger loggerTest = new testlogger();
//		loggerTest.testLog4jLog();
//		loggerTest.testslf4jLog();
		
		try {
			new NettySocketServer().startServer(6080);
			
		}
		catch(Exception e) {
			
		}
	}
}