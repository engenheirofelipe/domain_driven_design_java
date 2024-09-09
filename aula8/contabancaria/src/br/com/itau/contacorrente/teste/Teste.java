package br.com.itau.contacorrente.teste;

import br.com.itau.contacorrente.model.Conta;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta(100,100);
		conta.imprimirSaldo();
		conta.sacar(50);
		conta.depositar(150);
		conta.imprimirSaldo();
	}
}
