package com.freitas.basec.model;

import java.util.Date;

public class Divida {
	private String favorecido;
	private double valor;
	private Date vencimento;
	
	public String getFavorecido() {
		return favorecido;
	}
	
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Date getVencimento() {
		return vencimento;
	}
	
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
