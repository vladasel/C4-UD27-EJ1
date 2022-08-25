package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Pieza;

public interface IPiezaService {
	// Metodos del CRUD
	public List<Pieza> listarPiezas(); // Listar All

	public Pieza guardarPieza(Pieza pieza); // Guarda una pieza CREATE

	public Pieza piezaXID(Long id); // Leer datos de una pieza READ

	public Pieza actualizarPieza(Pieza pieza); // Actualiza datos de la pieza UPDATE

	public void eliminarPieza(Long id);
}
