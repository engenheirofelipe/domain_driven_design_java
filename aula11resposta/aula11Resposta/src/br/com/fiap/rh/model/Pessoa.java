package br.com.fiap.rh.model;

public abstract class Pessoa {
	
	protected int idade;
	
	protected String sexo;
	
	protected String nome;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Pessoa() {
		super();
	}

	public Pessoa(int idade, String sexo) {
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public abstract void  cadastrar();
		
	public abstract void registrarPresenca();		
	
	
	
}
