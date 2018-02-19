package br.com.yaman.quitandabarnabe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.Venda;
import br.com.yaman.quitandabarnabe.repository.JPACustomRepository;

@Service
public class VendaService extends CrudMethodsImpl<Venda>{

	@Autowired
	public VendaService(JPACustomRepository<Venda> repository) {
		super(repository);
	}
	
}
