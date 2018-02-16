package br.com.yaman.quitandabarnabe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.Produto;
import br.com.yaman.quitandabarnabe.repository.JPACustomRepository;

@Service
public class ProdutoService extends CrudMethodsImpl<Produto>{

	@Autowired
	public ProdutoService(JPACustomRepository<Produto> repository) {
		super(repository);
	}
	
}
