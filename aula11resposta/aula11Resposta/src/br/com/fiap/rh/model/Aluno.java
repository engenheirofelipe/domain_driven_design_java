package br.com.fiap.rh.model;

public class Aluno extends Pessoa {
	

	private String rm;
	
	private String curso;

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(String rm, String nome, String curso, int idade, String sexo) {
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	@Override
	public void cadastrar() {
		
		System.out.println(" Cadastrando aluno  rm: " + this.rm + " Nome : " + this.nome + " Curso: " + this.curso + " Idade : " + idade + " Sexo :" + sexo);
	
		
	}
	
	@Override
	public void registrarPresenca() {
		
		System.out.println(" Presente ");
		
	}
	

}
