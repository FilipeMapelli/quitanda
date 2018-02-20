package br.com.yaman.quitandabarnabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitandabarnabe.model.Estoque;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

@RestController
@RequestMapping("estoque")
public class EstoqueRestController extends ApiMethodsImpl<Estoque>{
	
	
	@Autowired
	public EstoqueRestController(CrudMethods<Estoque> service) {
		super(service);
	}


}
