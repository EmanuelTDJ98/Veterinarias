package com.mx.MS_Responsables.Controller;

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

import com.mx.MS_Responsables.Entity.Responsables;
import com.mx.MS_Responsables.Service.ResponsablesServiceImp;

@RestController
@RequestMapping("/Responsables")
@CrossOrigin
public class ResponsablesWS {
	@Autowired
	private ResponsablesServiceImp service;

	// listar
	// http://localhost:8089/Mascotas/listar
	@GetMapping("listar")
	public List<Responsables> listar() {
		return service.listar();
	}

	// Buscar
		// http://localhost:8089/Mascotas/buscar
		@PostMapping("buscar")
		public Responsables buscar(@RequestBody Responsables responsable) {
			return service.buscar(responsable);

		}

		// Guardar
		// http://localhost:8089/Mascotas/guardar
		@PostMapping("guardar")
		public Responsables guardar(@RequestBody Responsables responsable) {
			return service.guardar(responsable);
		}

		// Editar
		// http://localhost:8089/Mascotas/editar
		@PutMapping("editar")
		public Responsables editar(@RequestBody Responsables responsable) {
			return service.editar(responsable);
		}

		// ELIMINAR
		// http://localhost:8089/Mascotas/eliminar
		@DeleteMapping("eliminar")
		public Responsables eliminar(@RequestBody Responsables responsable) {
			return service.eliminar(responsable);
		}

}
