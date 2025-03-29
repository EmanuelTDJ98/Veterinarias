package com.mx.MS_Clientes.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.MS_Clientes.Entity.ClientesM;

@Repository
public interface ClientesMDao extends JpaRepository<ClientesM, Long>{

}
