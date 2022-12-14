package com.example.anotaion;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD })
@Constraint(validatedBy = EighteenProcess.class)
public @interface Eighteen {
	//error message
	String message() default "Chưa đủ 18 tuổi";
	public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
