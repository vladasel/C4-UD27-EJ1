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

import com.ionela.rest.dto.Suministra;
import com.ionela.rest.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {
	@Autowired
	SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/suministros")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministros();
	}

	@PostMapping("/suministros")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {

		return suministraServiceImpl.guardarSuministra(suministra);
	}

	@GetMapping("/suministros/{id}")
	public Suministra piezaXID(@PathVariable(name = "id") Long id) {

		return suministraServiceImpl.suministraXID(id);
	}

	@PutMapping("/suministros/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") Long id, @RequestBody Suministra suministra) {

		Suministra s_seleccionado = new Suministra();
		Suministra s_actualizado = new Suministra();

		s_seleccionado = suministraServiceImpl.suministraXID(id);

		s_seleccionado.setPieza(suministra.getPieza());
		s_seleccionado.setProveedor(suministra.getProveedor());
		s_seleccionado.setPrecio(suministra.getPrecio());

		s_actualizado = suministraServiceImpl.actualizarSuministra(s_seleccionado);

		return s_actualizado;
	}

	@DeleteMapping("/suministros/{id}")

	public void eleiminarSuministra(@PathVariable(name = "id") Long id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
}
