package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.model.Perfil;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PerfilDTO implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	
	 private Long id;
	 private String nome, descritivo;
	 
	 

}
