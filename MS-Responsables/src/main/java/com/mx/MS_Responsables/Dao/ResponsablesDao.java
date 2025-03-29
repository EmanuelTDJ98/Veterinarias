package com.mx.MS_Responsables.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.MS_Responsables.Entity.Responsables;
@Repository
public interface ResponsablesDao extends JpaRepository<Responsables, Long>{

}
