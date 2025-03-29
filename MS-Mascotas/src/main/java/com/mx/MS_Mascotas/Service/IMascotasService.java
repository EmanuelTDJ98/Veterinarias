package com.mx.MS_Mascotas.Service;

import java.util.List;

import com.mx.MS_Mascotas.Entity.Mascotas;

public interface IMascotasService {
	public Mascotas guardar(Mascotas mascota);

	public Mascotas editar(Mascotas mascota);

	public Mascotas eliminar(Mascotas mascota);

	public Mascotas buscar(Mascotas mascota);

	public List<Mascotas> listar();

}
