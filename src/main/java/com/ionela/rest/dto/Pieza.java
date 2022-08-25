package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "piezas")
public class Pieza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	private List<Suministra> suministros;

	public Pieza(Long id, String nombre, List<Suministra> suministros) {
		this.id = id;
		this.nombre = nombre;
		this.suministros = suministros;
	}

	public Pieza(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Pieza() {
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministros() {
		return suministros;
	}

	public void setSuministros(List<Suministra> suministros) {
		this.suministros = suministros;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", nombre=" + nombre + ", suministros=" + suministros + "]";
	}

}
