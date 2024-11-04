package br.com.zoo.cadastroanimais.model;

public class Mamifero extends Animal {
	
	private double altura;
	
	private int quantidadeMamas;
	

	public Mamifero() {
		super();
	}

	public Mamifero(double altura, int idade) {
		super();
		this.altura = altura;
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void comer() {
		System.out.println("Mamifero comendo");
	}
	
	public void dormir() {
		System.out.println("Mamifero dormindo");
	}
	
	@Override
	public int fazerAniversarioMamifero() {
		
		idade += idade;
		
		System.out.println(" O mamifero tem a idade de : " + idade);
		
		return idade;
		
	}

	@Override
	public int fazerAniversarioAve() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	

}
