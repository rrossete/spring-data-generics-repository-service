package com.stefanini.genericElements.repositories;

import org.springframework.stereotype.Repository;

import com.stefanini.genericElements.models.Produto;

@Repository
public interface ProdutoRepository extends GenericRepository<Produto, Integer>{

}
