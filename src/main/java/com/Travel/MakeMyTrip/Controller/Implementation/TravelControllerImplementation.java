//here is the controller class where we make Rest API
package com.Travel.MakeMyTrip.Controller.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Travel.MakeMyTrip.Controllers.TravelController;
import com.Travel.MakeMyTrip.Model.Booking;
import com.Travel.MakeMyTrip.Model.Routes;
import com.Travel.MakeMyTrip.Services.TravelsService;
//here is the controller which is used to mapping
@RestController
public class TravelControllerImplementation implements TravelController{

	@Autowired
	TravelsService travelService;
	@Override
	@PostMapping("makeBooking")
	public Booking makeBooking(Booking booking) {
		// TODO Auto-generated method stub
		return travelService.makeBooking(booking);
	}

	@Override
	@GetMapping("viewAllBooking")
	public List<Booking> viewAllBooking() {
		// TODO Auto-generated method stub
		return travelService.viewAllBooking();
	}

	@Override
	@PostMapping("addRoute")
	public Routes addRoute(Routes route) {
		// TODO Auto-generated method stub
		return travelService.addRoute(route);
	}

	@Override
	public List<Routes> viewAllRoutes() {
		// TODO Auto-generated method stub
		return travelService.viewAllRoutes();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

}
