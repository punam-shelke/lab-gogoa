package model;
// Type your code
import java.time.LocalDate;
//progression 3.1
public class Train{
	//progression 3.2
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	//getter for noOfPersons
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	//setter for noOfPersons
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public  Train(int noOfPersons, int rates, String berth, LocalDate date) {
		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.berth = berth;
		this.date = date;
	}


}
