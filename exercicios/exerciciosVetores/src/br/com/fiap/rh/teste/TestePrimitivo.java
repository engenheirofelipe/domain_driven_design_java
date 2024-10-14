package br.com.fiap.rh.teste;

import java.util.Scanner;

import br.com.fiap.rh.model.Pessoa;

public class TestePrimitivo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
	
		Pessoa pessoa = new Pessoa();
		
		// Criando vetor idades
		int idades[] = new int[5];
		System.out.println("Digite a idade da pessoa");
		idades[0] = leitura.nextInt();
	
		System.out.println("Digite a idade da pessoa");
		idades[1] = leitura.nextInt();
		
		System.out.println("Digite a idade da pessoa");
		idades[2] = leitura.nextInt();
		
		System.out.println("Digite a idade da pessoa");
		idades[3] = leitura.nextInt();
		
		System.out.println("Digite a idade da pessoa");
		idades[4] = leitura.nextInt();
		
		pessoa.somarIdade(idades);
		
		pessoa.verificarMaiorMenor(idades);
		
		pessoa.calcularMedia(idades);
		
		
		
		
		
	}

}
