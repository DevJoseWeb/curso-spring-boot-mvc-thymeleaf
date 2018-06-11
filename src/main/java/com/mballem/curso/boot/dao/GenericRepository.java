package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GenericRepository<T> extends AbstractDao<T, Long> implements DaoGenerico<T> {

}
