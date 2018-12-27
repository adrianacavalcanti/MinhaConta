package br.com.teste.minhaconta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.teste.minhaconta.model.Cliente;
import br.com.teste.minhaconta.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private ClienteRepository repository;

	public Iterable<Cliente> obterTodos() {

		Iterable<Cliente> clientes = repository.findAll();

		return clientes;

	}

	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}

	public ClienteRepository getRepository() {
		return repository;
	}

	public void setRepository(ClienteRepository repository) {
		this.repository = repository;
	}

}
