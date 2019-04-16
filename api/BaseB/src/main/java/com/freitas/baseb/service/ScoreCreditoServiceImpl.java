package com.freitas.baseb.service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.freitas.baseb.model.Endereco;
import com.freitas.baseb.model.FonteRenda;
import com.freitas.baseb.model.Patrimonio;
import com.freitas.baseb.model.ScoreCredito;
import com.freitas.baseb.model.TipoPatrimonio;

@Service("pessoaFisicaService")
public class ScoreCreditoServiceImpl implements ScoreCreditoService {

	private static List<ScoreCredito> scoreCreditos;

	// Teste por não precisar implementar a parte de infraestrutura
	static {
		scoreCreditos = populateScore();
	}
	
	@Override
	public ScoreCredito findByCPF(String cpf) {
		for(ScoreCredito sc: scoreCreditos) {
			if(sc.getCpf().equalsIgnoreCase(cpf))
				return sc;
		}
		
		return null;
	}

	private static List<ScoreCredito> populateScore() {
		List<ScoreCredito> scores = new ArrayList<ScoreCredito>();
		
		FonteRenda fr = new FonteRenda(1, "Desenvolvedor", "Desenvolvedor Java", 
				new DateTime(2019, 6, 1, 0, 0),  null, 6000);
		FonteRenda fr2 = new FonteRenda(2, "Aplicação", "Aplicação em CDB", 
				new DateTime(2018, 2, 1, 0, 0),  new DateTime(2020, 2, 2, 0, 0), 1000);
		List<FonteRenda> fontesRenda = new ArrayList<FonteRenda>();
		fontesRenda.add(fr);
		fontesRenda.add(fr2);
		
		Patrimonio patrimonio = new Patrimonio(1, TipoPatrimonio.IMOVEL, 250000, "Apartamento com 2 quartos");
		Patrimonio patrimonio2 = new Patrimonio(2, TipoPatrimonio.MOVEL, 40000, "Ford Ka 2017 hatch");
		List<Patrimonio> listaBens = new ArrayList<Patrimonio>();
		listaBens.add(patrimonio);
		listaBens.add(patrimonio2);
		
		ScoreCredito score = new ScoreCredito(1, "12345678912", new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null), 
				fontesRenda, listaBens);
		
		scores.add(score);
		
		return scores;
	}
}
