package br.com.yaman.quitandabarnabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.yaman.quitandabarnabe.model.Produto;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

@RestController
@RequestMapping("produtos")
public class ProdutoRestController extends ApiMethodsImpl<Produto> {

	@Autowired
	public ProdutoRestController(CrudMethods<Produto> service) {
		super(service);
	}

	@Override
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto) {
		Produto prod = service.create(produto);

		String id = prod.getId().toString();
		UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("localhost")
				.path("/produtos/{id}").buildAndExpand(id);

		return ResponseEntity.created(uriComponents.toUri()).body(prod);
	}

}
