package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Contato;
import br.com.fiap.rh.model.Pessoa;

public class Teste {
	
	public static void main(String[] args) {
		
		/*int inteirosSemLimite[] = {};
		
		inteirosSemLimite[1] = 2;
		inteirosSemLimite[2] = 3;
		inteirosSemLimite[3] = 4;
		inteirosSemLimite[4] = 5;
		
		int inteirosComLimite[] = new int[5];
		inteirosComLimite[0] = 1;
		inteirosComLimite[1] = 2;
		inteirosComLimite[2] = 3;
		inteirosComLimite[3] = 4;
		inteirosComLimite[4] = 5;
		
		for(int indice = 0; indice <= inteirosComLimite.length; indice++) {
			
			System.out.println(inteirosComLimite[indice]);
			
		}*/
		
		// Crio o objeto pessoa
		Pessoa pessoa = new Pessoa("Evando", 123, "sdfsasdfa", 1.80f);
		
		// Criação dos contatos
		Contato contato1 = new Contato("celular", "11779879878");
		Contato contato2 = new Contato("email", "teste@teste.com");
		
		//Criação da lista de contatos
		Contato[] contatos = new Contato[2];
		contatos[0] = contato1;
		contatos[1] = contato2;
		
		// Atribuição da lista de contatos ao objeto pessoa
		pessoa.setContatos(contatos);
		
		pessoa.cadastrarPessoa(pessoa);
		
		
		
		
	}

}