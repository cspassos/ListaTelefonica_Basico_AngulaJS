package br.com.jkavdev.listatelefonica.model;

import java.util.Date;

public class Contato {

	private String nome;

	private String telefone;
	
	private String serial;

	private Date data;

	private Operadora operadora;

	public Contato() {
	}

	public Contato(String serial, String nome, String telefone, Date data, Operadora operadora) {
		this.serial = serial;
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.operadora = operadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

}
