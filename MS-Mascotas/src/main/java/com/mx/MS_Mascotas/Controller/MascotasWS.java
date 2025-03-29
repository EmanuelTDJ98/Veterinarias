package com.mx.MS_Mascotas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MS_Mascotas.Entity.Mascotas;
import com.mx.MS_Mascotas.Service.MascotasServiceImp;

@RequestMapping("/Mascotas")
@CrossOrigin
@RestController
public class MascotasWS {
	@Autowired
	private MascotasServiceImp service;

	// listar
	// http://localhost:8089/Mascotas/listar
	@GetMapping("listar")
	public List<Mascotas> listar() {
		return service.listar();
	}

	// Buscar
	// http://localhost:8089/Mascotas/buscar
	@PostMapping("buscar")
	public Mascotas buscar(@RequestBody Mascotas mascota) {
		return service.buscar(mascota);

	}

	// Guardar
	// http://localhost:8089/Mascotas/guardar
	@PostMapping("guardar")
	public Mascotas guardar(@RequestBody Mascotas mascota) {
		return service.guardar(mascota);
	}

	// Editar
	// http://localhost:8089/Mascotas/editar
	@PutMapping("editar")
	public Mascotas editar(@RequestBody Mascotas mascotas) {
		return service.editar(mascotas);
	}

	// ELIMINAR
	// http://localhost:8089/Mascotas/eliminar
	@DeleteMapping("eliminar")
	public Mascotas eliminar(@RequestBody Mascotas mascota) {
		return service.eliminar(mascota);
	}
}