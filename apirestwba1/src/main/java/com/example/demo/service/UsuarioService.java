package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PerfilDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.mapper.PerfilTransformMapper;
import com.example.demo.mapper.UsuarioTransformMapper;
import com.example.demo.model.Perfil;
import com.example.demo.model.Usuario;
import com.example.demo.repository.PerfilRepository;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private UsuarioTransformMapper mapper;
	
	@Autowired
	private PerfilTransformMapper mapperP;
	
	
	public List<Usuario>listAll(){
		
		return usuarioRepository.findAll();
		
	}
	 
	public UsuarioDTO salvarUsuario(UsuarioDTO dto) {
		
		Usuario usuario = mapper.toEntity(dto);
		
		List<Perfil> perfis = new ArrayList<>();
		for (Perfil perfil : perfis) {
			Perfil p = new Perfil();
			p.setNome(perfil.getNome());
			p.setDescritivo(perfil.getDescritivo());
			perfis.add(p);
		}
		 
		return mapper.toDto(usuarioRepository.save(usuario)) ;  
		
		}
	 
	
	public Perfil salvarPerfil(Perfil perfil) {
		  
		 return perfilRepository.save(perfil);
	 }
	 
 
}
