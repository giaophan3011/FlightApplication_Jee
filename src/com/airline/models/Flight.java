package com.airline.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */
@Entity

public class Flight implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	@Enumerated (EnumType.STRING)
	private FlightDestinations flightOrigin;
	@Enumerated (EnumType.STRING)
	private FlightDestinations flightDestination;
	
	@OneToOne
	@JoinColumn (name = "airplane_fk")
	//This column will be created in Airplane.java entity, that will store the ID of the airplane.
	private Airplane planeDetails;
	private Integer price;
	@Temporal (TemporalType.TIMESTAMP)
	private Date flightTime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Airplane getPlaneDetails() {
		return planeDetails;
	}
	public void setPlaneDetails(Airplane planeDetails) {
		this.planeDetails = planeDetails;
	}
	public FlightDestinations getFlightOrigin() {
		return flightOrigin;
	}
	public void setFlightOrigin(FlightDestinations flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	public FlightDestinations getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(FlightDestinations flightDestination) {
		this.flightDestination = flightDestination;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightOrigin=" + flightOrigin + ", flightDestination=" + flightDestination
				+ ", price=" + price + ", flightTime=" + flightTime + "]";
	}   
}
