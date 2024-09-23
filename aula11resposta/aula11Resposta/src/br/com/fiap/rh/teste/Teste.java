package br.com.fiap.rh.teste;

import java.util.Scanner;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		Aluno aluno = new Aluno("553680", "Felipe", "Engenharia de Software " , 21 , " Masculino" );
		aluno.cadastrar();
		aluno.registrarPresenca();
		
		Professor professor = new Professor("2012", "Evando", "Domain Driven Java" , 45, " Masculino " );
		aluno.cadastrar();
		aluno.registrarPresenca();
		
	

	}

}
