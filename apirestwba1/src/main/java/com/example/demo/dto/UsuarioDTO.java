package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Perfil;

import lombok.Data;

@Data
public class UsuarioDTO implements Serializable {
	  
	private static final long serialVersionUID = 1L;
	
	//private Long id;
	private Long idUS;
	private String nome;
	private String login;
	private String perfil;
	private List<PerfilDTO> perfis = new ArrayList<PerfilDTO>();

}
