package br.com.yaman.quitandabarnabe.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.yaman.quitandabarnabe.response.Response;
import br.com.yaman.quitandabarnabe.service.CrudMethods;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-18
 *
 * @param <T>
 */
public class ApiMethodsImpl<T> implements ApiMethods<T> {

	protected CrudMethods<T> service;

	public ApiMethodsImpl(CrudMethods<T> service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Response<T>> post(@RequestBody T t, HttpServletRequest request) {

		Response<T> response = new Response<>();
		response.setData(service.create(t));

		String id;
		try {
			Class<?> cls = Class.forName(t.getClass().getName());
			Class<?> superclass = cls.getSuperclass();
			Method meth = superclass.getMethod("getId");
			Long idResource = (Long) meth.invoke(response.getData());
			id = idResource.toString();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			return new ResponseEntity<Response<T>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("localhost")
				.path(request.getRequestURI() + "/{id}").buildAndExpand(id);

		return ResponseEntity.created(uriComponents.toUri()).body(response);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Response<T>> get(@PathVariable Long id) {

		Optional<T> t = service.read(id);
		Response<T> response = new Response<>();

		if (t.isPresent()) {
			response.setData(t.get());
			return ResponseEntity.ok().body(response);
		}
		return new ResponseEntity<Response<T>>(HttpStatus.NOT_FOUND);
	}

	@PutMapping()
	public ResponseEntity<Response<T>> put(@RequestBody T t) {

		Response<T> response = new Response<>();
		response.setData(service.update(t));

		return ResponseEntity.ok().body(response);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<T> delete(@PathVariable Long id) {

		if (service.read(id).isPresent()) {
			service.delete(id);
			return new ResponseEntity<T>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@GetMapping
	public ResponseEntity<Response<List<T>>> get() {
		Response<List<T>> response = new Response<>();
		response.setData(service.findAll());
		return ResponseEntity.ok().body(response);
	}

}
