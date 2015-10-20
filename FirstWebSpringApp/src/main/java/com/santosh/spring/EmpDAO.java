package com.santosh.spring;

import java.util.Collection;

public interface EmpDAO {
	Collection getAllEmployeeDetails();
	EmpDetails getEmployeeDetailsByEmpno(int empno);
	Collection getEmployeeDetailsByName(String name);
	Collection getEmployeeDetailsByDeptno(int deptno);
	Collection getEmployeeDetailsByJob(String job);

}
