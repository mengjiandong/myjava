package com.mjd;



//import com.mjd.logtest.testlogger;
import com.mjd.jprotobuf.JProtoBufWrapper;
//import com.mjd.netty.NettySocketServer;
import com.mjd.utils.XMLUtils;

import com.mjd.utils.EncryptWrapper;

import com.mjd.utils.PropertiesUtils;
 
import com.mjd.database.JDBCWrapper;
public class Main{
	

	
	
	public static void main(String args[]) {
//		System.out.printf("hello world\r\n");
//		testlogger loggerTest = new testlogger();
//		loggerTest.testLog4jLog();
//		loggerTest.testslf4jLog();		
//		try {
//			new NettySocketServer().startServer(6080);
//			
//		}
//		catch(Exception e) {
//			
//		}		
//		new JProtoBufWrapper().testJProtoBuf();		
//		new XMLUtils().testXMLUtils();
//		new PropertiesUtils().testProperties();
//		new EncryptWrapper().testEncryptWrapper();

		new JDBCWrapper().testJDBCWrapper();
	}
}