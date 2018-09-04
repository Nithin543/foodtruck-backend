package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="truck")
public class Truck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "truckId")
	private int id;
	
	@Column(name = "truckName")
	private String truckName;
	
	@Column(name = "truckLocation")
	private String truckLocation;
	
	@Column(name = "truckDistance")
	private String truckDistance;
	
	@Column(name = "truckCuisine")
	private String truckCuisine;

	public Truck() {
	}

	public Truck(String truckName, String truckLocation, String truckDistance, String truckCuisine) {
		this.truckName = truckName;
		this.truckLocation = truckLocation;
		this.truckDistance = truckDistance;
		this.truckCuisine = truckCuisine;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + ", truckName=" + truckName + ", truckLocation=" + truckLocation + ", truckDistance="
				+ truckDistance + ", truckCuisine=" + truckCuisine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckLocation() {
		return truckLocation;
	}

	public void setTruckLocation(String truckLocation) {
		this.truckLocation = truckLocation;
	}

	public String getTruckDistance() {
		return truckDistance;
	}

	public void setTruckDistance(String truckDistance) {
		this.truckDistance = truckDistance;
	}

	public String getTruckCuisine() {
		return truckCuisine;
	}

	public void setTruckCuisine(String truckCuisine) {
		this.truckCuisine = truckCuisine;
	}

}
