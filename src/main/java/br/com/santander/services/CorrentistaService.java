package br.com.santander.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santander.dtos.NovoCorrentista;
import br.com.santander.model.Conta;
import br.com.santander.model.Correntista;
import br.com.santander.repositories.CorrentistaRepository;
import lombok.Data;
@Data
@Service
	
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public void save (NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		
		repository.save(correntista);
	}
}
