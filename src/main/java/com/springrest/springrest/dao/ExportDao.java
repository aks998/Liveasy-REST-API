package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Exports;

public interface ExportDao extends JpaRepository<Exports , Long> {

}
