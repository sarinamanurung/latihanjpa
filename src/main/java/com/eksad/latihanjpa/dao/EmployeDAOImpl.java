package com.eksad.latihanjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.eksad.latihanjpa.model.Employe;


@Repository
public class EmployeDAOImpl  implements EmployeDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Employe> getAll() {
		return entityManager.createQuery("selct e from Employe e", Employe.class).getResultList();
	}
	
	@Override
	public Employe getById(int id) {
		return entityManager.find(Employe.class, id);
	}
	
	@Transactional
	@Override
	public void save(Employe employe) {
		entityManager.persist(employe);
		
		
	}
	@Transactional
	@Override
	public void update(Employe employe) {
		entityManager.merge(employe);
		
	}
	@Override
	public List<Employe>getByName (String name) {
		return entityManager.createNativeQuery("SELECT * FROM employe WHERE ")
		return entityManager.createQuery("select e from employe e where e.name")
		
	}

}
