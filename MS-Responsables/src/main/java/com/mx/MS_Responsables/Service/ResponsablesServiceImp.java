package com.mx.MS_Responsables.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mx.MS_Responsables.Dao.ResponsablesDao;
import com.mx.MS_Responsables.Entity.Responsables;

@Service
public class ResponsablesServiceImp implements IResponsablesService {
	@Autowired
	private ResponsablesDao dao;

	@Override
	public Responsables guardar(Responsables responsable) {

		return dao.save(responsable);
	}

	@Override
	public Responsables editar(Responsables responsable) {
		Responsables res = this.buscar(responsable);
		if (res != null) {
			return dao.save(res);
		}
		return null;
	}

	@Override
	public Responsables eliminar(Responsables responsable) {
		Responsables aux = this.buscar(responsable);
		if (aux != null) {
			dao.delete(responsable);
		}
		return null;
	}

	@Override
	public Responsables buscar(Responsables responsable) {

		return dao.findById(responsable.getIdResponsable()).orElse(null);
	}

	@Override
	public List<Responsables> listar() {

		return dao.findAll(Sort.by(Direction.ASC, "idResponsable"));
	}

}
