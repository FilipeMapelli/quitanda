package br.com.yaman.quitandabarnabe.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import br.com.yaman.quitandabarnabe.response.Response;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-18
 *
 * @param <T>
 */
public interface ApiMethods<T> {
	
	ResponseEntity<Response<T>> post(T t, HttpServletRequest request);
	
	ResponseEntity<Response<T>> get(Long id);
	
	ResponseEntity<Response<List<T>>> get();
	
	ResponseEntity<T> delete(Long id);
	
	ResponseEntity<Response<T>> put(T t);
	
}
