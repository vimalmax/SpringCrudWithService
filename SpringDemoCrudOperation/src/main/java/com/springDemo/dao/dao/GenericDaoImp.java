package com.springDemo.dao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springDemo.dao.GenericDao;

@Repository
public class GenericDaoImp implements GenericDao {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public <E> void insert(E e) {
		entityManager = entityManager.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.getTransaction().commit();
	}

	@Transactional
	public <E> List<E> Display(E e) {
		String a = e.getClass().getName();
		String name = a.substring(a.lastIndexOf(".") + 1);
		return entityManager.createQuery("from " + name).getResultList();
	}

	@Transactional
	public <E> void delateByID(E e) {
		entityManager = entityManager.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.merge(e));
		entityManager.getTransaction().commit();
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public <E> E getDataId(E e, int id) {
		return ((E) entityManager.find(e.getClass(),id));
	}

	

	
}
