package com.stefanini.genericElements.services;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenericService<T extends Entidades> {

    @Autowired
    private GenericRepository<T> genericRepository;


    public List<Produto> findAllProdutos() {

        return genericRepository.findAllProdutos();
    }

    public List<Pedido> findAllPedidos() {
        return genericRepository.findAllPedidos();
    }

    public T findById(Integer id) {

        System.out.println(GenericService.class);
        Optional<T> elemento = genericRepository.findById(id);

        return elemento.get();
    }

    public void create(T entidade) {

        genericRepository.saveAndFlush(entidade);
    }

    public void delete(Integer id) {

        genericRepository.deleteById(id);
    }

    public void update(Integer id, T entidade) {

        entidade.setId(id);
        genericRepository.saveAndFlush(entidade);

    }
}
