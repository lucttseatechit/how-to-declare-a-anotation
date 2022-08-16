package com.example.anotaion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EighteenProcess implements ConstraintValidator<Eighteen,Integer>{

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value>=18;
	}

}
