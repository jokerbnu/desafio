package com.freitas.basec.model;

import org.joda.time.DateTime;

public class CompraCartao {
	private int id;
	private PessoaFisica pessoaFisica;
	private DateTime dataCompra;
	private double valor;
	
	public CompraCartao(int id, PessoaFisica pessoaFisica, DateTime dataCompra, double valor) {
		super();
		this.id = id;
		this.pessoaFisica = pessoaFisica;
		this.dataCompra = dataCompra;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public DateTime getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(DateTime dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
