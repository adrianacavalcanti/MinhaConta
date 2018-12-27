package br.com.teste.minhaconta.service;

import java.util.Date;

import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.model.Pedido;
import br.com.teste.minhaconta.repository.PedidoRepositoy;

public class PedidoServiceImpl implements IPedidoService {

	public PedidoRepositoy repository;

	@Override
	public Pedido retornarPedidosAndamento(Long idPedido) {

		Pedido pedido = repository.findOne(idPedido);

		return pedido;
	}

	public Iterable<Pedido> listarHistoricoPedidos(Date data, Cliente idCliente) {
		
		Iterable<Pedido> listaPedidos = repository.listarHistoricoPedido(data, idCliente);
		
		return listaPedidos;
	}
	
	

}
