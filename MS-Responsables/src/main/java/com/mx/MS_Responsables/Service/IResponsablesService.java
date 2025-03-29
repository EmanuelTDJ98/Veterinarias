package com.mx.MS_Responsables.Service;

import java.util.List;

import com.mx.MS_Responsables.Entity.Responsables;

public interface IResponsablesService {
	public Responsables guardar(Responsables responsable);

	public Responsables editar(Responsables responsable);

	public Responsables eliminar(Responsables responsable);

	public Responsables buscar(Responsables responsable);

	public List<Responsables> listar();
}
