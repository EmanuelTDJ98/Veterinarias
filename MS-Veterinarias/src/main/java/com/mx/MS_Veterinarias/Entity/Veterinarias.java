package com.mx.MS_Veterinarias.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="VETERINARIAS")
public class Veterinarias {

	@Id
	@Column
	private Long idVeterinaria;
	@Column
	private String nombre;
	@Column
	private String direccion;
	@Column
	private Long telefono;
	
	public Veterinarias() {
	}

	public Veterinarias(Long idVeterinaria, String nombre, String direccion, Long telefono) {
		this.idVeterinaria = idVeterinaria;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Veterinarias [idVeterinaria=" + idVeterinaria + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}

	public Long getIdVeterinaria() {
		return idVeterinaria;
	}

	public void setIdVeterinaria(Long idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	
	
	

}
