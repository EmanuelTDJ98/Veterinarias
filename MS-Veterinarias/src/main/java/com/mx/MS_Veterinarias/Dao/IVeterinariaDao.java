package com.mx.MS_Veterinarias.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.MS_Veterinarias.Entity.Veterinarias;

@Repository
public interface IVeterinariaDao extends JpaRepository<Veterinarias, Long>{
	
}
