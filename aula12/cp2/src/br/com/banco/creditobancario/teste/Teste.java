package br.com.banco.creditobancario.teste;

import br.com.banco.creditobancario.model.ContaCorrente;
import br.com.banco.creditobancario.model.ContaPoupanca;

/*
 * Classe Teste criada no dia 07/10/2024
 */

public class Teste {


/**
 * Método principal da minha aplicação
 * 
 * @author labsfiap - Felipe
 * @version Ultima
 * 
 * @param args - Argumento de entrada
 */


	public static void main(String[] args) {
		
		/**
		 * Instanciando conta corrente
		 * 
		 */
		ContaCorrente contaCorrente = new ContaCorrente(100, 100, 10, 10, "Evando", 10d);
		contaCorrente.depositar(100);
		contaCorrente.depositar(50);
		contaCorrente.exibirSaldo();
		contaCorrente.sacar(50);
		contaCorrente.sacar(20);
		contaCorrente.exibirSaldo();
		contaCorrente.depositar(50);
		contaCorrente.exibirSaldo();
		
		/**
		 * Instanciando conta poupança
		 * 
		 */
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNumeroConta(100);
		contaPoupanca.setNumeroAgencia(100);
		contaPoupanca.setCredito(10);
		contaPoupanca.setDebito(10);
		contaPoupanca.setCliente("Evando");
		contaPoupanca.setRendimento(100);
		
		contaPoupanca.depositar(250);
		contaPoupanca.exibirSaldo();
		contaPoupanca.sacar(50);
		contaPoupanca.sacar(80);
		contaPoupanca.exibirSaldo();
		contaPoupanca.sacar(80);
		contaPoupanca.exibirSaldo();
	
	}

}
