package br.com.zoo.cadastroanimais.teste;

import br.com.zoo.cadastroanimais.model.Animal;
import br.com.zoo.cadastroanimais.model.Ave;
import br.com.zoo.cadastroanimais.model.Mamifero;

public class Teste {

	public static void main(String[] args) {
		
		Ave ave = new Ave(19,"Branco","Aguia",5);
		ave.voar();
		ave.acasalar();
		ave.fazerAniversario();
		
		
		Mamifero mamifero = new Mamifero(12.9,"Angus",15);
		mamifero.comer();
		mamifero.dormir();
		mamifero.fazerAniversario();
		mamifero.setIdade(15);
		
		Ave ave1 = new Ave(25.5,"Branco","Aguia",5);
		Ave ave2 = new Ave(20,"Vermelho","Aguia",5);
		
		Mamifero mamifero1 = new Mamifero(20.6,"Cervo",20);
		Mamifero mamifero2 = new Mamifero(5.6,"Cavalo",23);
		
		
		Animal[] animais = new Animal[4];
		animais[0] = ave1;
		animais[1] = ave2;
		animais[2] = mamifero1;
		animais[3] = mamifero2;
		
		for(int i = 0; i < animais.length; i++) {
			
			System.out.println(animais[i].getRaca());
			System.out.println(animais[i].getQuantidadeFilhos());
			
		}
		
		for(int i = 0; i < animais.length; i++) {
			for(int j = 0; j < 10; j++) {
				animais[i].fazerAniversario();
			}
			System.out.println(animais[i].getRaca() + " tem a idade atual " + animais[i].getIdade() );
		}
		
	}

}
