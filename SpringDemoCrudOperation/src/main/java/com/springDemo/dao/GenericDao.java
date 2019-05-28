package com.springDemo.dao;

import java.util.List;

public interface GenericDao{

	<E> void insert(E e);
	
	<E> List<E> Display(E e);
	
	<E> void delateByID(E e);
	
	<E> E getDataId(E e,int id);
	
}
