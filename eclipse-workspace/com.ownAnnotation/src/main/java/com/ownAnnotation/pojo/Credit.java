package com.ownAnnotation.pojo;

import com.ownAnnotation.annotation.PinValidator;

@PinValidator
public class Credit {
	private String firstNO;
	private String secondNO;
	private String thirdNO;
	private String fourthNO;

	public String getFirstNO() {
		return firstNO;
	}

	public void setFirstNO(String firstNO) {
		this.firstNO = firstNO;
	}

	public String getSecondNO() {
		return secondNO;
	}

	public void setSecondNO(String secondNO) {
		this.secondNO = secondNO;
	}

	public String getThirdNO() {
		return thirdNO;
	}

	public void setThirdNO(String thirdNO) {
		this.thirdNO = thirdNO;
	}

	public String getFourthNO() {
		return fourthNO;
	}

	public void setFourthNO(String fourthNO) {
		this.fourthNO = fourthNO;
	}

	@Override
	public String toString() {
		return firstNO + "" + secondNO + "" + thirdNO + "" + fourthNO;
	}

}
