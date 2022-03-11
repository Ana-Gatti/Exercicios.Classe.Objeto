package br.com.generation.orientacaoaobjetos;

public class ProdutoEletronico {
	
	String tipo;
	String marca;
	double valor;
	
	void ligar(){
		System.out.println("Status: ON");
	}
	void ventilar(){
		System.out.println("velocidade 3 ");
	}
	void assistir(){
		System.out.println("Selecione o canal");
	}
	void desligar(){
		System.out.println("Status: OFF");
	}
}
