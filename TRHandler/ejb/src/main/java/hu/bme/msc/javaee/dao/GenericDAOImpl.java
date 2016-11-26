package hu.bme.msc.javaee.dao;

import javax.ejb.Stateless;

@Stateless
public class GenericDAOImpl implements IGenericDAO {
	public String sayHello() {
		return "Hello World!";
	}
}
