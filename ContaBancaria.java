package br.com.generation.orientacaoaobjetos;

public class ContaBancaria {

	String cpf;
	String nome;
	double saldo;
	double saldoatual;
	
	void transferir(){
		System.out.println("Coletando dados para a transfer�ncia. Seu saldo � de: "
				+ saldo+ " reais");
	}
	
	void pagar(){
		System.out.println("Boleto pago com sucesso! Seu saldo atual � de: "
				+ saldoatual+ " reais");
		
	}
	
}
