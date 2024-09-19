package br.com.usp.rh.teste;

import br.com.usp.rh.model.AlunoUsp;
import br.com.usp.rh.model.ProfessorUsp;

public class TesteUsp {

	public static void main(String[] args) {
		
		AlunoUsp alunoUsp = new AlunoUsp("");
		
		alunoUsp.setNome("Felipe");
		alunoUsp.imprimirNomeDaPessoa();
		alunoUsp.comer("feijão");
		alunoUsp.andar(259);
		alunoUsp.estudar();
		
		ProfessorUsp professorUsp = new ProfessorUsp("");
		
		professorUsp.andar(20);
		professorUsp.comer();
		professorUsp.ensinar();
		
	}

}
