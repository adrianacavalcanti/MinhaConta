package br.com.teste.minhaconta.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.model.Pedido;

public interface PedidoRepositoy extends CrudRepository<Pedido, Long>{
	
	public Iterable<Pedido> listarHistoricoPedido(Date data, Cliente idCliente);

}
