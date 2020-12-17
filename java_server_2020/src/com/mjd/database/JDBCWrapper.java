package com.mjd.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
public class JDBCWrapper {
	Logger logger = LoggerFactory.getLogger(JDBCWrapper.class);
	
	public void testJDBCWrapper() {
		
		Connection conn = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			logger.info(e.getMessage());
			return;
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/class_test?"
					+ "characterEncoding=utf8&"
					+ "useSSL=false&"
					+ "serverTimezone=UTC","root", "root");
			
//			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/class_test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC",
//					"root", "root");	
			
		} catch (SQLException e) { 
			logger.info(e.getMessage());
			return;
		}
		
		logger.info("Connect Database success!");
		
		String sql = "insert into user_score(uname, uscore) VALUES (\"black\", 2000)";
		
//		PreparedStatement pstmnt = null;
		try {
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			pstmnt.execute();
			
			sql = "update user_score set uname = 'bycw' where id > 2";
			pstmnt = conn.prepareStatement(sql);
			pstmnt.execute();
			
			sql = "select * from user_score";
			pstmnt = conn.prepareStatement(sql);
			ResultSet res = pstmnt.executeQuery();
			while(res.next()) {
				logger.info(res.getString("uname") + ":" + res.getString("uscore"));
//				logger.info(res.getString("uscore"));
		 
			}
			
			if(res != null) {
				res.close();
			}
			if(pstmnt != null) {
				pstmnt.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("close conn");
		}
	}
}