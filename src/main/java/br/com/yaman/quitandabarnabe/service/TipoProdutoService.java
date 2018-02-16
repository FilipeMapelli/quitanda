package br.com.yaman.quitandabarnabe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.TipoProduto;
import br.com.yaman.quitandabarnabe.repository.JPACustomRepository;

@Service
public class TipoProdutoService extends CrudMethodsImpl<TipoProduto> {

	@Autowired
	public TipoProdutoService(JPACustomRepository<TipoProduto> repository) {
		super(repository);
		
	}

	

}
