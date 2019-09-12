package com.jndi.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JndiController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String testJndi(){
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from my_stock");
		return list.toString();
	}

}
