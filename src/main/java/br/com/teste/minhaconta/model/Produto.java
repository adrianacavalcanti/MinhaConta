package br.com.teste.minhaconta.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "produto")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID_PRODUTO", nullable = false)
	private Long idProduto;

	@Column(name = "DESCRICAO", nullable = false)
	private String descricao;

	@Column(name = "VALOR", nullable = false)
	private String valor;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
	private Collection<ItensPedido> itensPedido;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Collection<ItensPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(Collection<ItensPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

}
