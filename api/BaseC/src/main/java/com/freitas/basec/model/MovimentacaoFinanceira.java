package com.freitas.basec.model;

import org.joda.time.DateTime;

public class MovimentacaoFinanceira {
	private int id;
	private PessoaFisica pessoa;
	private String natureza;
	private double valor;
	private DateTime data;
	
	public MovimentacaoFinanceira(int id, PessoaFisica pessoa, String natureza, double valor, DateTime data) {
		this.id = id;
		this.pessoa = pessoa;
		this.natureza = natureza;
		this.valor = valor;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public DateTime getData() {
		return data;
	}

	public void setData(DateTime data) {
		this.data = data;
	}
}
