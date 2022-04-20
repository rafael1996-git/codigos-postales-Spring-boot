package com.ine.cartografia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ine.cartografia.entity.Contiene;
import com.ine.cartografia.entity.Entidad;
import com.ine.cartografia.entity.ResponseOk;
import com.ine.cartografia.sevice.IServiceDao;
import com.ine.cartografia.sevice.IServiceEntiDao;

@RestController()
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Controlador {
	

	@Autowired
	private IServiceDao Service;
	
	@Autowired
	private IServiceEntiDao ServiceEnti;
	
	/**
	 * Metodo que brinda el servicio de la consulta de Cp con parametros clave_entidad tipo GET
	 * 
	 * 
	 * http://localhost:8080/WebServiceCpEntidad/ClaveEntidad/1
	 * 
	 * 
	 * @param clave_entidad 
	 * @return retorna la lista 
	 * @throws Exception si no logra obtener la conexion
	 */
	 
	 
	 @GetMapping(value = "/ClaveEntidad/{CLAVE}")
		public List<ResponseOk>  getCorreo2(@PathVariable  int CLAVE)throws Exception{
			
			 System.out.println(CLAVE);
			 List<Object[]>  resultcp= Service.findByCp(CLAVE);
			 Entidad en =ServiceEnti.findByDatosEntidad(CLAVE);
			 List<ResponseOk> control = new ArrayList<ResponseOk>();
				ResponseOk reponse = new ResponseOk();
				try {
					 if (resultcp !=null||en!=null) {
							if (resultcp.isEmpty()) {
								reponse.setEstatus(400);
								reponse.setResultado(null);
								
								reponse.setMsj("Operacion 400:  No se encontro resultado");
								control.add(reponse);

							} else{
						        Contiene dato=new Contiene();

								 
						        	dato.setNombre(en.getNombre());
						        	dato.setEntidad(CLAVE);
						        	dato.setCPTotal(resultcp.size());
						        	dato.setCP(resultcp);
						        	reponse.setEstatus(200);
									reponse.setResultado(dato);
									reponse.setMsj("Operacion Exitosa 200");
									control.add(reponse);
								
							}

						} else {
							System.out.println("ERROR2 no se ah encontrado resultado");
							reponse.setEstatus(500);
							reponse.setMsj(Response.serverError().toString());
							control.add(reponse);

						}
					 
					 return control;
				} catch (Exception e) {
					throw new ResponseStatusException(
					           HttpStatus.NOT_FOUND, " not found");
				}
}
	 
}
