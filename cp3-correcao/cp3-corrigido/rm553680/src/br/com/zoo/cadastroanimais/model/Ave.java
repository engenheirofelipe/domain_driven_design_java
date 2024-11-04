package br.com.zoo.cadastroanimais.model;

public class Ave extends Animal {
	
	private double peso;
	
	private String cor;
	

	public Ave() {
		super();
	}

	public Ave(double peso, String cor, String raca, int idade) {
		super();
		this.peso = peso;
		this.cor = cor;
		this.raca = raca;
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void voar() {
		System.out.println("A ave de peso " + peso + " da cor " + cor + " está se alimentando");
	}
	
	public void acasalar() {
		System.out.println("A ave de peso " + peso + " da cor " + cor + " está acasalando");
	}

	@Override
	public int fazerAniversario() {
		
		idade++;
		return idade;
		
		
	}
	



	

}
