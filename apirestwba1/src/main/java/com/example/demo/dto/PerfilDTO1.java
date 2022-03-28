package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.model.Perfil;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilDTO1 implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	 private Long id;
	 private String nome, descritivo;
	 
	public PerfilDTO1(Perfil objP) {
		
		this.id = objP.getId();
		this.nome = objP.getNome();
		this.descritivo = objP.getDescritivo();
		
	}

}
