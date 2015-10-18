package com.santosh.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmpValidator implements Validator{

	@Override
	public boolean supports(Class c) {
		// TODO Auto-generated method stub
		return c.equals(EmpDetails.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
	EmpDetails ud=(EmpDetails)target;	
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"field.required", "The username cannot be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "job",
				"field.required", "The password cannot be empty");
		if (ud.getDeptno()> 10 && ud.getDeptno()< 99) {
			errors.rejectValue("deptno", "field.minlength",
					new Object[] { Integer.valueOf(99) },
					"Value should be between 10 to 99");
		}
		
	}

}
