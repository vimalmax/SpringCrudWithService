package com.springDemo.services.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDemo.dao.GenericDao;
import com.springDemo.services.services;


@Service
public class ServiceImp implements services {

	@Autowired
	private GenericDao genericDao;
	
	public <E> void save(E e) {
		 genericDao.insert(e);
	}

	public <E> List<E> display(E e) {
		return genericDao.Display(e);
	}

	public <E> void delateById(E e) {
		genericDao.delateByID(e);
		
	}
	public <E> E update(E e, int id) {
		return genericDao.getDataId(e, id);
		
	}

}
