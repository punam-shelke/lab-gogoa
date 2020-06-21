package model;
// Type your code
import java.time.LocalDate;
public class Hotel{
	//progression 2.1 , 2.2 ,2.3 ,2.4
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	//progression 2.5
	//getter for noOfPersons
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	//setter for noOfPersons
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	//getter for roomType
	public String getRoomType() {
		return this.roomType;
	}
	//setter for roomType
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	//getter for rates
	public int getRates() {
		return this.rates;
	}
	//setter for rates
	public void setRates(int rates) {
		this.rates = rates;
	}
	//getter for occupancy
	public String getOccupancy() {
		return this.occupancy;
	}
	//setter for occupancy
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	//getter for fromdate
	public LocalDate getFromdate() {
		return this.fromdate;
	}
	//setter for fromdate
	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	//getter for todate
	public LocalDate getTodate() {
		return this.todate;
	}
	//setter for todate
	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	//progression 2.6
	public Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate) {
		this.noOfPersons = noOfPersons;
		this.roomType = roomType;
		this.rates = rates;
		this.occupancy = occupancy;
		this.fromdate = fromdate;
		this.todate = todate;
	}
}