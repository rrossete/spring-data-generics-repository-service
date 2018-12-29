package com.stefanini.genericElements.services;

import com.stefanini.genericElements.models.Elementos;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
public class GenericService<T extends Elementos> {

    @Autowired
    private GenericRepository<T> genericRepository;


    public T findById(Integer id) {

        System.out.println(GenericService.class);
        Optional<T> elemento = genericRepository.findById(id);

        return elemento.get();
    }

}
