package com.stefanini.genericElements.services;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public class GenericService<T extends Entidades, I extends Serializable> {

    private GenericRepository<T, I> genericRepository;
    
    
    public GenericService(GenericRepository genericRepository) {
		super();
		this.genericRepository = genericRepository;
	}

	public List<T> findAllProdutos() {

        return genericRepository.findAll();
    }
    
    public List<T> findAll() {

        return genericRepository.findAll();
    }
    

    public List<T> findAllPedidos() {
        return genericRepository.findAll();
    }

    public T findById(I id) {

        System.out.println(GenericService.class);
        Optional<T> elemento = genericRepository.findById(id);

        return elemento.get();
    }

    public void create(T entidade) {

        genericRepository.saveAndFlush(entidade);
    }

    public void delete(I id) {

        genericRepository.deleteById(id);
    }

    public void update(Integer id, T entidade) {

        entidade.setId(id);
        genericRepository.saveAndFlush(entidade);

    }
}
