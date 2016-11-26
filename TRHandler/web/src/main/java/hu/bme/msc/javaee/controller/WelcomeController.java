package hu.bme.msc.javaee.controller;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import hu.bme.msc.javaee.dao.IGenericDAO;

@Named
@ViewScoped
public class WelcomeController {
	
	@EJB
	private IGenericDAO dao;
	
	public String sayHello(){
		return dao.sayHello();
	}
}
