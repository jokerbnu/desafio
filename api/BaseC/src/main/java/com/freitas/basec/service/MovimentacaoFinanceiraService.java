package com.freitas.basec.service;

import java.util.List;

import com.freitas.basec.model.MovimentacaoFinanceira;

public interface MovimentacaoFinanceiraService {
	
	List<MovimentacaoFinanceira> ultimasMovimentacoes(String cpf);
}
