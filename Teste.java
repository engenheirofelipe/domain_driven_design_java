package aula1;

import java.util.Scanner;

//  Public class é uma palavra reservada pois possui um relevo , public static void

public class Teste {
	

	public static void main(String[] args) {	
		
		System.out.println("Iniciando aqui...");
		
		// Pegar valores que digitou via input in do sistema no command line
		Scanner entrada = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = entrada.next();
		
		System.out.println("Digite o nome da matricula");
		aluno.matricula=entrada.next();
		
		System.out.println("Digite o nome da idade");
		aluno.idade= entrada.nextShort();
		
		System.out.println("Digite o nome do genero");
		aluno.genero= entrada.next();
		
		aluno.estudarMuito();
		aluno.comer("salada");
		
		
		Aluno nathan = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		nathan.nome=entrada.next();
		
		System.out.println("Digite o nome da matricula");
		nathan.matricula=entrada.next();
		
		System.out.println("Digite o nome da idade");
		nathan.idade=entrada.nextShort();
		
		System.out.println("Digite o nome do genero");
		nathan.genero=entrada.next();
		nathan.estudarMuito();
		nathan.comer("chocolate");
		
		
		Mesa mesa = new Mesa();
		
		System.out.println("Digite a marca da mesa");
		nathan.nome=entrada.next();
		
		System.out.println("Digite a altura");
		mesa.altura = entrada.nextShort();
		
		System.out.println("Digite o comprimento");
		mesa.comprimento = entrada.nextShort();
		
		System.out.println("Digite a largura");
		mesa.largura =entrada.nextShort();
		
		System.out.println("Digite a cor");
		mesa.cor=entrada.next();
		
		System.out.println("Digite o material");
		mesa.material=entrada.next();
		mesa.apoiar();
		mesa.calcularArea();
		
		entrada.close();
		
		System.out.println("Finalizando aqui...");
		
	}

}
