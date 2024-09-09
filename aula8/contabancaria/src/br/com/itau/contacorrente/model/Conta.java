package br.com.itau.contacorrente.model;

public class Conta {
	
	private float saldo;
	
	private float valor;
	
	
	
	public Conta(float saldo, float valor) {
		super();
		this.saldo = saldo;
		this.valor = valor;
	}
	public void sacar(float valor) {
		saldo -= valor;
	}
							// parametro valor
	public void depositar(float valor) {
		//  This faz eferencia ao atributo da classe.
		this.saldo += valor;
	}

	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void imprimirSaldo() {
		System.out.println(" O saldo da conta é " + saldo + "");
	}
}
