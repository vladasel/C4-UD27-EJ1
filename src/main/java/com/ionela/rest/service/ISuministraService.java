package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Suministra;

public interface ISuministraService {
	public List<Suministra> listarSuministros(); // Listar All

	public Suministra guardarSuministra(Suministra suministra); // Guarda un suministr CREATE

	public Suministra suministraXID(Long id); // Leer datos de un suministro READ

	public Suministra actualizarSuministra(Suministra suministra); // Actualiza datos del suministro UPDATE

	public void eliminarSuministra(Long id);
}
