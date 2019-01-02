package com.stefanini.genericElements.services;

import com.stefanini.genericElements.models.ItemPedido;
import com.stefanini.genericElements.models.ItemPedidoPK;
import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import com.stefanini.genericElements.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PedidoService {

    @Autowired
    ItemPedidoRepository itemPedidoRepository;

    @Autowired
    GenericRepository<Pedido> pedidoGenericRepository;

    public void createPedido(Pedido pedido){

        Integer idPedido = pedidoGenericRepository.saveAndFlush(pedido).getId();

        List<ItemPedido> itensPedido= pedido.getItens();

        ItemPedidoPK itemPedidoPK = new ItemPedidoPK(idPedido);

        for (ItemPedido item: itensPedido) {
            itemPedidoPK.setProduto(item.getProduto());
            item.setId(itemPedidoPK);
            itemPedidoRepository.saveAndFlush(item);
        }
    }

    public void deletePedido(Integer id){

        Pedido pedido = pedidoGenericRepository.findById(id).get();

        List<ItemPedido> itensPedido = pedido.getItens();


        for (ItemPedido item : itensPedido) {

            itemPedidoRepository.delete(item);
        }

    }
}
