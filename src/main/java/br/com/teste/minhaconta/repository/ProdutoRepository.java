package br.com.teste.minhaconta.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.teste.minhaconta.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
