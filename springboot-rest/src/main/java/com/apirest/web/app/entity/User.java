package com.apirest.web.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "users")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -117874756535765765L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String name;

	private String surname;
	
	@Column(name="mail", nullable = false, length = 50, unique = true )
	@NotEmpty(message = "Debe ingresar un Email")
	@Email(message = "Debe ingresar un Email valido")
	private String email;
	
	private Boolean enabled;

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
	
	
}
