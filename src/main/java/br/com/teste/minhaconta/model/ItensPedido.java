package br.com.teste.minhaconta.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "itensPedido")
public class ItensPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID_ITENS_PEDIDO", nullable = false)
	private Long idItensPedido;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_PEDIDO")
	private Pedido pedido;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_PRODUTO")
	private Produto produto;

	public Long getIdItensPedido() {
		return idItensPedido;
	}

	public void setIdItensPedido(Long idItensPedido) {
		this.idItensPedido = idItensPedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	

}
