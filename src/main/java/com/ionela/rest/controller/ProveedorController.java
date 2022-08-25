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

import com.ionela.rest.dto.Proveedor;
import com.ionela.rest.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;

	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores() {
		return proveedorServiceImpl.listarProveedores();
	}

	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {

		return proveedorServiceImpl.guardarProveedor(proveedor);
	}

	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name = "id") String id) {

		return proveedorServiceImpl.proveedorXID(id);
	}

	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {

		Proveedor p_seleccionado = new Proveedor();
		Proveedor p_actualizado = new Proveedor();

		p_seleccionado = proveedorServiceImpl.proveedorXID(id);

		p_seleccionado.setNombre(proveedor.getNombre());

		p_actualizado = proveedorServiceImpl.actualizarProveedor(p_seleccionado);

		return p_actualizado;
	}

	@DeleteMapping("/proveedores/{id}")

	public void eleiminarProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
