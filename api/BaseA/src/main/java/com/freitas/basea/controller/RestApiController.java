package com.freitas.basea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freitas.basea.model.PessoaFisica;
import com.freitas.basea.service.PessoaFisicaServiceImpl;
import com.freitas.basea.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	PessoaFisicaServiceImpl pessoaFisicaService = new PessoaFisicaServiceImpl();
	
	@RequestMapping(value = "/pessoafisica/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> getPessoaFisica(@PathVariable("cpf") String cpf) {
		logger.info("Fetching User with cpf {}", cpf);
		PessoaFisica pf = pessoaFisicaService.findByCPF(cpf);
		
		if(pf == null) {
			logger.error("Task with id {} not found", cpf);
			return new ResponseEntity(new CustomErrorType("Nenhuma registro encontrado com esse cpf"), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<PessoaFisica>(pf, HttpStatus.OK);
	}
}
