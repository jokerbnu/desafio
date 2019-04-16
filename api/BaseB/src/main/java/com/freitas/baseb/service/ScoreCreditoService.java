package com.freitas.baseb.service;

import com.freitas.baseb.model.ScoreCredito;

public interface ScoreCreditoService {
	
	ScoreCredito findByCPF(String cpf);
	
}
