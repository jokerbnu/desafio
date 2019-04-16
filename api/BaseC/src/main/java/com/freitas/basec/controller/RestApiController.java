package com.freitas.basec.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freitas.basec.model.CompraCartao;
import com.freitas.basec.model.Consulta;
import com.freitas.basec.model.MovimentacaoFinanceira;
import com.freitas.basec.model.PessoaFisica;
import com.freitas.basec.service.CartaoCreditoServiceImpl;
import com.freitas.basec.service.MovimentacaoFinanceiraServiceImpl;
import com.freitas.basec.service.PessoaFisicaServiceImpl;
import com.freitas.basec.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {
	PessoaFisicaServiceImpl pessoaFisicaService = new PessoaFisicaServiceImpl();
	MovimentacaoFinanceiraServiceImpl movimentacaoService = new MovimentacaoFinanceiraServiceImpl();
	CartaoCreditoServiceImpl cartaoCreditoService = new CartaoCreditoServiceImpl();
	
	@RequestMapping(value = "/rastreio/ultimaconsulta/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> getUltimaConsulta(@PathVariable("cpf") String cpf) {
		Consulta ultimaConsultaByCPF = pessoaFisicaService.ultimaConsultaByCPF(cpf);
		
		if(ultimaConsultaByCPF == null) 
			return new ResponseEntity(new CustomErrorType("Nenhuma registro encontrado com esse cpf"), HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Consulta>(ultimaConsultaByCPF, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/rastreio/financa/movimentacoes/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> getMovimentacoes(@PathVariable("cpf") String cpf) {
		List<MovimentacaoFinanceira> ultimasMovimentacoes = movimentacaoService.ultimasMovimentacoes(cpf);
		
		if(ultimasMovimentacoes == null) 
			return new ResponseEntity(new CustomErrorType("Nenhuma registro encontrado com esse cpf"), HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<List<MovimentacaoFinanceira>>(ultimasMovimentacoes, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/rastreio/cartaocredito/compra/ultima/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> getUltimaCompraCartaoCredito(@PathVariable("cpf") String cpf) {
		CompraCartao ultimaCompra = cartaoCreditoService.ultimaCompra(cpf);
		
		if(ultimaCompra == null) 
			return new ResponseEntity(new CustomErrorType("Nenhuma registro encontrado com esse cpf"), HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<CompraCartao>(ultimaCompra, HttpStatus.OK);
	}
}
