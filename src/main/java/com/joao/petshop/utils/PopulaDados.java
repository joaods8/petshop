package com.joao.petshop.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joao.petshop.domain.Categoria;
import com.joao.petshop.repository.CategoriaRepository;

@Component
public class PopulaDados {
	@Autowired
	CategoriaRepository categoriarepository;
	
	@PostConstruct
	
	public void cadastrar() {
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "Cosmético");
		Categoria cat3 = new Categoria(null, "Remédio");
		
		categoriarepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
	}
	
}
