package com.ownAnnotation.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PinValidatorImp implements ConstraintValidator<PinValidator, String> {
	@Override
	public void initialize(PinValidator constraintAnnotation) {
		// TODO Auto-generated method stub
		System.out.println("indise pinvaldato intitialize mehod");

	}

	@Override
	public boolean isValid(String pin, ConstraintValidatorContext context) {
		System.out.println("indise pinvaldato isvalid method");

		// TODO Auto-generated method stub
		int length = pin.length();
		System.out.println(length);
		if (length == 20 || length == 16) {
			return true;
		}
			/*String[] split = pin.split("-");
			if (split.length == 4 || split.length == 0) {

				for (int i = 0; i < pin.length(); i++) {
					if (pin.charAt(i) < '0' || pin.charAt(i) > '9') {

						return false;

					}

				}

				for (int i = 0; i < split.length; i++) {
					if (split[0].length() != 4)
						return false;
				}

				return true;
			}
		}*/
		return false;
		
	}

}
