package com.stefanini.genericElements.models;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)// somente as classes concretas serao criadas
public abstract class Entidades {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Integer id;

    public Entidades() {
    }

    public abstract Integer getId();


    public abstract void setId(Integer id);
}
