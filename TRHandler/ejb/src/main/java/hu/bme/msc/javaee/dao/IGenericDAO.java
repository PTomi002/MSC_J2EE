package hu.bme.msc.javaee.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

public interface IGenericDAO<T, ID extends Serializable> {
	T findId(ID id);

	void save(T entity);

	void flush();

	void close();

	EntityManager getEntityManager();
}
