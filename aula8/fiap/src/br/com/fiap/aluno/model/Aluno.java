package br.com.fiap.aluno.model;

public class Aluno {
	// O privado só acessa dentro da mesma classe.
	private String nome;
	
	private int idade;

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
	

}
