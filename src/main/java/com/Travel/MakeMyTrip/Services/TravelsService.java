package com.Travel.MakeMyTrip.Services;

import java.util.List;

import com.Travel.MakeMyTrip.Model.Booking;
import com.Travel.MakeMyTrip.Model.Routes;

public interface TravelsService {

	Booking makeBooking(Booking booking);
	List<Booking> viewAllBooking();
	Routes addRoute(Routes route);
	List<Routes> viewAllRoutes();
}
