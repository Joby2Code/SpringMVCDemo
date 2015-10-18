package com.santosh.spring;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class EmployeeServices {

	private JdbcTemplate JdbcTemplate;
	public EmployeeServices(JdbcTemplate jt)
	{
		JdbcTemplate=jt;
	}
	public void create(final EmpDetails user) {
		// TODO Auto-generated method stub
		JdbcTemplate.update("insert into employee values(?,?,?,?,?,?,?,?)", new PreparedStatementSetter()
		{

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
			ps.setInt(1, user.getEmpno());	
			ps.setString(2, user.getName());
			ps.setString(3, user.getJob());
			ps.setInt(4, user.getMgr());
			ps.setDate(5, new Date(System.currentTimeMillis()));
			ps.setDouble(6, user.getSal());
			ps.setDouble(7, user.getComm());
			ps.setInt(8, user.getDeptno());
				
			}
			
		});
		
	}

}
