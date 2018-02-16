package br.com.yaman.quitandabarnabe.repository;

import org.springframework.stereotype.Repository;

import br.com.yaman.quitandabarnabe.model.Produto;

@Repository
public interface ProdutoRepository extends JPACustomRepository<Produto> {

}
