package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Usuario;

@Mapper(componentModel = "spring")
public abstract class UsuarioTransformMapper {
	
	 @Mapping(source = "id", target = "idUS")
	public abstract UsuarioDTO toDto(Usuario usuario);
	
	 @Mapping(source = "idUS", target = "id")
	public abstract Usuario toEntity(UsuarioDTO dto);

}
