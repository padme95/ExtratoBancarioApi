package br.com.santander.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{

}
