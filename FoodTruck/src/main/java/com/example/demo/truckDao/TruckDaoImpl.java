package com.example.demo.truckDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Truck;

@Repository
public class TruckDaoImpl implements TruckDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Truck> getListOfTrucks() {
		Session session = sessionFactory.getCurrentSession();
		Query<Truck> query = session.createQuery("from Truck",Truck.class);
		return query.getResultList();
	}

	@Override
	public List<Menu> getMenuByTruckId(int id) {
		Session session = sessionFactory.openSession();
	    @SuppressWarnings("unchecked")
		Query<Menu> query = session.createQuery("from Menu where Truck.truckid =:id");
	    query.setParameter("id", id);
	    return query.getResultList();
	}

}
