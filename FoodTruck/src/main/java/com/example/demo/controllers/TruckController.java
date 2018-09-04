package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Truck;
import com.example.demo.serviceDao.TruckServiceDao;

@RestController
@RequestMapping("/api")
public class TruckController {

	@Autowired
	private TruckServiceDao truckServiceDao;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping("/trucks")
	public List<Truck> getAllTrucks() {
		return truckServiceDao.getListOfTrucks();
	}

	@GetMapping("/trucks/{id}")
	public List<Menu> getMenuOfTruck(@PathVariable int id) {
		return truckServiceDao.getMenuByTruckId(id);
	}

}
