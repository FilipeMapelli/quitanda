package br.com.yaman.quitandabarnabe.repository;

import org.springframework.stereotype.Repository;

import br.com.yaman.quitandabarnabe.model.Venda;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-18
 *
 */
@Repository
public interface VendaRepository extends JPACustomRepository<Venda> {

}
