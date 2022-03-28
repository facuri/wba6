package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.dto.PerfilDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Perfil;
import com.example.demo.model.Usuario;

@Mapper(componentModel = "spring")
public abstract class PerfilTransformMapper {
	
	public abstract PerfilDTO toDtoP(Usuario usuario);
	
	public abstract Perfil toEntityP(PerfilDTO dtoPer);

}
