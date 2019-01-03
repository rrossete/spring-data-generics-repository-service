package com.stefanini.genericElements.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import com.stefanini.genericElements.repositories.ProdutoRepository;

@Service
public class ProdutoService<T extends Entidades, I extends Serializable> 
	extends GenericService<Produto,Integer>{

	@Autowired
	public ProdutoService(ProdutoRepository genericRepository) {
		super(genericRepository);
		// TODO Auto-generated constructor stub
	}

}
