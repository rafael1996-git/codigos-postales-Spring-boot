package com.ine.cartografia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidad", schema = "geoloc")
public class Entidad implements java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer  entidad ;
	   private String nombre ;
	   
	   @Id

		@Column(name = "entidad", unique = true, nullable = false)
	public Integer getEntidad() {
		return entidad;
	}
	   
	public void setEntidad(Integer entidad) {
		this.entidad = entidad;
	}
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Entidad(Integer entidad, String nombre) {
		this.entidad = entidad;
		this.nombre = nombre;
	}
	public Entidad() {
	
		// TODO Auto-generated constructor stub
	}
	  
}
