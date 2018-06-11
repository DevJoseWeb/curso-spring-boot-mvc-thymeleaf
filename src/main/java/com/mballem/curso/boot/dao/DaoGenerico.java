package com.mballem.curso.boot.dao;

import java.util.List;

public interface DaoGenerico<T> {

	void save(T type);

	void update(T type);

	void delete(Long id);

	T findById(Long id);

	List<T> findAll();
}
