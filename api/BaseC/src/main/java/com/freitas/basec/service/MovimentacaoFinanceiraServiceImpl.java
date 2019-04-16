package com.freitas.basec.service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.freitas.basec.model.Divida;
import com.freitas.basec.model.Endereco;
import com.freitas.basec.model.MovimentacaoFinanceira;
import com.freitas.basec.model.PessoaFisica;

@Service("movimentacaoFinanceiraService")
public class MovimentacaoFinanceiraServiceImpl implements MovimentacaoFinanceiraService {

	private static List<MovimentacaoFinanceira> movimentacoesFinanceiras;

	// Teste por não precisar implementar a parte de infraestrutura
	static {
		movimentacoesFinanceiras = populateMovimentacaoFinanceira();
	}

	/**
	 * Retorna as 3 ultimas movimentações financeiras
	 */
	@Override
	public List<MovimentacaoFinanceira> ultimasMovimentacoes(String cpf) {
		List<MovimentacaoFinanceira> mfFiltro = null;

		//No caso de ter uma conexão com banco de dados, retornaria somente os 3 ultimos direto via query

		for(MovimentacaoFinanceira mf: movimentacoesFinanceiras) {
			if(mf.getPessoa().getCpf().equalsIgnoreCase(cpf)) {
				if(mfFiltro == null)
					mfFiltro = new ArrayList<MovimentacaoFinanceira>();
				
				mfFiltro.add(mf);
			}
			
			if(mfFiltro.size() == 3)
				break;
		}
		
		return mfFiltro;
	}
	
	private static List<MovimentacaoFinanceira> populateMovimentacaoFinanceira(){
		List<MovimentacaoFinanceira> movimentacoesFinanceiras = new ArrayList<MovimentacaoFinanceira>();

		PessoaFisica pf = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null));
		MovimentacaoFinanceira mf = new MovimentacaoFinanceira(1, pf, "TED", 0, new DateTime());
		PessoaFisica pf2 = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null));
		MovimentacaoFinanceira mf2 = new MovimentacaoFinanceira(1, pf2, "TED", 0, new DateTime());
		PessoaFisica pf3 = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null));
		MovimentacaoFinanceira mf3 = new MovimentacaoFinanceira(1, pf3, "TED", 0, new DateTime());
		
		movimentacoesFinanceiras.add(mf);
		movimentacoesFinanceiras.add(mf2);
		movimentacoesFinanceiras.add(mf3);
		
		return movimentacoesFinanceiras;
	}
}
