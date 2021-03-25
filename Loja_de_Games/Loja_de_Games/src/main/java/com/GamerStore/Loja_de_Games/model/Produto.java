package com.GamerStore.Loja_de_Games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table (name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min = 5, max = 20)
	private String titulo;
	
	@Size (min = 5, max = 200)
	private String descricao;
	
	private double preco;
	
	@ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

}
