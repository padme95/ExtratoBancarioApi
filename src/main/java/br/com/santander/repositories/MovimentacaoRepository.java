package br.com.santander.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
