package com.mx.MS_Clientes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CLIENTESM")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientesM {
	@Id
	private Long idClientesM;
	private String nombre;
	private String direccion;
	private Long contacto;

}
