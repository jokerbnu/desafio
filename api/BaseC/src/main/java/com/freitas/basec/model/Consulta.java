package com.freitas.basec.model;

import org.joda.time.DateTime;

public class Consulta {
	private int id;
	private DateTime data;
	private String cnpj;
	private PessoaFisica pessoaFisica;
	
	public Consulta(int id, DateTime data, String cnpj, PessoaFisica pessoaFisica) {
		this.id = id;
		this.data = data;
		this.cnpj = cnpj;
		this.pessoaFisica = pessoaFisica;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getData() {
		return data;
	}

	public void setData(DateTime data) {
		this.data = data;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
}
