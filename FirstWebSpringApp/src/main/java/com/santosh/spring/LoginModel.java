package com.santosh.spring;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModel {
private JdbcTemplate jdbcTemplate;	
	public LoginModel(JdbcTemplate jt)
	{
		jdbcTemplate=jt;
	}
	
	public String validation(String uname,String pass)
	{
		try
		{
			return (String)jdbcTemplate.queryForObject("select type from userdetails where username=\'"+uname+"\' and userpass=\'"+pass+"\'",String.class);
		}
		catch(EmptyResultDataAccessException e){
			return null;
		}
	}

}
