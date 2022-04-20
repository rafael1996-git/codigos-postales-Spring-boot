package com.ine.cartografia.sevice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.ine.cartografia.entity.Entidad;


public interface IServiceDao extends JpaRepository<	Entidad, Integer>{


	@Query(value = "Select DISTINCT lpad(CAST(cp AS TEXT), 5, '0') as cod_postal from geoloc.codigo_dto where clave_entidad= ?1 order by lpad(CAST(cp AS TEXT), 5, '0')  ", nativeQuery = true)
	List<Object[]>  findByCp(int entidad);
	//@Query(value = "SELECT * FROM geoloc.colonia t where t.entidad = ?1 ", nativeQuery = true)

	@Query(value = "SELECT * FROM geoloc.entidad t where t.entidad = ?1 ", nativeQuery = true)
	Entidad findByDatosEntidad(int entidad);
	


	
	
	
}
