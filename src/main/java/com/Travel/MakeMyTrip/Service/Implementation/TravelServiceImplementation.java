package com.Travel.MakeMyTrip.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travel.MakeMyTrip.Model.Booking;
import com.Travel.MakeMyTrip.Model.Routes;
import com.Travel.MakeMyTrip.Repository.BookingInterface;
import com.Travel.MakeMyTrip.Repository.RoutesInterface;
import com.Travel.MakeMyTrip.Services.TravelsService;

@Service
public class TravelServiceImplementation implements TravelsService {
	
	@Autowired
	BookingInterface bookings;
	@Autowired
	RoutesInterface routesImp;

	@Override
	public Booking makeBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookings.save(booking);
	}

	@Override
	public List<Booking> viewAllBooking() {
		// TODO Auto-generated method stub
		return bookings.findAll();
	}

	@Override
	public Routes addRoute(Routes route) {
		// TODO Auto-generated method stub
		return  routesImp.save(route);
	}

	@Override
	public List<Routes> viewAllRoutes() {
		// TODO Auto-generated method stub
		return routesImp.findAll();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

}
