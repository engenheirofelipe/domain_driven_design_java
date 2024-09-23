package br.com.fiap.rh.model;

public class Professor extends Pessoa {
	
	private String inscricao;
	
	private String disciplina;

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Professor(String inscricao, String nome, String disciplina,int idade,String sexo) {
		super();
		this.inscricao = inscricao;
		this.nome = nome;
		this.disciplina = disciplina;
		this.idade =  idade;
		this.sexo =  sexo;
		
	}
	

	
	@Override
	public void registrarPresenca() {
		
		System.out.println(" Professor faltou ");
		
	}

	@Override
	public void cadastrar() {
	
		System.out.println(" Cadastrando professor inscricao: " + this.inscricao + "Nome : " + this.nome + " Disciplina: " + this.disciplina + " Idade : " + idade + " Sexo :" + sexo );
		
	}


	

}
