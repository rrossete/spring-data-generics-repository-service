package com.stefanini.genericElements.sources;

import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoSource {


    @Autowired
    GenericService<Produto> genericService;

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Produto produto) {

        genericService.update(id, produto);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        genericService.delete(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Integer id) {

        Produto produto = (Produto) genericService.findById(id);
        System.out.println(produto.toString());
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {

        List<Produto> listaProdutos = genericService.findAllProdutos();

        return ResponseEntity.ok().body(listaProdutos);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Produto produto) {

        genericService.create(produto);

        return ResponseEntity.ok().build();
    }


}
