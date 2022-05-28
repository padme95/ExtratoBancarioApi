package br.com.santander.dtos;

import br.com.santander.model.MovimentacaoTipo;
import lombok.Data;

@Data
public class NovaMovimentacao {

	private MovimentacaoTipo tipo;

	private String descricao;
	
	private Integer idConta;
	
	private Double valor;
}
