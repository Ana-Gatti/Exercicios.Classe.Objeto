package br.com.generation.orientacaoaobjetos;

public class TesteAviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.modelo = " Boeing 777-200ER";
		aviao1.companhiaArea = "GOL";
		aviao1.nAssentos = 440;
		
		aviao1.decolagem();
		aviao1.aterrissagem();
		
		System.out.println();
		
		aviao2.modelo = " Airbus A350-1000";
		aviao2.companhiaArea = "AZUL";
		aviao2.nAssentos = 480;
		
		aviao2.decolagem();
		aviao2.aterrissagem();
	}

}
