package br.com.generation.orientacaoaobjetos;

public class TestaPaciente {
	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		
	
		paciente1.nome = "Maria";
		paciente1.cpf = "123445678655";
		paciente1.conv�nio = "Unimed";
		
		paciente1.agendar();
		paciente1.consultar();
		
		System.out.println();
		
		paciente2.nome = "Aparecida";
		paciente2.cpf = "15578623456";
		paciente2.conv�nio = "Particular";
		
		paciente2.agendar();
		paciente2.consultar();
		

	}
}