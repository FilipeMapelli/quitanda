package br.com.yaman.quitandabarnabe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.yaman.quitandabarnabe.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
