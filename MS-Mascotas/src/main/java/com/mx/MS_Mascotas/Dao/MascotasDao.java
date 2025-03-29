package com.mx.MS_Mascotas.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.MS_Mascotas.Entity.Mascotas;

@Repository
public interface MascotasDao extends JpaRepository<Mascotas, Long> {

}
