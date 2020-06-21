package model;

import java.time.LocalDate;

//Type your code 
public class Flight{
	//Progression 1.1
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	//Progression 1.2
	//getter for noOfPersons
	public int getNoOfPersons(){
		return this.noOfPersons;
	}
	//setter for noOfPersons
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	//getter for classType
	public String getClassType() {
		return this.classType;
	}
	//setter for classType
	public void setClassType(String classType) {
		this.classType = classType;
	}
	//getter for rates
	public int getRates() {
		return this.rates;
	}
	//setter for rates
	public void setRates(int rates) {
		this.rates = rates;
	}
	//getter for from
	public LocalDate getFrom() {
		return this.from;
	}
	//setter for from
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	//getter for to
	public LocalDate getTo() {
		return this.to;
	}
	//setter for to
	public void setTo(LocalDate to) {
		this.to = to;
	}
	//getter for triptype
	public String getTriptype() {
		return this.triptype;
	}
	//setter for triptype
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	//progression 1.3
	 public Flight(int noOfPersons, int rates, String classtype, LocalDate from,LocalDate to,String triptype){
		 super();
		 this.noOfPersons = noOfPersons;
		 this.rates = rates;
		 this.from = from;
		 this.to = to;
		 this.triptype = triptype;
		 this.classType = classtype;
	 }
	 
}