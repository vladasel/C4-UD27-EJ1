package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IPiezaDAO;
import com.ionela.rest.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {
	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(Long id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(Long id) {
		iPiezaDAO.deleteById(id);

	}

}
