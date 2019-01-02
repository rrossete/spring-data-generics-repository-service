package com.stefanini.genericElements.sources;

import com.stefanini.genericElements.models.Pedido;
import com.stefanini.genericElements.services.GenericService;
import com.stefanini.genericElements.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoSource {


    @Autowired
    GenericService<Pedido> genericService;

    @Autowired
    PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        List<Pedido> listaPedidos = genericService.findAllPedidos();

        return ResponseEntity.ok().body(listaPedidos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id) {

        Pedido pedido = genericService.findById(id);
        System.out.println(pedido.toString());
        return ResponseEntity.ok().body(pedido);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Pedido pedido) {

       pedidoService.createPedido(pedido);
        return ResponseEntity.ok().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Pedido pedido) {

        genericService.update(id, pedido);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        pedidoService.deletePedido(id);

        return ResponseEntity.ok().build();
    }


}
