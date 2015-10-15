package com.santosh.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	LoginModel loginModel;

	public void setLoginModel(LoginModel lm) {
		loginModel = lm;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		String type = loginModel.validation(uname, pass);
		if (type == null) {
			throw new MyException("UserDetails are not valid");
			//return new ModelAndView("/login.jsp");

		} else if (type.equals("admin")) {
			return new ModelAndView("/AdminHome.jsp");
		} else
			return new ModelAndView("/UserHome.jsp");

	}

}
