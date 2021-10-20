package com.joao.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.petshop.domain.Especie;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer>{

}
