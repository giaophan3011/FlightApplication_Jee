package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.airline.models.Passenger;

/**
 * Session Bean implementation class PassengerService
 */
@Stateless
@LocalBean
public class PassengerService {
	
    /**
     * Default constructor. 
     */
	
    public PassengerService() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName = "airline")
	//This annotation set Persistence context
	//the unitName should map to persistence unit name in persistence.xml.
	private EntityManager em;
    public void addPassenger(Passenger p){
    	em.persist(p);
    	//With the em.persist, the passenger p will be saved as a row in our Passenger table
    }
   
}
