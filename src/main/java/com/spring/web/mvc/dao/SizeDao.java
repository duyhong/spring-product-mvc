package com.spring.web.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("SizeDao")
public class SizeDao implements ISizeDao{
	
	@Autowired
	@Qualifier("pjdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<String> findSizes(){
		String sql="select size from sizes_tbl";
		//queryForList - will fetch list of  = String.class
		List<String> sizes=jdbcTemplate.queryForList(sql,String.class);	
		return sizes;
	}

}
