package com.mx.MS_Veterinarias.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mx.MS_Veterinarias.Dao.IVeterinariaDao;
import com.mx.MS_Veterinarias.Entity.Veterinarias;

@Service
public class VeterinariasServiceImp implements IVeterinariasService {

	@Autowired
	private IVeterinariaDao dao;

	@Override
	public Veterinarias guardar(Veterinarias veterinaria) {

		return dao.save(veterinaria);
	}

	@Override
	public Veterinarias editar(Veterinarias veterinaria) {
		Veterinarias aux = this.buscar(veterinaria); 
		if (aux != null) {
			return dao.save(veterinaria);
		}
		return null;
	}

	@Override
	public List<Veterinarias> listar() {

		return dao.findAll(Sort.by(Direction.ASC, "idVeterinaria"));
	}

	@Override
	public Veterinarias eliminar(Veterinarias veterinaria) {
		Veterinarias aux = this.buscar(veterinaria);
		if(aux != null) {
			dao.delete(aux);
			return aux;
		}
		return null;
	}

	@Override
	public Veterinarias buscar(Veterinarias veterinaria) {
		
		return dao.findById(veterinaria.getIdVeterinaria()).orElse(null);
	}

}
