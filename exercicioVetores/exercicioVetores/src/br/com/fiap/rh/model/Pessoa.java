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
	
	public Contato obterContatoPorTipo(String tipoContato) {
		
		// Verificar na lista o tipo do contatos e retornar no método.
		
		return null;
	}
	
	public void calcularSoma(int idades[]) {
		
		int somaElementos = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			somaElementos += idades[i];
			
		}
		
		System.out.println(" A soma das idades é : " + somaElementos);
		
	}
	
	public void maiorMenor(int idades[]) {
		
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
		
		System.out.println(" A maior idade é : " + maior);
		System.out.println(" A menor idade é : " + menor);
		
	}
	
	public void calcularMedia(int idades[]) {
		
		int somaElementos = 0;
		int mediaElementos = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			somaElementos += idades[i];
			
		}
		
		mediaElementos = somaElementos / idades.length;
		
		System.out.println(" A media das idades é : " + mediaElementos);
		
	}
	
	public void contarElementosParesImpares(int idades[]) {
		
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			if(idades[i] % 2 == 0) {
				
				pares++;
			
			} else {
				
				impares++;
				
			}
		}
		
		System.out.println(" A quantidade de números pares é : " + pares);
		System.out.println(" A quantidade de números impares é : " + impares);
		
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