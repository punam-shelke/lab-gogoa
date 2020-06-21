package services;
import java.time.temporal.ChronoUnit;

import model.*;
// Type your code
public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		if(hotel.getFromdate().isBefore(hotel.getTodate())) {
			long days = ChronoUnit.DAYS.between(hotel.getFromdate(), hotel.getTodate());
			if(hotel.getNoOfPersons() == 3) {
				hotel.setRoomType("double");
				hotel.setRoomType("single");
			}
			else if(hotel.getNoOfPersons() == 2) {
				hotel.setRoomType("double");
			}
			return booking(hotel.getNoOfPersons() , hotel.getRates()) *(days);
		}
		return 0;

	}
	public double book(Flight flight) {
		if(flight.getTo().isAfter(flight.getFrom())) {
			if(flight.getTriptype()=="round-trip") {
				return booking(flight.getNoOfPersons() , flight.getRates())*2;	
			}
			else {
					return booking(flight.getNoOfPersons() , flight.getRates());
			}	
		}
		return 0;
		
	}
	public double book(Train train) {
		return booking(train.getNoOfPersons() , train.getRates());
	}
	public double book(Bus bus) {
		return booking(bus.getNoOfPersons() , bus.getRates());
	}
}