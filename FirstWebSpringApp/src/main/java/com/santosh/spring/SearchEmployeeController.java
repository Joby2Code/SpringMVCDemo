package com.santosh.spring;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class SearchEmployeeController {

	private EmpDAO empDAO;

	public SearchEmployeeController(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	public ModelAndView searchByEmpno(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int empno = Integer.parseInt(request.getParameter("searchKey"));
		System.out.println("I've reached the servlet");
		EmpDetails empDetails = empDAO.getEmployeeDetailsByEmpno(empno);
		System.out.println("the employee is "+empDetails.getName());
		return new ModelAndView("successSingleEmp", "empdetails", empDetails);
	}

	public ModelAndView searchByEname(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String ename = request.getParameter("searchKey");
		Collection empDetails = empDAO.getEmployeeDetailsByName(ename);
		return new ModelAndView("successMultipleEmps", "empdetails", empDetails);
	}

	public ModelAndView searchByJob(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String job = request.getParameter("searchKey");
		Collection empDetails = empDAO.getEmployeeDetailsByJob(job);
		return new ModelAndView("successMultipleEmps", "empdetails", empDetails);
	}

	public ModelAndView searchByDeptno(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int deptno = Integer.parseInt(request.getParameter("searchKey"));
		Collection empDetails = empDAO.getEmployeeDetailsByDeptno(deptno);
		return new ModelAndView("successMultipleEmps", "empdetails", empDetails);
	}

}
