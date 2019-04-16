package com.freitas.basec.service;

import com.freitas.basec.model.Consulta;

public interface PessoaFisicaService {
	
	Consulta ultimaConsultaByCPF(String cpf);
	
}
