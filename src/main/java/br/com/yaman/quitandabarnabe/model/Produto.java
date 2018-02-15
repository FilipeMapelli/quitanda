package br.com.yaman.quitandabarnabe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto extends GenericId {

	@Column(name = "NOME")
	private String nome;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "COD_TIPO_PRODUTO")
	private TipoProduto tipoProduto;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "CALORIAS")
	private Double calorias;

	@Column(name = "PESO_MEDIO")
	private Double pesoMedio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	public Double getPesoMedio() {
		return pesoMedio;
	}

	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

}
