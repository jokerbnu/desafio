package com.freitas.baseb.model;

public class Patrimonio {
	private int id;
	private TipoPatrimonio tipoPatrimonio;
	private double valor;
	private String descricao;
	
	public Patrimonio(int id, TipoPatrimonio tipoPatrimonio, double valor, String descricao) {
		this.id = id;
		this.tipoPatrimonio = tipoPatrimonio;
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoPatrimonio getTipoPatrimonio() {
		return tipoPatrimonio;
	}

	public void setTipoPatrimonio(TipoPatrimonio tipoPatrimonio) {
		this.tipoPatrimonio = tipoPatrimonio;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
