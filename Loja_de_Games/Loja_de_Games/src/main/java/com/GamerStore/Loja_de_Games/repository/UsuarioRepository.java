package com.GamerStore.Loja_de_Games.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GamerStore.Loja_de_Games.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);

}
