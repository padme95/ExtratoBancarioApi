package br.com.santander.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.santander.dtos.NovaMovimentacao;
import br.com.santander.model.Movimentacao;
import br.com.santander.model.MovimentacaoTipo;
import br.com.santander.repositories.MovimentacaoRepository;
import lombok.Data;
@Data
@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;
	

	public void save(NovaMovimentacao novaMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();
		Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		repository.save(movimentacao);
		
	}
}
