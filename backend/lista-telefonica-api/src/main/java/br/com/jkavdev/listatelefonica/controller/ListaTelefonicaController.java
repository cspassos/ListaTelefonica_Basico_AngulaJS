package br.com.jkavdev.listatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jkavdev.listatelefonica.model.Contato;
import br.com.jkavdev.listatelefonica.model.Operadora;
import br.com.jkavdev.listatelefonica.service.ListaTelefonicaService;

@RestController
@RequestMapping("/listaTelefonica")
public class ListaTelefonicaController {

	@Autowired
	private ListaTelefonicaService listaService;

	@GetMapping("/contatos")
	public List<Contato> todosContatos() {
		return listaService.contatos();
	}

	@GetMapping("/operadoras")
	public List<Operadora> todosOperadoras() {
		return listaService.operadoras();
	}

}
