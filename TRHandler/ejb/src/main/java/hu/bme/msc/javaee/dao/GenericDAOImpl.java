package hu.bme.msc.javaee.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GenericDAOImpl <T, ID extends Serializable> implements IGenericDAO <T, ID> {

	protected Logger LOGGER = LoggerFactory.getLogger(getClass());
	
    @PersistenceContext(unitName = "TRHandlerPU")
    protected EntityManager em;
	
    private final Class<T> clazz;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
        ParameterizedType parametrizedType = (ParameterizedType) getClass().getGenericSuperclass();
        clazz = (Class<T>) parametrizedType.getActualTypeArguments()[0];
	}
    
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(String persistanceUnit) {
	        ParameterizedType parametrizedType = (ParameterizedType) getClass().getGenericSuperclass();
	        clazz = (Class<T>) parametrizedType.getActualTypeArguments()[0];
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistanceUnit);
	        em = emf.createEntityManager();
	}

	@Override
	public T findId(ID id) {
		return em.find(clazz, id);
	}

	@Override
	public void save(T entity) {
		em.persist(entity);
	}

	@Override
	public void flush() {
		em.flush();
	}

	@Override
	public void close() {
		em.close();
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}
}
