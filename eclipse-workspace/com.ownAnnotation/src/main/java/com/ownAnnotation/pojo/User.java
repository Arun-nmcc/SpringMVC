package com.ownAnnotation.pojo;



import com.ownAnnotation.annotation.PinValidator;

public class User {
	static {
		System.out.println("inside user class");
	}
	@javax.validation.constraints.NotEmpty
private String name;
	private Phone phone;
	private Credit card;
	@PinValidator
	private String pin;
	
	
	public Credit getCard() {
		return card;
	}

	public void setCard(Credit card) {
		this.card = card;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
		
	public Phone getPhone() {
		return phone;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
	

}
