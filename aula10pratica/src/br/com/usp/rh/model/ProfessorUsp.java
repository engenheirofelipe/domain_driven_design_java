package br.com.usp.rh.model;

public class ProfessorUsp extends PessoaUsp {
	
	private String pf;

	public String getPf() {
		return pf;
	}

	public void setPf(String pf) {
		this.pf = pf;
	}

	public ProfessorUsp(String pf) {
		super();
		this.pf = pf;
	}
	
	public void ensinar() {
		
		System.out.println(" Professor ensinando a matéria ");
		
	}

	@Override
	public void comer()  {
		System.out.println("Professor comendo");
	}
	
	@Override
	public void andar(float distancia) {
		
		System.out.println(" O professor andou a distância " + distancia); 
		
	}
	
}
