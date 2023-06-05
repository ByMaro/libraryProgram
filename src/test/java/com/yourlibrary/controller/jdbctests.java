package com.yourlibrary.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class jdbctests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testConnection() {
		try {
			Connection conn =
			DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:hr",
					"c##scott",
					"1234"
					);
			log.info(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
