package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.CargoDao;
import com.mballem.curso.boot.dao.GenericRepository;
import com.mballem.curso.boot.domain.Cargo;

@Service
@Transactional
public class CargoService implements ServiceGenerico<Cargo> {

	@Autowired
	private CargoDao dao;
	
	@Autowired
	private GenericRepository<Cargo> repository;

	@Override
	public void salvar(Cargo obj) {
		dao.save(obj);
	}

	@Override
	public void editar(Cargo obj) {
		dao.update(obj);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}
}
