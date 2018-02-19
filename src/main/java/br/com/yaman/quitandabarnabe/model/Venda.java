package br.com.yaman.quitandabarnabe.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA")
public class Venda extends GenericId {

	@Column(name = "DATA")
	private LocalDateTime dataVenda;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "venda", cascade = CascadeType.ALL)
	private List<ItemVenda> itensVenda;

	@Column(name = "VLR_TOTAL")
	private BigDecimal valorTotal;

	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}

	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(List<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@PrePersist
	public void prePersist() {
		this.dataVenda = LocalDateTime.now();
	}

}
