package com.stefanini.genericElements.models;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.*;

@Entity
public class Pedido extends Entidades implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataPedido;

    @OneToMany(mappedBy = "id.pedido")
    private List<ItemPedido> itens = new ArrayList<>();


    public Pedido(Date dataPedido, List<ItemPedido> itens) {
        super();
        this.dataPedido = dataPedido;
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Pedido() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
