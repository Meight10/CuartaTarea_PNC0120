package com.uca.cuartaTarea.modelo.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	
	@Size(min = 12, max = 12, message = "El código del producto debe tener 12 dígitos")
	@Digits(integer=12,fraction=0, message="Solo ingresar números")
	String codigo;
	
	@Size(min = 1, max = 100, message = "El código debe tener al menos un caracter y como máximo 100")
	String nombre;
	
	@Size(min = 1, max = 100, message = "La marca debe tener al menos un caracter y como máximo 100")
	String marca;
	
	@Size(min = 1, max = 100, message = "La descripción debe tener al menos un caracter y como máximo 100")
	String descripcion;
	
	@Digits(integer = 10, fraction = 0, message="Las existencias no pueden escribirse en decimales")
	Integer existencias;
	
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message ="La fecha debe estar en el formato: dd/mm/yyyy")
	String fecha;
	
	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getExistencias() {
		return this.existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	public String getFecha() {
		return this.descripcion;
	}
	public void setFecha(String descripcion) {
		this.descripcion = descripcion;
	}
}
