package com.freitas.basea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.freitas.basea.model.Divida;
import com.freitas.basea.model.Endereco;
import com.freitas.basea.model.PessoaFisica;

@Service("pessoaFisicaService")
public class PessoaFisicaServiceImpl implements PessoaFisicaService {

	private static List<PessoaFisica> pessoasFisicas;

	// Teste por não precisar implementar a parte de infraestrutura
	static {
		pessoasFisicas = populatePeoples();
	}
	
	@Override
	public PessoaFisica findByCPF(String cpf) {
		for(PessoaFisica pf: pessoasFisicas) {
			if(pf.getCpf().equalsIgnoreCase(cpf))
				return pf;
		}
		
		return null;
	}

	private static List<PessoaFisica> populatePeoples() {
		List<PessoaFisica> peoples = new ArrayList<PessoaFisica>();
		List<Divida> dividas = new ArrayList<Divida>(); 
		peoples.add(new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null), dividas));
		return peoples;
	}
}
