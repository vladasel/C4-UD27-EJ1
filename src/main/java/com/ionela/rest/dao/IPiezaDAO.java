package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza,Long>{

}
