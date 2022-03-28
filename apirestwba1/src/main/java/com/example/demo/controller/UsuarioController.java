package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PerfilDTO;
import com.example.demo.dto.PerfilDTO1;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Perfil;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping("/listaUsuario")
	public List<Usuario>list(){
		
		return usuarioService.listAll();
	}
    
    @PostMapping("/salvarUs")
    public UsuarioDTO salvar(@RequestBody UsuarioDTO dto) {
    	
    	 return usuarioService.salvarUsuario(dto);
    	
    }
    
     @PostMapping("/salvarPf")
    public ResponseEntity<PerfilDTO1> salvarPerf(@RequestBody Perfil perfil) {
    	 
    	 Perfil p  = usuarioService.salvarPerfil(perfil);
    	 
    	 PerfilDTO1 objPer = new PerfilDTO1(p);
    	
    	   return ResponseEntity.ok().body(objPer);
    	
    }
 
}
