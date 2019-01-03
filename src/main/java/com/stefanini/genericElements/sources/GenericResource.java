package com.stefanini.genericElements.sources;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stefanini.genericElements.models.Entidades;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.services.GenericService;
import com.stefanini.genericElements.services.ProdutoService;

public class GenericResource<T extends Entidades, I extends Serializable> {
	

 
    GenericService<T,I> genericService;
    
    

    public GenericResource(GenericService<T, I> genericService) {
		super();
		this.genericService = genericService;
	}

	@PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody T produto) {

        genericService.update(id, produto);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable I id) {

        genericService.delete(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable I id) {

        Produto produto = (Produto) genericService.findById(id);
        System.out.println(produto.toString());
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {

        List<T> listaProdutos = genericService.findAllProdutos();

        return ResponseEntity.ok().body(listaProdutos);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody T produto) {

        genericService.create(produto);

        return ResponseEntity.ok().build();
    }



}
