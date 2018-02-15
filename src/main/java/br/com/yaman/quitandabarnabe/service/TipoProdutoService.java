package br.com.yaman.quitandabarnabe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitandabarnabe.model.TipoProduto;
import br.com.yaman.quitandabarnabe.repository.TipoProdutoRepository;

@Service
public class TipoProdutoService implements CrudMethods<TipoProduto> {

	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;

	@Override
	public TipoProduto create(TipoProduto tipoProduto) {
		return tipoProdutoRepository.save(tipoProduto);
	}

	@Override
	public Optional<TipoProduto> read(Long id) {
		return Optional.ofNullable(tipoProdutoRepository.findOne(id));
	}

	@Override
	public Optional<TipoProduto> update(Long id, TipoProduto tipoProduto) {

		Optional<TipoProduto> tp = Optional.of(tipoProdutoRepository.findOne(id));

		if (tp.isPresent()) {
			tipoProduto.setId(id);

		}

		return Optional.ofNullable(tipoProdutoRepository.save(tipoProduto));
	}

	@Override
	public void delete(Long id) {
		tipoProdutoRepository.delete(id);

	}

}
