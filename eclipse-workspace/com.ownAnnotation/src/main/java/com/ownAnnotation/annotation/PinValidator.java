package com.ownAnnotation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
@Constraint(validatedBy = PinValidatorImp.class)

public @interface PinValidator {
	 
	String message() default "{pin}";
	  
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	

}
