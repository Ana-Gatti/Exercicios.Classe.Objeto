package br.com.generation.orientacaoaobjetos;

public class TestaContaBancaria {

	public static void main(String[] args) {

		ContaBancaria contbanc1 = new ContaBancaria();
		ContaBancaria contbanc2 = new ContaBancaria();

		contbanc1.cpf = "12345678910";
		contbanc1.nome = "Idalina";
		contbanc1.saldo = 1750.00;
		contbanc1.saldoatual = 1390.00;

		contbanc1.transferir();
		contbanc1.pagar();

		System.out.println();

		contbanc2.cpf = "98765432123";
		contbanc2.nome = "Lúcia";
		contbanc2.saldo = 3290.00;
		contbanc2.saldoatual = 2800.00;

		contbanc2.transferir();
		contbanc2.pagar();

	}
}
