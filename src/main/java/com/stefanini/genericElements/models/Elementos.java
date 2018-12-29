package com.stefanini.genericElements.models;

import javax.persistence.*;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)// somente as classes concretas serao criadas
public abstract class Elementos {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Integer id;

    public Elementos() {
    }

    public abstract Integer getId();


    public abstract void setId(Integer id);
}
