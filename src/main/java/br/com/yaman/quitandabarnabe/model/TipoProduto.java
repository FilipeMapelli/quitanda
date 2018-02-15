package br.com.yaman.quitandabarnabe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_PRODUTO")
public class TipoProduto extends GenericId {

	@Column(name = "NOME")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
