package com.ine.cartografia.sevice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ine.cartografia.entity.Entidad;

public interface IServiceEntiDao extends JpaRepository<Entidad, Integer>{
	@Query(value = "SELECT * FROM geoloc.entidad t where t.entidad = ?1 ", nativeQuery = true)
	Entidad findByDatosEntidad(int entidad);
	
	
}
