package com.santosh.spring;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ArithmeticController extends MultiActionController {
	
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res) throws Exception{
		
		int op1=Integer.parseInt(req.getParameter("operand1"));
		int op2=Integer.parseInt(req.getParameter("operand2"));		
		int result=op1+op2;
		return new ModelAndView("/Home","result",result+"");
	}
	
public ModelAndView subtract(HttpServletRequest req,HttpServletResponse res) throws Exception{
		
		int op1=Integer.parseInt(req.getParameter("operand1"));
		int op2=Integer.parseInt(req.getParameter("operand2"));		
		int result=op1-op2;
		return new ModelAndView("/Home","result",result+"");
	}

}
