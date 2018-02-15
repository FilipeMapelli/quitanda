package br.com.yaman.quitandabarnabe.service;

import java.util.Optional;

public interface CrudMethods<T> {

	T create(T t);

	Optional<T> read(Long id);

	Optional<T> update(Long id, T t);

	void delete(Long id);

}
