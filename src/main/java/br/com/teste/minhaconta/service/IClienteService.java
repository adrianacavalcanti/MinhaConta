package br.com.teste.minhaconta.service;

import br.com.teste.minhaconta.model.Cliente;

public interface IClienteService {
	
	public Iterable<Cliente> obterTodos();
	public void salvar(Cliente cliente);

}
