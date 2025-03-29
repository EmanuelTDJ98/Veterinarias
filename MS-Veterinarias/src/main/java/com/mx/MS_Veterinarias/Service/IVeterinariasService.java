package com.mx.MS_Veterinarias.Service;

import java.util.List;

import com.mx.MS_Veterinarias.Entity.Veterinarias;

public interface IVeterinariasService {
	public Veterinarias guardar(Veterinarias veterinaria);

	public Veterinarias editar(Veterinarias veterinaria);

	public Veterinarias eliminar(Veterinarias veterinaria);

	public Veterinarias buscar(Veterinarias veterinaria);

	public List<Veterinarias> listar();

}
