package com.santosh.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.*;

@SuppressWarnings("deprecation")
public class LoginController extends AbstractCommandController {

	LoginModel loginModel;

	public void setLoginModel(LoginModel lm) {
		loginModel = lm;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req,
			HttpServletResponse res, Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		String type = loginModel.validation((UserDetails) command);
		System.out.println("Inside Servlet"+type);
		if (type == null) {
			throw new MyException("UserDetails are not valid");
			//return new ModelAndView("/login.jsp");

		} else if (type.equals("admin")) {
			return new ModelAndView("/AdminHome");
		} 
		else 
			return new ModelAndView("/UserHome");			

	}

}
