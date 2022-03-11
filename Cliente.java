package br.com.generation.orientacaoaobjetos;

public class Cliente {

		String nome;
		String cpf;
		String endereco;
		String profissao;
		int idade;
		
		void escolherProduto(){
			System.out.println("Cliente " + nome + " escolhendo produto");
		}
		
		void comprarProduto(){
			System.out.println("Cliente " + nome + " concluindo a compra");
		}
		
}