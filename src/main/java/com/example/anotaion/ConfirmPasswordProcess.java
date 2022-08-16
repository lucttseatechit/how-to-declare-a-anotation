package com.example.anotaion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.anotaion.entity.Person;

public class ConfirmPasswordProcess implements ConstraintValidator<ConfirmPassword, Person>{

	@Override
	public boolean isValid(Person value, ConstraintValidatorContext context) {
		return value.getConfirm().equals(value.getPassword());
	}

}
