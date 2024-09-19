package br.com.usp.rh.model;

public class AlunoUsp extends PessoaUsp {
	
	private String rm;

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public AlunoUsp(String rm) {
		super();
		this.rm = rm;
	}
	
	@Override
	public void comer() {
		
		System.out.println( " Aluno da usp comendo ");
	}
	
	@Override
	public void andar(float distancia) {
		System.out.println(" O aluno andou a distância " + distancia); 
	}
	
	public void imprimirNomeDaPessoa() {
		
		System.out.println( " O nome da pessoa é :  "  + nome);
		
	}
	
	public void estudar() {
		
		System.out.println( " Aluno estuda para prova ");
		
	}
	
	public void comer(String tipoComida) {
		
		System.out.println( " Aluno comendo  " + tipoComida);
	}

	
	
}
