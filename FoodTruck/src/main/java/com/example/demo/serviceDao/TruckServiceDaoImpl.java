package com.example.demo.serviceDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Truck;
import com.example.demo.truckDao.TruckDao;

@Service
public class TruckServiceDaoImpl implements TruckServiceDao{
	
	@Autowired
	private TruckDao truckDao;

	@Override
	@Transactional
	public List<Truck> getListOfTrucks() {
		return truckDao.getListOfTrucks();
	}

	@Override
	@Transactional
	public List<Menu> getMenuByTruckId(int id) {
		return truckDao.getMenuByTruckId(id);
	}

}
