package br.com.yaman.quitandabarnabe.service;

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
	
	@Override
	public T create(T t) {
		return repository.save(t);
	}

	@Override
	public Optional<T> read(Long id) {
		return Optional.ofNullable(repository.findOne(id));
	}

	@Override
	public Optional<T> update(Long id, T t) {
		Optional<T> optional = Optional.of(repository.findOne(id));

		if (optional.isPresent()) {
			return Optional.of(repository.save(t));
		}
		
		return optional;
		
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);

	}

}
