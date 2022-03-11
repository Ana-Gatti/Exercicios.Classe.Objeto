package br.com.generation.orientacaoaobjetos;

public class Paciente {
	
	String nome;
	String convênio;
	String cpf;
	
	void consultar(){
		System.out.println("paciente " +nome + " está aguardando na sala de espera!!");
	}
	
	void agendar () {
		System.out.println("paciente " +nome + " agendada para o dia 19/01");
	}
}
