package br.com.fiap.controle.model;

public class Aluno {
	
	private String nome;
	
	private int idade;
	
	private float altura;
	
	private boolean autorizadoPelosPais;
	
	
	public Aluno(String nome, int idade, float altura, boolean autorizadoPelosPais) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.autorizadoPelosPais = autorizadoPelosPais;
	}


	/*
	 * Exemplo de estrutura de controle usando if, else e else if
	 * 
	 */
	public void controlarInscricaoEnsinoSuperior() {
		
		if( this.idade >= 17 ) {
			System.out.println("Inscricao liberada! ");
			
		} else if (this.idade < 17 && autorizadoPelosPais) {
			System.out.println("Inscricao liberada! ");
			
		} else {
			System.out.println("Inscricao nao permitida!");
		}
	}
	
	public int definirFaixaNota(int nota) {
		int faixaNota = 0;
		if(nota == 100) {
			faixaNota = 100;
		} else if(nota >= 90 && nota < 100) {
			faixaNota = 90;
		} else if(nota >= 80 && nota < 90) {
			faixaNota = 80;
		} else if(nota >= 70 && nota < 80) {
			faixaNota = 70;
		} else if(nota >= 60 && nota < 70) {
			faixaNota = 60;
		}
		return faixaNota;
		
	}
	
	
	public boolean verificarNivelExcepcional(int faixaNota) {
		
		boolean nivelExcepcional;
		
		switch (faixaNota) {
		
		case 100: {
			System.out.println("Aluno Excepcional");
			nivelExcepcional = true;
			break;
		}
		case 90: {
			System.out.println("Aluno otimo");
			nivelExcepcional =  false;
			break;
		}
		case 80: {
			System.out.println("Aluno bom");
			nivelExcepcional =  false;
			break;
		}
		case 70: {
			System.out.println("Aluno regular");
			nivelExcepcional =  false;
			break;
		}
		default:
			System.out.println("Aluno reprovado");
			nivelExcepcional =  false;
			break;
		}
		return nivelExcepcional;
	}
	
	public int verificarOutrosNiveis(int faixaNota) {
		
		int classificacao; // 1 - Excepcional / 2 - Otimo / 3 - Bom / 4 - Outros
		
		switch (faixaNota) {
		
		case 100: {
			System.out.println("Aluno Excepcional");
			classificacao = 1;
			break;
		}
		case 90: {
			System.out.println("Aluno otimo");
			classificacao =  2;
			break;
		}
		case 80: {
			System.out.println("Aluno bom");
			classificacao =  3;
			break;
		}
		case 70: {
			System.out.println("Aluno regular");
			classificacao =  4;
			break;
		}
		default:
			System.out.println("Aluno reprovado");
			classificacao =  4;
			break;
		}
		return classificacao;
	}
	
	public void verificarDesconto(boolean alunoExcepcional) {
		if(alunoExcepcional) {
			System.out.println("Aluno recebera desconto de 100%");
		}
	}
	
	public void verificarDescontoPorNiveis(int nivel) {
		
		switch (nivel) {
		
		case 1: {
			System.out.println("Aluno recebera desconto de 100%");
			break;
		}
		case 2: {
			System.out.println("Aluno recebera desconto de 80%");
			break;
		}
		case 3: {
			System.out.println("Aluno recebera desconto de 60%");
			break;
		}
		default:
			System.out.println("Aluno nao recebera desconto.");
		}

	}
	
	public void verificarTodasAsNotas(int[] listaDeNotas) {
		
		for(int i = 0; i < listaDeNotas.length; i++) {
			
			System.out.println(" Posição da nota " + i + " do array. ");
			
			int faixaNota = definirFaixaNota(listaDeNotas[i]);
			
			int classificacao = verificarOutrosNiveis(faixaNota);
			
			verificarDescontoPorNiveis(classificacao);
			
			System.out.println(" ####### FIM ######");
		}	
	}
	
	public void verificarTodasAsNotasWhile(int[] listaDeNotas) {
		
		int i = 0;
		
		while(i < listaDeNotas.length) {
			
			int faixaNota = definirFaixaNota(listaDeNotas[i]);
			
			int classificacao = verificarOutrosNiveis(faixaNota);
			
			verificarDescontoPorNiveis(classificacao);
			
			System.out.println(" ####### FIM ######");
			i++;
			
		}
	}
	
	
	
	public void verificarTodasAsNotasDoWhile(int[] listaDeNotas) {
			
			int i = 0;
			
			do {
				
				System.out.println(" Posição da nota " + i + " do array. ");
				
				int faixaNota = definirFaixaNota(listaDeNotas[i]);
				
				int classificacao = verificarOutrosNiveis(faixaNota);
				
				verificarDescontoPorNiveis(classificacao);
				
				System.out.println(" ####### FIM ######");
				i++;
				
			} while(i < listaDeNotas.length);
				
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
