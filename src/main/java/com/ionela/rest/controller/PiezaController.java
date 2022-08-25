package com.ionela.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ionela.rest.dto.Pieza;
import com.ionela.rest.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {
	@Autowired
	PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		return piezaServiceImpl.listarPiezas();
	}

	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {

		return piezaServiceImpl.guardarPieza(pieza);
	}

	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name = "id") Long id) {

		return piezaServiceImpl.piezaXID(id);
	}

	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") Long id, @RequestBody Pieza pieza) {

		Pieza p_seleccionado = new Pieza();
		Pieza p_actualizado = new Pieza();

		p_seleccionado = piezaServiceImpl.piezaXID(id);

		p_seleccionado.setNombre(pieza.getNombre());

		p_actualizado = piezaServiceImpl.actualizarPieza(p_seleccionado);

		return p_actualizado;
	}

	@DeleteMapping("/piezas/{id}")

	public void eleiminarPieza(@PathVariable(name = "id") Long id) {
		piezaServiceImpl.eliminarPieza(id);
	}

}
