package hu.bme.msc.javaee.dao;

import javax.ejb.Stateless;

import hu.bme.msc.javaee.model.User;

@Stateless
public class UserDAOImpl extends GenericDAOImpl<User, String> implements IUserDAO{

	public UserDAOImpl(String persistanceUnit) {
		super(persistanceUnit);
	}
	
	public UserDAOImpl() {
		super();
	}
}
