package com.mx.MS_Veterinarias.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MS_Veterinarias.Entity.Veterinarias;
import com.mx.MS_Veterinarias.Service.VeterinariasServiceImp;


@RestController
@RequestMapping("/Veterinarias")
@CrossOrigin
public class VeterinariasWS {
	@Autowired
	private VeterinariasServiceImp service;

	// listar
	// http://localhost:8066/Veterinarias/listar
	@GetMapping("listar")
	public List<Veterinarias> listar(){
		return service.listar();
	}

	// Buscar
	// http://localhost:8066/Veterinarias/buscar
	@PostMapping("buscar")
	public Veterinarias buscar(@RequestBody Veterinarias veterinaria) {
		return service.buscar(veterinaria);
		
	}

	// Guardar
	// http://localhost:8066/Veterinarias/guardar
	@PostMapping("guardar")
	public Veterinarias guardar(@RequestBody Veterinarias veterinaria) {
		return service.guardar(veterinaria);
	}

	// Editar
		// http://localhost:8066/Veterinarias/editar
		@PutMapping("editar")
		public Veterinarias editar(@RequestBody Veterinarias veterinaria) {
			return service.editar(veterinaria);
		}

		// ELIMINAR
		// http://localhost:8002/Sala/eliminar
		@DeleteMapping("eliminar")
		public Veterinarias eliminar(@RequestBody Veterinarias veterinaria) {
			return service.eliminar(veterinaria);
		}

}
