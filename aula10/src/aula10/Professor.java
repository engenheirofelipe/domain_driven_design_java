package aula10;

public class Professor extends Pessoa {
	
	private String pf;
	
	
	
	public String getPf() {
		return pf;
	}



	public void setPf(String pf) {
		this.pf = pf;
	}



	public void ensinar() {
		
		System.out.println("Professor ensinando");
		
	}

}
