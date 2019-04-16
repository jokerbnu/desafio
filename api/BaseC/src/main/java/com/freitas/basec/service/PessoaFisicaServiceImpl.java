package com.freitas.basec.service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.freitas.basec.model.Consulta;
import com.freitas.basec.model.Divida;
import com.freitas.basec.model.Endereco;
import com.freitas.basec.model.PessoaFisica;

@Service("pessoaFisicaService")
public class PessoaFisicaServiceImpl implements PessoaFisicaService {

	private static List<Consulta> consultas;

	// Teste por não precisar implementar a parte de infraestrutura
	static {
		consultas = populateConsultas();
	}
	
	@Override
	public Consulta ultimaConsultaByCPF(String cpf) {
		Consulta ultimaConsulta = null;
		
		for(Consulta consulta: consultas) {
			if(consulta.getPessoaFisica().getCpf().equalsIgnoreCase(cpf)) {
				if(ultimaConsulta == null) {
					ultimaConsulta = consulta;
					continue;
				}
				
				if(ultimaConsulta.getData().compareTo(consulta.getData()) < 0)
					ultimaConsulta = consulta;
			}
		}
		
		return ultimaConsulta;
	}

	private static List<Consulta> populateConsultas() {
		List<Consulta> consultas = new ArrayList<Consulta>();
		List<Divida> dividas = new ArrayList<Divida>(); 
		PessoaFisica pessoaFisica = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null), dividas);

		PessoaFisica pessoaFisica2 = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null), dividas);
		
		consultas.add(new Consulta(1, new DateTime(2019, 2, 20, 16, 30), "123", pessoaFisica));
		consultas.add(new Consulta(2, new DateTime(2019, 2, 27, 11, 26), "123", pessoaFisica2));
		
		return consultas;
	}
}
