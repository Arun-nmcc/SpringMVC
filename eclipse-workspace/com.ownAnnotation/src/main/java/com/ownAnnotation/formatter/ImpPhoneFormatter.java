package com.ownAnnotation.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.ownAnnotation.pojo.Phone;

public class ImpPhoneFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		String first = object.getCountryCode();
		String second = object.getPhoneNo();
		
		
		return first +"+"+second;
	}

	@Override
	public Phone parse(String no, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		String[] split = no.split("-");
		phone.setCountryCode(split[0]);
		phone.setPhoneNo(split[1]);
		
		
		
		return phone;
	}

}
