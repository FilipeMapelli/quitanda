package br.com.yaman.quitandabarnabe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-16
 *
 * @param <T>
 */
@NoRepositoryBean
public interface JPACustomRepository<T> extends JpaRepository<T, Long> {

}
