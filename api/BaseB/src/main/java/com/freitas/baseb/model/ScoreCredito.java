package com.freitas.baseb.model;

import java.util.List;

public class ScoreCredito {
	private int id;
	private String cpf;
	private Endereco endereco;
	private List<FonteRenda> fonteRendas;
	private List<Patrimonio> patrimonios;
	
	public ScoreCredito(int id, String cpf, Endereco endereco, List<FonteRenda> fonteRendas,
			List<Patrimonio> patrimonios) {
		this.id = id;
		this.cpf = cpf;
		this.endereco = endereco;
		this.fonteRendas = fonteRendas;
		this.patrimonios = patrimonios;
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
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<FonteRenda> getFonteRendas() {
		return fonteRendas;
	}
	
	public void setFonteRendas(List<FonteRenda> fonteRendas) {
		this.fonteRendas = fonteRendas;
	}
	
	public List<Patrimonio> getPatrimonios() {
		return patrimonios;
	}
	
	public void setPatrimonios(List<Patrimonio> patrimonios) {
		this.patrimonios = patrimonios;
	}
}
