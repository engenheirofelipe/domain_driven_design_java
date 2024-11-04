package br.com.zoo.cadastroanimais.teste;

import br.com.zoo.cadastroanimais.model.Animal;
import br.com.zoo.cadastroanimais.model.Ave;
import br.com.zoo.cadastroanimais.model.Mamifero;

/*
 * 
 * Questões para avaliação

Domínio da empresa: www.zoo.com.br

Nome do sistema: Cadastro de Animais

	•	Crie os pacotes com a semântica e convenção de nomenclatura correta. (10 Pontos)
	AVALIACAO: OK
	Nota: 10 Pontos

	•	Crie uma classe Ave com algumas características e pelo menos 2 comportamentos. (10 Pontos)
	AVALIACAO: OK
	Nota: 10 Pontos

	•	Crie uma classe Mamífero com algumas características e pelo menos 2 comportamentos. (10 Pontos)
	AVALIACAO: Faltou get/set para quantidadeMamas
	Nota: 8 Pontos

	•	Crie uma classe Animal com algumas características comuns entre os animais e o método fazerAniversário que soma a idade do animal. Esse método precisa(obrigatoriamente) ser preenchido pelas subclasses. (20 Pontos)
	AVALIACAO: Não precisa 2 métodos fazer aniversario por tipo de animal
	Nota: 15 Pontos

	•	Documente as assinaturas dos métodos de todas as classes com javadoc. Em alguns métodos utilize bloco de comentários e linha de comentário. (10 Pontos)
	AVALIACAO: Não implementado
	Nota: 0 Pontos

	•	Em uma classe de teste, crie um Array de objetos que seja preenchido com algumas aves e mamíferos, esses também com os seus respectivos dados, e logo após, seja percorrido e impresso as informações neles contidos. (20 Pontos)
	AVALIACAO: Falotu a implementaçao de todos indices do vetor
	Nota: 15 Pontos

	•	Na mesma classe de teste, valide a implementação do método fazerAniversário, utilizando um loop de 10 iterações (dez anos). Ao final, imprima a idade do animal. (20 Pontos)
	AVALIACAO: Problema na execução
	Nota: 10 Pontos
	
	Nota Final: 68 pontos
 */

public class Teste {

	public static void main(String[] args) {
		
		Ave ave = new Ave(19,"Pombo");
		ave.voar();
		ave.acasalar();
		ave.fazerAniversarioAve();
		
		
		Mamifero mamifero = new Mamifero(12.9,23);
		mamifero.comer();
		mamifero.dormir();
		mamifero.fazerAniversarioMamifero();
		mamifero.setIdade(15);
		
		Ave ave1 = new Ave(25.5,"Tucano");
		Ave ave2 = new Ave(20,"Aguia");
		
		Mamifero mamifero1 = new Mamifero(20.6,13);
		Mamifero mamifero2 = new Mamifero(5.6,6);
		
		
		Animal[] animais = new Animal[4];
		animais[0] = ave1;
		animais[1] = ave2;
		animais[2] = mamifero1;
		animais[3] = mamifero2;
		
		Ave[] aves = new Ave[10];
		
		for(int i = 0; i < animais.length; i++) {
			
			System.out.println(animais[i].getRaca());
			System.out.println(animais[i].getQuantidadeFilhos());
			
		}
		
		for(int i = 0; i < animais.length; i++) {
			for(int j = 0; j < 10; j++) {
				animais[i].fazerAniversário();
			}
			System.out.println(animais[i].getRaca() + " tem a idade atual " + animais[i].getIdade() );
		}
		
	}

}
