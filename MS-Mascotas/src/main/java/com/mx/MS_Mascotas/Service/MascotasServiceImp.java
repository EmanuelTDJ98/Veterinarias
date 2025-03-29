package com.mx.MS_Mascotas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mx.MS_Mascotas.Dao.MascotasDao;
import com.mx.MS_Mascotas.Entity.Mascotas;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MascotasServiceImp implements IMascotasService {
	@Autowired
	private MascotasDao dao;

	@Override
	public Mascotas guardar(Mascotas mascota) {

		return dao.save(mascota);
	}

	@Override
	public Mascotas editar(Mascotas mascota) {
		Mascotas aux = this.buscar(mascota);
		if (aux != null) {
			return dao.save(mascota);
		}
		return null;
	}

	@Override
	public Mascotas eliminar(Mascotas mascota) {
		Mascotas aux = this.buscar(mascota);
		if (aux != null) {
			dao.delete(mascota);
		}
		return null;
	}

	@Override
	public Mascotas buscar(Mascotas mascotas) {

		return dao.findById(mascotas.getIdMascotas()).orElse(null);
	}

	@Override
	public List<Mascotas> listar() {

		return dao.findAll(Sort.by(Direction.ASC, "idMascotas"));
	}

}
