package com.springDemo.services;

import java.util.List;

public interface services {

	<E> void save(E e);

	<E> List<E> display(E e);

	<E> void delateById(E e);

	<E> E update(E e, int id);

}
