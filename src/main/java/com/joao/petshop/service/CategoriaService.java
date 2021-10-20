package com.joao.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.petshop.domain.Categoria;
import com.joao.petshop.repository.CategoriaRepository;
import com.joao.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID: " + id +", tipo: " + Categoria.class.getName()));
	}

}
