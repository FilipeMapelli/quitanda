package br.com.yaman.quitandabarnabe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUE")
public class Estoque extends GenericId {

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Produto produto;

	@Column(name = "QTD_DISPONIVEL")
	private Integer quantidadeDisponivel;

	@Column(name = "QTD_TOTAL")
	private Integer quantidadeTotal;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(Integer quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	@PrePersist
	public void prePersist() {
		this.quantidadeDisponivel = this.quantidadeTotal;
	}
}
