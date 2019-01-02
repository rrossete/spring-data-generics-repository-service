package com.stefanini.genericElements.repositories;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface GenericRepository<T extends Entidades> extends JpaRepository<T, Integer> {

    @Query(value = "SELECT * FROM produto", nativeQuery = true)
    public List<Produto> findAllProdutos();

    @Query(value = "SELECT * FROM pedido", nativeQuery = true)
    public List<Pedido> findAllPedidos();

    Optional<T> findById(Integer id);
}
