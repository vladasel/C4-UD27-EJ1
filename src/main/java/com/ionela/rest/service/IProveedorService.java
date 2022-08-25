package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedores(); // Listar All

	public Proveedor guardarProveedor(Proveedor proveedor); // Guarda una proveedor CREATE

	public Proveedor proveedorXID(String id); // Leer datos de un proveedor READ

	public Proveedor actualizarProveedor(Proveedor proveedor); // Actualiza datos del proveedor UPDATE

	public void eliminarProveedor(String id);
}
