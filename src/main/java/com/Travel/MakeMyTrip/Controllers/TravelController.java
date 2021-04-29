package com.Travel.MakeMyTrip.Controllers;

import java.util.List;

import com.Travel.MakeMyTrip.Model.Booking;
import com.Travel.MakeMyTrip.Model.Routes;


public interface TravelController {

	Booking makeBooking(Booking booking);
	List<Booking> viewAllBooking();
	Routes addRoute(Routes route);
	List<Routes> viewAllRoutes();

}
