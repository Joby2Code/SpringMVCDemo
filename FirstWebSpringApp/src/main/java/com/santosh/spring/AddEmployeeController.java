package com.santosh.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")
public class AddEmployeeController extends SimpleFormController{

	EmployeeServices employeeServices;
	
	public void setEmployeeServices(EmployeeServices es)
	{
		this.employeeServices=es;
	}
	
	public void doSubmitAction(Object command) throws Exception{
		employeeServices.create((EmpDetails) command);
	}

	
}
