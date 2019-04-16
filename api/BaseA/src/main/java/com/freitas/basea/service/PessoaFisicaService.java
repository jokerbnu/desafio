package com.freitas.basea.service;

import com.freitas.basea.model.PessoaFisica;

public interface PessoaFisicaService {
	
	PessoaFisica findByCPF(String cpf);
	
}
