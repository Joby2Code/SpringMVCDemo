package com.santosh.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class c) {
		// TODO Auto-generated method stub
		return c.equals(UserDetails.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UserDetails ud = (UserDetails) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uname",
				"field.required", "The username cannot be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pass",
				"field.required", "The password cannot be empty");
		if (ud.getPass() != null && ud.getPass().length() < 2) {
			errors.rejectValue("pass", "field.minlength",
					new Object[] { Integer.valueOf(2) },
					"Password minimum is 3");
		}
	}

}
