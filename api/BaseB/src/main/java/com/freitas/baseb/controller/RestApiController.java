package com.freitas.baseb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freitas.baseb.model.ScoreCredito;
import com.freitas.baseb.service.ScoreCreditoServiceImpl;
import com.freitas.baseb.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	ScoreCreditoServiceImpl scoreCreditoService = new ScoreCreditoServiceImpl();
	
	@RequestMapping(value = "/scorecredito/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> getScoreCredito(@PathVariable("cpf") String cpf) {
		ScoreCredito sc = scoreCreditoService.findByCPF(cpf);
		
		if (sc == null)
			return new ResponseEntity(new CustomErrorType("Nenhuma registro encontrado com esse cpf"), HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<ScoreCredito>(sc, HttpStatus.OK);
	}
}
