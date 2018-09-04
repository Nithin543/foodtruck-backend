package com.example.demo.serviceDao;

import java.util.List;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Truck;

public interface TruckServiceDao {
	public List<Truck> getListOfTrucks();
	public List<Menu>  getMenuByTruckId(int id);
}
