package com.stefanini.genericElements.repositories;

import com.stefanini.genericElements.models.Elementos;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GenericRepository<T extends Elementos> extends JpaRepository<T, Integer> {

    Optional<T> findById(Integer id);
}
