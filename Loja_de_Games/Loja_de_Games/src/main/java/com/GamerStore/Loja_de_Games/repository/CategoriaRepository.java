package com.GamerStore.Loja_de_Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GamerStore.Loja_de_Games.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByTituloContainingIgnoreCase (String titulo);

}
