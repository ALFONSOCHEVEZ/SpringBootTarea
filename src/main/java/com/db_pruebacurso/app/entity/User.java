///// Espinoza Chevez Alfonso
package com.db_pruebacurso.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "users")
public class User implements Serializable {
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////

	private static final long serialVersionUID = -3910449336070592149L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String name;
	
	//@Column(name ="surname",nullable=false)
	private String surname;
	
	@Column(name ="mail",nullable=false,length = 50, unique = true)
	private String email;
	
	//@Column(name ="enabled",nullable=false,length = 50)
	private Boolean enabled;
	
    /////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
	

}
///// Espinoza Chevez Alfonso