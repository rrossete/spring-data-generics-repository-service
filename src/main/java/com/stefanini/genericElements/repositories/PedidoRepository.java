package com.stefanini.genericElements.repositories;

import org.springframework.stereotype.Repository;

import com.stefanini.genericElements.models.Pedido;


@Repository
public interface PedidoRepository extends GenericRepository<Pedido, Integer> {

}
