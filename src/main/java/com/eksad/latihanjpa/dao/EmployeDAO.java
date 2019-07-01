package com.eksad.latihanjpa.dao;

import java.util.List;

import com.eksad.latihanjpa.model.Employe;

public interface EmployeDAO {
	
	
	public List<Employe>getAll();
	public Employe getById(int id);
	public void save (Employe employe);
	
	public void update(Employe employe);
	
	

}
