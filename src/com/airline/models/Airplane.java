package com.airline.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Airplan
 *
 */
@Entity

public class Airplane implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Airplane() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String planeMaker; 
	
	private String modelName;
	
	private Integer seatingCapacity;
	
	@OneToOne(mappedBy= "planeDetails")
	private Flight flight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaneMaker() {
		return planeMaker;
	}

	public void setPlaneMaker(String planeMaker) {
		this.planeMaker = planeMaker;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Airplane [id=" + id + ", planeMaker=" + planeMaker + ", modelName=" + modelName + ", seatingCapacity="
				+ seatingCapacity + "]";
	}
	
	
}
