package br.com.teste.minhaconta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.minhaconta.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	

}
