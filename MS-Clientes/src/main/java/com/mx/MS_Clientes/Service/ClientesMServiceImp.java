package com.mx.MS_Clientes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mx.MS_Clientes.Dao.ClientesMDao;
import com.mx.MS_Clientes.Entity.ClientesM;

@Service
public class ClientesMServiceImp implements IClientesService {
	@Autowired
	private ClientesMDao dao;

	@Override
	public ClientesM guardar(ClientesM clientesM) {

		return dao.save(clientesM);
	}

	@Override
	public ClientesM editar(ClientesM clientesM) {
		ClientesM aux = this.buscar(clientesM);
		if (aux != null) {
			return dao.save(clientesM);
		}
		return null;
	}

	@Override
	public ClientesM eliminar(ClientesM clientesM) {
		ClientesM aux = this.buscar(clientesM);
		if (aux != null) {
			dao.delete(clientesM);
		}
		return null;
	}

	@Override
	public ClientesM buscar(ClientesM clientesM) {

		return dao.findById(clientesM.getIdClientesM()).orElse(null);
	}

	@Override
	public List<ClientesM> listar() {

		return dao.findAll(Sort.by(Direction.ASC, "idClientesM"));
	}

}
