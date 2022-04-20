package com.ine.cartografia.entity;

import java.io.Serializable;
/**
 * Esta clase es DTO ResponseOk, para setter con la respuesta de web service
 * @author Rafael Quinto Zagal
 * @version 1.3.1
 * 
 */




public class ResponseOk implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param estatus
	 * @param resultado
	 * @param msj
	 * 
	 */
	private Integer estatus;
	private Contiene resultado;
	private String msj;

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Contiene getResultado() {
		return resultado;
	}

	public void setResultado(Contiene nombreArrayList) {
		this.resultado = nombreArrayList;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

}
