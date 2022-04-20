package com.ine.cartografia.entity;

import java.util.List;

public class Contiene {

	private String Nombre;
	private Integer Entidad;
	private Integer CPTotal;
	private  List<?> 	CP;
	public Contiene() {
		
	}
	public Contiene(String nombre, Integer entidad, Integer cPTotal, List<?> cP) {
		Nombre = nombre;
		Entidad = entidad;
		CPTotal = cPTotal;
		CP = cP;
	}
	@Override
	public String toString() {
		return "Contiene [Nombre=" + Nombre + ", Entidad=" + Entidad + ", CPTotal=" + CPTotal + ", CP=" + CP + "]";
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getEntidad() {
		return Entidad;
	}
	public void setEntidad(Integer entidad) {
		Entidad = entidad;
	}
	public Integer getCPTotal() {
		return CPTotal;
	}
	public void setCPTotal(Integer cPTotal) {
		CPTotal = cPTotal;
	}
	public List<?> getCP() {
		return CP;
	}
	public void setCP(List<?> cP) {
		CP = cP;
	}
	
	
	
}
