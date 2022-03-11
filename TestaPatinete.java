package br.com.generation.orientacaoaobjetos;

public class TestaPatinete {
	
	
	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		
		pat1.marca = "veloster";
		pat1.cor = "vermelho";
		pat1.valor = 1400.00;
		
		pat1.acelerar();
		pat1.freiar();
		
		System.out.println();
		
		pat2.marca = "Extreme";
		pat2.cor = "Amarelo";
		pat2.valor = 1380.00;
		
		pat2.acelerar();
		pat2.freiar();
		
		
		
		
		
				
		
		
	}

}
