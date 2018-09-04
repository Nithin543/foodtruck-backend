package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "itemId")	
	private int itemId;
	
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "itemPrice")
	private float itemPrice;
	
	@Column(name = "itemTimeToCook")
	private String itemTimeToCook;
	
	@Column(name = "itemTimeToDeliver")
	private String itemTimeToDeliver;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="itemTruckId")
	private Truck truck;

	public Menu() {
	}

	public Menu(String itemName, float itemPrice, String itemTimeToCook, String itemTimeToDeliver, Truck truck) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemTimeToCook = itemTimeToCook;
		this.itemTimeToDeliver = itemTimeToDeliver;
		this.truck = truck;
	}

	@Override
	public String toString() {
		return "Menu [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", timeToCook="
				+ itemTimeToCook + ", timeToDeliver=" + itemTimeToDeliver + ", truck=" + truck + "]";
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getTimeToCook() {
		return itemTimeToCook;
	}

	public void setTimeToCook(String itemTimeToCook) {
		this.itemTimeToCook = itemTimeToCook;
	}

	public String getTimeToDeliver() {
		return itemTimeToDeliver;
	}

	public void setTimeToDeliver(String itemTimeToDeliver) {
		this.itemTimeToDeliver = itemTimeToDeliver;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
