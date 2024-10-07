package br.com.banco.creditobancario.model;

/**
 * Superclasse Conta criada para fazer herança.
 * @param - 
 */

public abstract class Conta {
	
	protected int numeroAgencia;
	
	protected int numeroConta;
	
	protected double credito;
	
	protected double debito;
	
	protected double saldo;
	
	protected String cliente;
	
	/**
	 * Método para sacar um valor
	 * @param valor
	 */
	public abstract void sacar(double valor);
	
	/**
	 * Método para depositar um valor
	 * @param valor
	 */
	public abstract void depositar(double valor);
	
	/**
	 * Método para exibir saldo
	 */
	public abstract void exibirSaldo();
	
	/**
	 * Recebe o numero da agencia
	 * @return
	 */
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * Insere o numero da agencia
	 * @param numeroAgencia
	 */
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * Recebe o numero da conta
	 * @return numeroConta
	 */
	public int getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Insere o valor do numero da conta
	 * @param numeroConta
	 */
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Recebe o credito
	 * @return credito
	 */
	public double getCredito() {
		return credito;
	}

	/**
	 * Insere o credito
	 * @param credito
	 */
	public void setCredito(double credito) {
		this.credito = credito;
	}

	
	/**
	 * Recebe o debito
	 * @return debito
	 */
	public double getDebito() {
		return debito;
	}

	/**
	 * Insere o debito
	 * @param Retorna o debito
	 */
	public void setDebito(double debito) {
		this.debito = debito;
	}

	
	/**
	 * Recebe saldo
	 * @return retorna o saldo
	 */
	protected double getSaldo() {
		return saldo;
	}

	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Recebe cliente
	 * @return Retorna cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Insere o valor de cliente.
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
