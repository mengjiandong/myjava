package com.mjd.jprotobuf;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
//import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
public class ReqAccountLogin {
	@Protobuf(order = 1, required = true)
	public long accountId;

	@Protobuf(order = 2, required = true)
	public String password;
	
	
}
