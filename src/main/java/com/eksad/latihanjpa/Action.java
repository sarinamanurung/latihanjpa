package com.eksad.latihanjpa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.bind.ParseConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eksad.latihanjpa.dao.EmployeDAO;
import com.eksad.latihanjpa.model.Employe;

import antlr.SemanticException;

@Configuration
public class Action {
	@Autowired
	EmployeDAO employeDAO;
	
	@Bean
	
	public List<Employe> getAll(){
		List<Employe> employes = employeDAO.getAll();
		
		for (Employe employe : employes) {
			System.out.println("ID : " + employe.getId());
			System.out.println("Name : " + employe.getName());
			System.out.println("Address : " + employe.getAddress());
			System.out.println("Dob : " + employe.getDbo());
			System.out.println("==========================");		
			
			}
		return employes;
	}
	
	@Bean
	public Employe getById() {
		Employe employe = employeDAO.getById(12);
		System.out.println("Get bY ID 12");
		System.out.println("ID : " + employe.getId());
		System.out.println("Name : " + employe.getName());
		System.out.println("Address : " + employe.getAddress());
		System.out.println("Dob : " + employe.getDbo());
		System.out.println("==========================");	
	}
	@Bean
	public boolean save() {
		try {
			Employe employe = new Employe();
			employe.setName("Sepmin");
			employe.setAddress("jakarta");
			String dateString ="1996-08-27";
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			
			employeDAO.save(employe);
System.out.println("Data Berhasil Tersimpan");
return true;
		} catch (Exception e) {
			System.out.println("Data Gagal Tersimpan");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean update() {
		try {
			Employe employe = new Employe();
			employe.setName("Sepmin");
			employe.setAddress("jakarta");
			String dateString ="1996-08-27";
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			
			employeDAO.update(employe);
System.out.println("Data Berhasil Tersimpan");
		
		}
	}
}
