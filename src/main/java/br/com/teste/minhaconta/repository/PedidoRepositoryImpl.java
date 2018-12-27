package br.com.teste.minhaconta.repository;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.model.Pedido;

public class PedidoRepositoryImpl implements PedidoRepositoy {

	@PersistenceContext
	EntityManager manager;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Pedido arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Pedido> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pedido> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pedido> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedido> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedido> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pedido> listarHistoricoPedido(Date data, Cliente idCliente) {
		List<Pedido> pedidos = manager.createQuery(
				"select d from Pedido d " + "inner join fetch d.itensPedido " + "inner join fetch d.cliente "
						+ "where d.dataPedido > :data and d.idCliente:idCliente " + "order by d.dataPedido desc",
				Pedido.class).setParameter("data", data).setParameter("idCliente", idCliente).setMaxResults(20)
				.getResultList();
		return pedidos;
	}

}
