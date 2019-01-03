package com.stefanini.genericElements.sources;

import com.stefanini.genericElements.models.Produto;
import com.stefanini.genericElements.services.GenericService;
import com.stefanini.genericElements.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoSource extends GenericResource<Produto, Integer>{

	@Autowired
	public ProdutoSource(ProdutoService<Produto,Integer> genericService) {
		super(genericService);
		// TODO Auto-generated constructor stub
	}


}
