package br.com.yaman.quitandabarnabe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.Estoque;
import br.com.yaman.quitandabarnabe.repository.JPACustomRepository;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-19
 *
 */
@Service
public class EstoqueService extends CrudMethodsImpl<Estoque>{


	@Autowired
	public EstoqueService(JPACustomRepository<Estoque> repository) {
		super(repository);
	}
	


}
