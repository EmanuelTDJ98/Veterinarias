package com.mx.MS_Clientes.Service;

import java.util.List;

import com.mx.MS_Clientes.Entity.ClientesM;

public interface IClientesService {
	public ClientesM guardar(ClientesM clientesM);

	public ClientesM editar(ClientesM clientesM);

	public ClientesM eliminar(ClientesM clientesM);

	public ClientesM buscar(ClientesM clientesM);

	public List<ClientesM> listar();
}
