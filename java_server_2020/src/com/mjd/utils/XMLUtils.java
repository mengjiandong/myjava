package com.mjd.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.mjd.utils.XMLServer;


public class XMLUtils{
	private Logger logger = LoggerFactory.getLogger(XMLUtils.class);
	
	public void testXMLUtils() {
		logger.info("hello");
		
		Serializer s = new Persister();
		XMLServer serverXML = null;
		try {
			serverXML = s.read(XMLServer.class, new File("configs/server.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("redisUrl : " + serverXML.redisUrl);
		
		
		
		
	}
	 
	
}