package br.com.generation.orientacaoaobjetos;

public class TestaProdutoEletronico {
	
	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		ProdutoEletronico produto2 = new ProdutoEletronico();
		
		
		produto1.tipo = "Ventilador";
		produto1.marca = "Mondial";
		produto1.valor = 110.00;
		
		produto1.ligar();
		produto1.ventilar();
		produto1.desligar();
		
		System.out.println();
		
		produto2.tipo = "Televisor";
		produto2.marca = "Sony";
		produto2.valor = 2500.00;
		
		produto2.ligar();
		produto2.assistir();
		produto2.desligar();
		
		
	}

}
