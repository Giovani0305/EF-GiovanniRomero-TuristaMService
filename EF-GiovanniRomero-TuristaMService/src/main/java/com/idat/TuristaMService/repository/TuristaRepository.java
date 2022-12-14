package com.idat.TuristaMService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.TuristaMService.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
