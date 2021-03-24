package com.GamerStore.Loja_de_Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GamerStore.Loja_de_Games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);

}
