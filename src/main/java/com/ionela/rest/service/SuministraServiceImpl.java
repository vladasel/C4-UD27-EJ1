package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.ISuministraDAO;
import com.ionela.rest.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {
	@Autowired
	ISuministraDAO iSuministrDAO;

	@Override
	public List<Suministra> listarSuministros() {
		return iSuministrDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		return iSuministrDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(Long id) {
		return iSuministrDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministrDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(Long id) {
		iSuministrDAO.deleteById(id);
	}

}
