package com.mx.MS_Responsables.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name="RESPONSABLES")
public class Responsables {
	@Id
	private Long idResponsable;
	private String nombre;
	private Long contacto;
	private int veterinariaId;
}
