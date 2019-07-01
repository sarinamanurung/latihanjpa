package com.eksad.latihanjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employe")

public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", nullable = false) 
	private String name;
	@Column(name = "address", nullable = false) 
	private String address;
	@Column(name = "dob", nullable = false) 
	private Date dbo;
	
	public int getId() {
		return id;

	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDbo() {
		return dbo;
	}
	public void setDbo(Date dbo) {
		this.dbo = dbo;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

