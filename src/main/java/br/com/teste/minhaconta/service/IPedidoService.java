package br.com.teste.minhaconta.service;

import java.util.Date;

import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.model.Pedido;

public interface IPedidoService {
	
	public Pedido retornarPedidosAndamento(Long idPedido);
	public Iterable<Pedido> listarHistoricoPedidos(Date data, Cliente idCliente);
	

}
