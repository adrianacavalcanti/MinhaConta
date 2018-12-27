package br.com.teste.minhaconta.service;

import br.com.teste.minhaconta.model.Produto;
import br.com.teste.minhaconta.repository.ProdutoRepository;

public class ProdutoServiceImpl implements IProdutoService{
	
	public ProdutoRepository repository;

	@Override
	public Iterable<Produto> listarProdutos() {
		
		Iterable<Produto> produtos = repository.findAll();

		return produtos;
	}

}
