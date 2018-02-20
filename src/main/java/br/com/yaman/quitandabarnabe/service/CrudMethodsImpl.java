package br.com.yaman.quitandabarnabe.service;

import java.util.List;
import java.util.Optional;

import br.com.yaman.quitandabarnabe.repository.JPACustomRepository;

/**
 * 
 * @author Filipe Mapelli Siqueira
 *
 * @param <T>
 */
public class CrudMethodsImpl<T> implements CrudMethods<T> {

	private JPACustomRepository<T> repository;

	public CrudMethodsImpl(JPACustomRepository<T> repository) {
		this.repository = repository;
	}

	public JPACustomRepository<T> getRepository() {
		return repository;
	}

	@Override
	public T create(T t) {
		return repository.save(t);
	}

	@Override
	public Optional<T> read(Long id) {
		return Optional.ofNullable(repository.findOne(id));
	}

	@Override
	public T update(T t) {

		return repository.save(t);

	}

	@Override
	public void delete(Long id) {
		repository.delete(id);

	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

}
