package br.com.yaman.quitandabarnabe.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-18
 *
 * @param <T>
 */
public interface ApiMethods<T> {
	
	ResponseEntity<T> post(T t);
	
	ResponseEntity<T> get(Long id);
	
	ResponseEntity<List<T>> get();
	
	ResponseEntity<T> delete(Long id);
	
	ResponseEntity<T> put(T t);
	
}
