package com.mjd.jprotobuf;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
// --
//import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.mjd.jprotobuf.ReqAccountLogin;


public class JProtoBufWrapper{
	
	Logger logger = LoggerFactory.getLogger(JProtoBufWrapper.class);
	public void testJProtoBuf() {
		ReqAccountLogin reg = new ReqAccountLogin();
		reg.accountId = 100000;
		reg.password = "Abc123456";
		
		Codec<ReqAccountLogin> code = ProtobufProxy.create(ReqAccountLogin.class);
		
		byte[] bytes = null;
		try {
			bytes = code.encode(reg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		
		
		try {
			ReqAccountLogin newReg = code.decode(bytes);
			logger.info(newReg.accountId + " : " + newReg.password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
	}
}