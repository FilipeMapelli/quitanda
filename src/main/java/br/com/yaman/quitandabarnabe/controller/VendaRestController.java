package br.com.yaman.quitandabarnabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitandabarnabe.model.Venda;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-19
 *
 */
@RestController
@RequestMapping("vendas")
public class VendaRestController extends ApiMethodsImpl<Venda>{

	@Autowired
	public VendaRestController(CrudMethods<Venda> service) {
		super(service);
	}

}
