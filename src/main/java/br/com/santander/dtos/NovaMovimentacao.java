package br.com.santander.dtos;

import java.time.LocalDateTime;

import br.com.santander.model.MovimentacaoTipo;
import lombok.Data;

@Data
public class NovaMovimentacao {

	private LocalDateTime dataHora;

	private MovimentacaoTipo tipo;

	private String descricao;
	
	private Integer idConta;
	
	private Double valor;
}
