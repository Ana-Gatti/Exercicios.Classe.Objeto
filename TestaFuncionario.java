package br.com.generation.orientacaoaobjetos;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
	
	Funcionario funcionario1 = new Funcionario();
	Funcionario funcionario2 = new Funcionario();
	
	funcionario1.nome = "Maria";
	funcionario1.cpf = "555.555.555.55";
	funcionario1.cargo = "Desenvolvedora JAVA Jr.";
	funcionario1.dataAdmissao = "01/03/2021";
	funcionario1.salario = 4500.00;
	
	funcionario1.trabalhar();
	
	System.out.println();
	
	funcionario2.nome = "João";
	funcionario2.cpf = "333.333.333-33";
	funcionario2.cargo = "Desenvolvedor JAVA Jr.";
	funcionario2.dataAdmissao = "12/09/2019";
	funcionario2.salario = 5800.00;
	
	funcionario2.trabalhar();
}
}