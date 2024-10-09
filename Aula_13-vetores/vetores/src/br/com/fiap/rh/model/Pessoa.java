package br.com.fiap.rh.model;

public class Pessoa {
	
	private String nome;
	
	private int idade;
	
	private String documento;
	
	private float altura;
	
	private Contato[] contatos;
	
	
	public Pessoa(String nome, int idade, String documento, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
		this.altura = altura;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		
		System.out.println("A pessoa " + this.nome + " da idade " + this.idade + " tem os contatos  abaixo:");
		
		for(int i = 0; i < contatos.length; i++ ) {
			System.out.println( "Tipo do contato: " + contatos[i].getTipoContato() + " contato: " + this.contatos[i].getDescricaoContato());
		}
		
	}
	
	public Contato obterContatoPorTipo(String tipoContato) {
		
		// Verificar na lista o tipo do contatos e retornar no método.
		
		return null;
	}
	
	
	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
