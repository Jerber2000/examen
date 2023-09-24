package com.examen.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name ="clientes")

public class Cliente {
	@Id
	@GeneratedValue
	@Column (name ="idcliente")
	public int idcliente;
	public String primernombre;
	public String segundonombre;
	public String otronombre;
	public String primerapellido;
	public String segundoapellido;
	public String otroapellido;
	public String genero;
	public Date fechanacmiento;
	public String segmento;
	public Float sueldo;
	public String dpi;
	public String correo;
	public String telefono;
	public String direccion;
	public Date fechacreacion;
	
}
