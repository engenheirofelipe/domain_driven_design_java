package br.com.usp.rh.model;

public class PessoaUsp {
	
	protected String nome;
	
	protected int idade;
	
	protected String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void comer() {
		
		System.out.println( " Pessoa da usp comendo ");
	}
	
	public void andar(float distancia) {
		
		System.out.println( " Pessoa da usp  andou  " + distancia + "metros");
	}
	
	public void correr(float distancia) {
		
		System.out.println( " Pessoa da usp  correu  " + distancia + "metros");
	}

}
