package br.com.zoo.cadastroanimais.model;

public abstract class Animal {
	
	protected String raca;
	
	protected int quantidadeFilhos;
	
	public int idade;
	
	
	

	public Animal() {
		super();
		
	}

	

	public Animal(String raca, int quantidadeFilhos, int idade) {
		super();
		this.raca = raca;
		this.quantidadeFilhos = quantidadeFilhos;
		this.idade = idade;
	}



	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getQuantidadeFilhos() {
		return quantidadeFilhos;
	}

	public void setQuantidadeFilhos(int quantidadeFilhos) {
		this.quantidadeFilhos = quantidadeFilhos;
	}
	

	
	public abstract int fazerAniversarioAve();
	
	public abstract int fazerAniversarioMamifero();




	
		
	

	
	

}
