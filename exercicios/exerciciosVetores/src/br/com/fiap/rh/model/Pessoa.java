package br.com.fiap.rh.model;



public class Pessoa {
	
private String nome;
	
	private int idade;
	
	private String documento;
	
	private float altura;
	
	private Contato[] contatos;
	
	
	
	public Pessoa() {
		super();
	
	}

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
	
	public void somarIdade(int idades[]) {
		
		int somaIdades = 0;
				
		for(int i = 0; i < idades.length; i++) {
			
			somaIdades += idades[i];
			
		}
		
		System.out.println("A soma das idades é : " + somaIdades );
	}
	
	
	public void verificarMaiorMenor(int idades[]) {
		
		int maior = 0;
		int menor = idades[0];
	
		for(int i = 0; i < idades.length; i++) {
			
			if(idades[i] > maior) {
				
				maior = idades[i];
			}
		
		}
		
		for(int j = 0; j < idades.length; j++) {
					
			if(idades[j] < menor) {
				
				menor = idades[j];
				
	
			}	
		}
		System.out.println(" O maior elemento é : " + maior);
		System.out.println(" O menor elemento é : " + menor);
	}
	
	
	public void calcularMedia(int idades[]) {
			
			int media = 0;
			int somaIdades = 0;
					
			for(int i = 0; i < idades.length; i++) {
			
			somaIdades += idades[i];
				
			}
			
			media = somaIdades / idades.length;
			
			System.out.println("A média das idades é : " + media);
		}
	
	public void elementosParesImpares(int idades[]) {
		
		int pares = 0;
		int somaIdades = 0;
				
		for(int i = 0; i < idades.length; i++) {
		
		somaIdades += idades[i];
			
		}
		
		media = somaIdades / idades.length;
		
		System.out.println("A média das idades é : " + media);
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
