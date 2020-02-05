package br.com.projetograal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetograal.model.Integrante;
import br.com.projetograal.repository.IntegranteRepository;

@RestController
@RequestMapping("/integrantes")
public class IntegranteController {
	
	@Autowired
	private IntegranteRepository integranteRepository;

	// Quando fizer um GET
	@GetMapping
	public List<Integrante> listarIntegrantes() {
		return integranteRepository.findAll();

	}

}
