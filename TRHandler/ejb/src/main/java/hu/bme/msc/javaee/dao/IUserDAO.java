package hu.bme.msc.javaee.dao;

import javax.ejb.Local;

import hu.bme.msc.javaee.model.User;

@Local
public interface IUserDAO extends IGenericDAO<User, String> {
	
}
