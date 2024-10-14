package br.com.fiap.rh.teste;

import java.util.Scanner;

import br.com.fiap.rh.model.Pessoa;

public class TestePrimitivo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		int idades[] = new 	int[5];
		
		System.out.println(" Digite a primeira idade ");
		idades[0] = leitura.nextInt();
		
		System.out.println(" Digite a segunda idade ");
		idades[1] = leitura.nextInt();
		
		System.out.println(" Digite a terceira idade ");
		idades[2] = leitura.nextInt();
		
		System.out.println(" Digite a quarta idade ");
		idades[3] = leitura.nextInt();
		
		System.out.println(" Digite a quinta idade ");
		idades[4] = leitura.nextInt();
	
		pessoa.calcularSoma(idades);
		pessoa.maiorMenor(idades);
		pessoa.calcularMedia(idades);
		pessoa.contarElementosParesImpares(idades);
		
		
		
		

	}

}
