package com.Travel.MakeMyTrip.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Routes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "routeid_pk")
	private int routeId;
	@Column(name = "routeto")
	private String routeTo;
	@Column(name = "routefrom")
	private String routeFrom;
	@Column(name = "departuretime")
	private Date departureTime;
	@Column(name = "arrivaltime")
	private Date arrivalTime;
	@Column(name = "doj")
	private Date doj;
	@Column(name = "pickuppoint")
	private String pickupPoint;
	@Column(name = "fare")
	private double fare;
	public Routes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Routes(int routeId, String routeTo, String routeFrom, Date departureTime, Date arrivalTime, Date doj,
			String pickupPoint, double fare) {
		super();
		this.routeId = routeId;
		this.routeTo = routeTo;
		this.routeFrom = routeFrom;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.doj = doj;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getPickupPoint() {
		return pickupPoint;
	}
	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Routes [routeId=" + routeId + ", routeTo=" + routeTo + ", routeFrom=" + routeFrom + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", doj=" + doj + ", pickupPoint=" + pickupPoint
				+ ", fare=" + fare + "]";
	}

}
