package br.com.banco.creditobancario.model;

/**
 * Subclasse conta corrente
 */
public class ContaCorrente extends Conta {
	
	private double limite;
	
	/**
	 *  Construtores definidos para conta corrente
	 * @param numeroAgencia
	 * @param numeroConta
	 * @param credito
	 * @param debito
	 * @param cliente
	 * @param limite
	 */
	public ContaCorrente(int numeroAgencia, int numeroConta, double credito, double debito, String cliente, double limite) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.credito = credito;
		this.debito = debito;
		this.cliente = cliente;
		this.limite = limite;
	}

	/**
	 * Recebe o valor de limite
	 * @return Retorna o limite
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * Define o valor de limite
	 * @param limite
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	/**
	 * Função para sacar um valor  na conta corrente 
	 * @param A função tem o parâmetro valor
	 */
	public void sacar(double valor) {
		this.saldo -= valor;
		System.out.println("Efetuado o saque de R$ " + valor);
	}

	@Override
	/**
	 * Função para depositar um valor na conta corrente 
	 * @param A função tem o parâmetro valor
	 */
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Efetuado o deposito de R$ " + valor);
		
	}

	@Override
	/**
	 * Função para exibir saldo na conta corrente 
	 * 
	 */
	public void exibirSaldo() {
		System.out.println("O saldo da conta corrente " + this.numeroConta + " agencia " + this.numeroAgencia + " é " + this.saldo);
		
	}
}
