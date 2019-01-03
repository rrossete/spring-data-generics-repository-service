package com.stefanini.genericElements.repositories;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;



public interface GenericRepository<T extends Entidades ,I extends Serializable> extends JpaRepository<T, I> {

    public List<T> findAll();

    Optional<T> findById(I id);
}
