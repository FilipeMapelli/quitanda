package br.com.yaman.quitandabarnabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitandabarnabe.model.TipoProduto;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

@RestController
@RequestMapping("tipo-produtos")
public class TipoProdutoRestController extends ApiMethodsImpl<TipoProduto>{

	@Autowired
	public TipoProdutoRestController(CrudMethods<TipoProduto> service) {
		super(service);
	}

}
