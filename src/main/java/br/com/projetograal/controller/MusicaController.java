package br.com.projetograal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetograal.model.Musica;
import br.com.projetograal.repository.MusicaRepository;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
	
	@Autowired
	private MusicaRepository musicaRepository;

	
	@GetMapping
	public List<Musica> listarIntegrantes() {
		return musicaRepository.findAll();

	}

}
