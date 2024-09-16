package br.com.fiap.controle.teste;

import br.com.fiap.controle.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Evando Borges", 16, 1.79f, true);
		//aluno.controlarInscricaoEnsinoSuperior();
		
		//aluno.verificarDesconto(aluno.verificarNivel(100));
		
		//boolean nivelAluno = aluno.verificarNivelExcepcional(100);
		
		//aluno.verificarDesconto(nivelAluno);
		
		
		// int faixaNota = aluno.definirFaixaNota(63);
		// int classificacaoAluno = aluno.verificarOutrosNiveis(faixaNota);
		// aluno.verificarDescontoPorNiveis(classificacaoAluno);
		
		int listaNotas[] = {43,98,75,82,100,97,92,65};
	     // usando for aluno.verificarTodasAsNotas(listaNotas);
		aluno.verificarTodasAsNotasWhile(listaNotas);

	}

}
