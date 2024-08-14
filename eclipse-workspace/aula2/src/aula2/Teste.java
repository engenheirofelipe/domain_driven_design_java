package aula2;

public class Teste {

	public static void main(String[] args) {
		
		Mesa mesa = new Mesa();
		mesa.altura = 100;
		mesa.comprimento = 300;
		mesa.largura = 100;
		mesa.cor="branco";
		mesa.material="Madeira";
		mesa.apoiar();
		mesa.calcularArea();

		
	}
}
