package com.santosh.spring;

import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModel {
private JdbcTemplate jdbcTemplate;	
	public LoginModel(JdbcTemplate jt)
	{
		jdbcTemplate=jt;
	}
	
	public String validation(UserDetails user)
	{
		System.out.println(user.getUname()+"----- " +user.getPass());
		try
		{
			return (String)jdbcTemplate.queryForObject("select type from userdetails where username=\'"+user.getUname()+"\' and userpass=\'"+user.getPass()+"\'",String.class);
		}
		catch(EmptyResultDataAccessException e){
			e.printStackTrace();
			return null;
		}
	
	}

}
