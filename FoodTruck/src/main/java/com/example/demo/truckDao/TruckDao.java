package com.example.demo.truckDao;

import java.util.List;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Truck;

public interface TruckDao {
	public List<Truck> getListOfTrucks();
	public List<Menu>  getMenuByTruckId(int id);
}
