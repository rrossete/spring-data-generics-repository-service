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
public class PedidoSource extends GenericResource<Pedido,Integer>{

	@Autowired
	public PedidoSource(PedidoService<Pedido, Integer> genericService) {
		super(genericService);
		// TODO Auto-generated constructor stub
	}




}
