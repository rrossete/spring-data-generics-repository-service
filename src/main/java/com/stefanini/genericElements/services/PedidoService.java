package com.stefanini.genericElements.services;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.ItemPedido;
import com.stefanini.genericElements.models.ItemPedidoPK;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import com.stefanini.genericElements.repositories.ItemPedidoRepository;
import com.stefanini.genericElements.repositories.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Service
public class PedidoService<T extends Entidades, I extends Serializable> 
extends GenericService<Pedido,Integer> {

	@Autowired
	public PedidoService(PedidoRepository genericRepository) {
		super(genericRepository);
		// TODO Auto-generated constructor stub
	}

  
}
