package br.com.santander.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.dtos.NovaMovimentacao;
import br.com.santander.dtos.NovoCorrentista;
import br.com.santander.model.Movimentacao;
import br.com.santander.repositories.MovimentacaoRepository;
import br.com.santander.services.CorrentistaService;
import br.com.santander.services.MovimentacaoService;
import lombok.Data;
@Data
@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
	
	
}
