package br.com.yaman.quitandabarnabe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUE")
public class Estoque extends GenericId {

	@ManyToOne
	@JoinColumn(name = "COD_PRODUTO")
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

}
