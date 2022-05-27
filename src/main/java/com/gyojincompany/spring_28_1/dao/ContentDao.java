package com.gyojincompany.spring_28_1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ContentDao {
	
	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public ContentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
