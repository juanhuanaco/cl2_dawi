package com.huanacoquispe.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Area")
public class Area implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Area() {}
	
	public Area(Long id, String nombre, String jefe) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.jefe = jefe;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="jefe")
	String jefe;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}
}
