package com.mx.MS_Clientes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MS_Clientes.Entity.ClientesM;
import com.mx.MS_Clientes.Service.ClientesMServiceImp;

@RestController
@RequestMapping("/ClientesM")
@CrossOrigin
public class ClientesMWS {
	@Autowired
	private ClientesMServiceImp service;

	// listar
	// http://localhost:8070/ClientesM/listar
	@GetMapping("listar")
	public List<ClientesM> listar() {
		return service.listar();
	}

	// Buscar
	// http://localhost:8070/ClientesM/buscar
	@PostMapping("buscar")
	public ClientesM buscar(@RequestBody ClientesM clientesM) {
		return service.buscar(clientesM);

	}

	// Guardar
	// http://localhost:8070/ClientesM/guardar
	@PostMapping("guardar")
	public ClientesM guardar(@RequestBody ClientesM clientesM) {
		return service.guardar(clientesM);
	}

	// Editar
	// http://localhost:8070/ClientesM/editar
	@PutMapping("editar")
	public ClientesM editar(@RequestBody ClientesM clientesM) {
		return service.editar(clientesM);
	}

	// ELIMINAR
	// http://localhost:8070/ClientesM/eliminar
	@DeleteMapping("eliminar")
	public ClientesM eliminar(@RequestBody ClientesM clientesM) {
		return service.eliminar(clientesM);
	}

}
