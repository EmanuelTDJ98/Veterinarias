--SE ELIMINA UNA TABLA SIMILAR SI ES QUE EXISTE
DROP TABLE IF EXISTS CLIENTESM;
-----------------------------------------------
CREATE TABLE CLIENTESM(
	ID_CLIENTESM NUMBER,
	NOMBRE NVARCHAR2(100),
	DIRECCION NVARCHAR2(300),
	CONTACTO NUMBER,
	CONSTRAINT ID_CLIENTESM_PK PRIMARY KEY(ID_CLIENTESM)
);
