package com.santosh.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowcount) throws SQLException {
		// TODO Auto-generated method stub
		EmpDetails ed=new EmpDetails();
		ed.setEmpno(rs.getInt(1));
		ed.setName(rs.getString(2));
		ed.setJob(rs.getString(3));
		ed.setMgr(rs.getInt(4));
		ed.setHiredate(rs.getDate(5));
		ed.setSal(rs.getDouble(6));
		ed.setComm(rs.getDouble(7));
		ed.setDeptno(rs.getInt(8));
		return ed;
	}

}
