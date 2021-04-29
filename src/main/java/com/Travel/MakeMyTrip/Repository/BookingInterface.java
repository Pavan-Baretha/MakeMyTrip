package com.Travel.MakeMyTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travel.MakeMyTrip.Model.Booking;

public interface BookingInterface extends JpaRepository<Booking,Integer>{

}
