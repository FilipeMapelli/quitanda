package br.com.yaman.quitandabarnabe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.yaman.quitandabarnabe.model.Produto;
import br.com.yaman.quitandabarnabe.service.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoRestController {
	
	@Autowired
	private ProdutoService produtoService;
	
	/**
	 * Cria um novo produto
	 * @param produto
	 * @return ResponseEntity<Produto>
	 */
	@PostMapping
	public ResponseEntity<Produto> create (@RequestBody Produto produto) {
		
		Produto prod = produtoService.create(produto);
		
		String id = prod.getId().toString();
		UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("localhost")
				.path("/produtos/{id}").buildAndExpand(id);
		
		return ResponseEntity.created(uriComponents.toUri()).body(prod);
	}
	
	/**
	 * Retorna um produto pelo id
	 * 
	 * @param id
	 * @return ResponseEntity<Produto>
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Produto> read (@PathVariable Long id) {
		
		Optional<Produto> produto = produtoService.read(id);
		
		if (produto.isPresent()) {
			return ResponseEntity.ok().body(produto.get());
		}
		return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);
	}
	
	/**
	 * Atualiza um produto pelo id
	 * 
	 * @param id
	 * @param produto
	 * @return ResponseEntity<Produto>
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Produto> update (@PathVariable Long id, @RequestBody Produto produto) {
		
		Optional<Produto> prod = produtoService.update(id, produto);
		
		if (prod.isPresent()) {
			return ResponseEntity.ok().body(prod.get());
		}
		return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);
		
	}
	
	/**
	 * Deleta um produto pelo id
	 * 
	 * @param id
	 * @return ResponseEntity<Produto>
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> delete (@PathVariable Long id) {
		
		produtoService.delete(id);
		return new ResponseEntity<Produto>(HttpStatus.NO_CONTENT);
	}

}
