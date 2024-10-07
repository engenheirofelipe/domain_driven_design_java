package br.com.banco.creditobancario.model;

/**
 * Subclasse conta poupança
 */
public class ContaPoupanca extends Conta {
	
	private double rendimento;

	/**
	 * 	Recebe o valor do rendimento
	 * 
	 */
	public double getRendimento() {
		return rendimento;
	}

	/**
	 * 	Define o valor do rendimento
	 * @param Parâmetro rendimento
	 */
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	/**
	 * Função para depositar um valor na conta poupança
	 * @param A função tem o parâmetro valor
	 */
	public void sacar(double valor) {
		this.saldo -= valor;
		System.out.println("Efetuado o saque de R$ " + valor);
	}

	@Override
	/**
	 * Função para depositar um valor na conta poupança
	 * @param A função tem o parâmetro valor
	 */
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Efetuado o deposito de R$ " + valor);
		
	}

	@Override
	/**
	 * Função para exibir saldo da conta poupança
	 * 
	 */
	public void exibirSaldo() {
		System.out.println("O saldo da conta poupança " + this.numeroConta + " agencia " + this.numeroAgencia + " é " + this.saldo);
		
	}

}
