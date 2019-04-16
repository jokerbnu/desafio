package com.freitas.basec.model;

import java.util.List;

public class PessoaFisica {
	private int id;
	private String cpf;
	private String nome;
	private Endereco endereco;
	private List<Divida> listaDividas;
	
	public PessoaFisica(int id, String cpf, String nome, Endereco endereco) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public PessoaFisica(int id, String cpf, String nome, Endereco endereco, List<Divida> listaDividas) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.listaDividas = listaDividas;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Divida> getListaDividas() {
		return listaDividas;
	}
	
	public void setListaDividas(List<Divida> listaDividas) {
		this.listaDividas = listaDividas;
	}
}
