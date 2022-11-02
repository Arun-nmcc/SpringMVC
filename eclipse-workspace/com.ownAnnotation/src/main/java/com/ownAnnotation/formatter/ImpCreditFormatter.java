package com.ownAnnotation.formatter;

import java.text.ParseException;

import java.util.Locale;

import org.springframework.format.Formatter;

import com.ownAnnotation.pojo.Credit;

public class ImpCreditFormatter implements Formatter<Credit> {

	@Override
	public String print(Credit card, Locale locale) {
		// TODO Auto-generated method stub
		String first = card.getFirstNO();
		String second = card.getSecondNO();
		String thrid = card.getThirdNO();
	String fourth = card.getFirstNO();
	
		return first+""+second+""+thrid+""+fourth;
		
	}

	@Override
	public Credit parse(String str, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		Credit credit = new Credit();
		
		if (str.length() == 16) {
			
			credit.setFirstNO(str.substring(0, 4));
			credit.setSecondNO(str.substring(4, 8));
			credit.setThirdNO(str.substring(8, 12));
			credit.setFourthNO(str.substring(12, 16));
			System.out.println(str.substring(0, 4));
			System.out.println(str.substring(4, 8));
			System.out.println(str.substring(8, 12));
			System.out.println(str.substring(12, 16));

			
		}else if(str.length() == 20) {
			String[] split = str.split("-");
			credit.setFirstNO(split[0]);
			credit.setSecondNO(split[1]);
			credit.setThirdNO(split[2]);
			credit.setFirstNO(split[3]);
			
		}
		return credit;

	}

}
