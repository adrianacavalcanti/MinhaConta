package br.com.teste.minhaconta.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "pedido")
public class Pedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column(name="ID_PEDIDO", nullable = false)
	private Long idPedido;

	@JoinColumn(name = "CLIENTE", referencedColumnName = "ID_USUARIO")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Cliente cliente;

	@Column(name="DATA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPedido;
	
	@Column(name="STATUS", nullable = false)
	private String status;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Collection<ItensPedido> itensPedido;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<ItensPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(Collection<ItensPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	
}
