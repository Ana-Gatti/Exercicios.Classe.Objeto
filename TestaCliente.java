package br.com.generation.orientacaoaobjetos;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.nome = "Ana";
		cliente1.cpf = "444.444.444-44";
		cliente1.endereco = "Rua Generation Brasil 10";
		cliente1.idade = 29;
		cliente1.profissao = "Desenvolvedora Java Full stack";
		
		cliente1.escolherProduto();
		cliente1.comprarProduto();
		
		System.out.println();
		
		cliente2.nome = "Rita";
		cliente2.cpf = "222.222.222-22";
		cliente2.endereco = "Rua Generation Brasil 11";
		cliente2.idade = 25;
		cliente2.profissao = "Autônoma";
		
		cliente2.escolherProduto();
		cliente2.comprarProduto();
		
		
	}

}
