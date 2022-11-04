package controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Currency;

public class Bill {
	Date date;
	Currency currency;
	BigDecimal amount;
	//Credit cardNo;

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	

}
