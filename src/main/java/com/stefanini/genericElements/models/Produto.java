package com.stefanini.genericElements.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Produto extends Entidades  {
	
    private String nomeProduto;
    private Double precoProduto;

    @OneToMany(mappedBy = "id.produto")
    @JsonIgnore
    private Set<ItemPedido> itens = new HashSet<>();

    public Produto(String nomeProduto, Double precoProduto, Set<ItemPedido> itens) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.itens = itens;
    }

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(Set<ItemPedido> itens) {
        this.itens = itens;
    }


}
