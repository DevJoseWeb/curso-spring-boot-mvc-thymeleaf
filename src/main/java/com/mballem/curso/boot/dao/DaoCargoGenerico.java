package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;

public interface DaoCargoGenerico{

	void save(Cargo obj);

	void update(Cargo obj);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
