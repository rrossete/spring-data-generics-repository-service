package com.stefanini.genericElements.models;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Pedido extends Elementos implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataPedido;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> itens = new HashSet<>();


    public Pedido(Date dataPedido, Set<ItemPedido> itens) {
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

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setItens(Set<ItemPedido> itens) {
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
