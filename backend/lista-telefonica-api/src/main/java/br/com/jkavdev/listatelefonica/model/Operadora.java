package br.com.jkavdev.listatelefonica.model;

public class Operadora {

	private String nome;

	private String codigo;

	private String categoria;

	private int preco;

	public Operadora() {
	}

	public Operadora(String nome, String codigo, String categoria, int preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
