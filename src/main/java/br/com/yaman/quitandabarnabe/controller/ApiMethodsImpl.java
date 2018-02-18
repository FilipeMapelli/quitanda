package br.com.yaman.quitandabarnabe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.yaman.quitandabarnabe.service.CrudMethods;

/**
 * 
 * @author Filipe Mapelli Siqueira
 *
 * @param <T>
 */
public class ApiMethodsImpl<T> implements ApiMethods<T>{

	protected CrudMethods<T> service;

	public ApiMethodsImpl(CrudMethods<T> service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<T> post(@RequestBody T t) {

		return ResponseEntity.ok().body(service.create(t));
	}

	@GetMapping("/{id}")
	public ResponseEntity<T> get(@PathVariable Long id) {

		Optional<T> t = service.read(id);

		if (t.isPresent()) {
			return ResponseEntity.ok().body(t.get());
		}
		return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
	}

	@PutMapping()
	public ResponseEntity<T> put(@RequestBody T t) {
		
		return ResponseEntity.ok().body(service.update(t));
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
	public ResponseEntity<List<T>> get() {
		return ResponseEntity.ok().body(service.findAll());
	}

}
