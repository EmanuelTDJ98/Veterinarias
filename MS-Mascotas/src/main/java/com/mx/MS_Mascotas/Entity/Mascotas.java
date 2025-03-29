package com.mx.MS_Mascotas.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "MASCOTAS")
public class Mascotas {
	
	@Id
	@Column
	private Long idMascotas;
	@Column
	private String nombre;
	@Column
	private String raza;
	@Column
	private int edad;
	@Column
	private String razonCita;
	@Column
	private Long clienteId;
	@Column
	private Long responsableId;
	@Column
	private Long veterinariaId;
	
	public Mascotas() {
	}

	public Mascotas(Long idMascotas, String nombre, String raza, int edad, String razonCita, Long clienteId,
			Long responsableId, Long veterinariaId) {
		this.idMascotas = idMascotas;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.razonCita = razonCita;
		this.clienteId = clienteId;
		this.responsableId = responsableId;
		this.veterinariaId = veterinariaId;
	}

	@Override
	public String toString() {
		return "Mascotas [idMascotas=" + idMascotas + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad
				+ ", razonCita=" + razonCita + ", clienteId=" + clienteId + ", responsableId=" + responsableId
				+ ", veterinariaId=" + veterinariaId + "]";
	}

	public Long getIdMascotas() {
		return idMascotas;
	}

	public void setIdMascotas(Long idMascotas) {
		this.idMascotas = idMascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRazonCita() {
		return razonCita;
	}

	public void setRazonCita(String razonCita) {
		this.razonCita = razonCita;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Long responsableId) {
		this.responsableId = responsableId;
	}

	public Long getVeterinariaId() {
		return veterinariaId;
	}

	public void setVeterinariaId(Long veterinariaId) {
		this.veterinariaId = veterinariaId;
	}
	
	
	
}
