package br.com.yaman.quitandabarnabe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.Produto;
import br.com.yaman.quitandabarnabe.repository.ProdutoRepository;

@Service
public class ProdutoService implements CrudMethods<Produto>{
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public Optional<Produto> read(Long id) {
		return Optional.ofNullable(produtoRepository.findOne(id));
	}

	@Override
	public Optional<Produto> update(Long id, Produto produto) {
		
		Optional<Produto> prod = Optional.of(produtoRepository.findOne(id));
		
		 if (prod.isPresent()) {
			produto.setId(id);
			
		 }
		 return Optional.ofNullable(produtoRepository.save(produto));
	}

	@Override
	public void delete(Long id) {
		produtoRepository.delete(id);
	}
	
	

}
