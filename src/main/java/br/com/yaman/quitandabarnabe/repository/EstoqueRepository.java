package br.com.yaman.quitandabarnabe.repository;

import org.springframework.stereotype.Repository;

import br.com.yaman.quitandabarnabe.model.Estoque;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-19
 *
 */
@Repository
public interface EstoqueRepository extends JPACustomRepository<Estoque>{

}
