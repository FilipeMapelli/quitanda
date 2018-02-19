package br.com.yaman.quitandabarnabe.repository;

import org.springframework.stereotype.Repository;

import br.com.yaman.quitandabarnabe.model.Produto;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-18
 *
 */
@Repository
public interface ProdutoRepository extends JPACustomRepository<Produto> {

}
