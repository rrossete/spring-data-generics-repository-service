package com.stefanini.genericElements.sources;

import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.repositories.GenericRepository;
import com.stefanini.genericElements.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoSource {


    @Autowired
    GenericService<Produto> genericService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Integer id) {

        Produto produto = (Produto) genericService.findById(id);
        System.out.println(produto.toString());
        return ResponseEntity.ok().body(produto);
    }


}
