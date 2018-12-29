package com.stefanini.genericElements.sources;

import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/peiddos")
public class PedidoSource {


    @Autowired
    GenericService<Pedido> genericService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id) {

        Pedido pedido = genericService.findById(id);
        System.out.println(pedido.toString());
        return ResponseEntity.ok().body(pedido);
    }
}
