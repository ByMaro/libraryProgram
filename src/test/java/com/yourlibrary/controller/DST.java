package com.yourlibrary.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DST {
	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
	@Test
	public void testconn() {
		try(Connection conn = dataSource.getConnection()){
			log.info(conn);
		}catch (Exception e) {
			// TODO: handle exception
			log.info(e.getMessage());
		}
			
	}
}
