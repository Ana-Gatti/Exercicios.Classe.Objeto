package br.com.generation.orientacaoaobjetos;

public class Paciente {
	
	String nome;
	String conv�nio;
	String cpf;
	
	void consultar(){
		System.out.println("paciente " +nome + " est� aguardando na sala de espera!!");
	}
	
	void agendar () {
		System.out.println("paciente " +nome + " agendada para o dia 19/01");
	}
}
