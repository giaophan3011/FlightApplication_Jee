package com.airline.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Passenger
 *
 */
@Entity
//We are create a table called Passenger
public class Passenger implements Serializable {
	@Transient
	//The interface Serializable has a property that represents all column in our db by serialVersionUID
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//The db takes care of auto generating ID for each row
	private Integer id;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	//without this annotation, the data written to db will be saved as digits.
	//example: Male: 0; Female:1
	@Enumerated(EnumType.STRING)
	private FlightClass flightClass;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", flightClass=" + flightClass + "]";
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public FlightClass getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(FlightClass flightClass) {
		this.flightClass = flightClass;
	}
}
