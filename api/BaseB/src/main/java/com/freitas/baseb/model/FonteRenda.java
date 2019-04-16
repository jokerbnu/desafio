package com.freitas.baseb.model;

import org.joda.time.DateTime;

public class FonteRenda {
	private int id;
	private String cargo;
	private String descricao;
	private DateTime Contratacao;
	private DateTime LimiteContrato;
	private double valor;
	
	public FonteRenda(int id, String cargo, String descricao, DateTime contratacao, DateTime limiteContrato, double valor) {
		this.id = id;
		this.cargo = cargo;
		this.descricao = descricao;
		Contratacao = contratacao;
		LimiteContrato = limiteContrato;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public DateTime getContratacao() {
		return Contratacao;
	}

	public void setContratacao(DateTime contratacao) {
		Contratacao = contratacao;
	}

	public DateTime getLimiteContrato() {
		return LimiteContrato;
	}

	public void setLimiteContrato(DateTime limiteContrato) {
		LimiteContrato = limiteContrato;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
