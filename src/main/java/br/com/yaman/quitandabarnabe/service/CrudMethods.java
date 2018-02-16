package br.com.yaman.quitandabarnabe.service;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @author filipe
 *
 * @param <T>
 */
public interface CrudMethods<T> {

	T create(T t);

	Optional<T> read(Long id);

	Optional<T> update(Long id, T t);

	void delete(Long id);
	
	List<T> findAll ();

}
