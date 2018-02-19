package br.com.yaman.quitandabarnabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitandabarnabe.model.Produto;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

@RestController
@RequestMapping("produtos")
public class ProdutoRestController extends ApiMethodsImpl<Produto> {

	@Autowired
	public ProdutoRestController(CrudMethods<Produto> service) {
		super(service);
	}


}
