package com.huanacoquispe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Personal")
public class Personal {
	
	private static final long serialVersionUID = 1L;
	
	public Personal() {}
	
	public Personal(Long id, String nombre, Double sueldo, Area area) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.area = area;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="sueldo")
	Double sueldo;
	
	@ManyToOne
	@JoinColumn(name="id_area")
	Area area;

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

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
	
	
}
