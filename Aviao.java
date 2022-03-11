package br.com.generation.orientacaoaobjetos;

public class Aviao {
	
	String modelo;
	String companhiaArea;
	int nAssentos;
	
	void decolagem() {
		System.out.println("iniciando a decolagem do: " + modelo);
	}
	
	void aterrissagem () {
		System.out.println("iniciando a aterrissagem do: " + modelo);
	}
}
