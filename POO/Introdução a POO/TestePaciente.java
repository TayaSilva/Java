package Taya;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Paciente user1 = new Paciente ("Ana", "238273518", "anavianna@gmail.com");
		user1.infoSaida();
		
		Paciente user2 = new Paciente ("Gabriela Amanda dos Santos", "22", "(011) 92865 3281", "amandapjl21@gmail.com");
		user2.infoSaida();
		
		Paciente user3 = new Paciente ("Fernando Miguel de Oliveira Rosa","45","029.321.435-98","870206352", "AB-", "Rua Fernão dias, nº 213 - Jardim Nova São Paulo",
				"(011)98263-8362", "gadodavictoria@gmail.com");
		user3.infoSaida();
		
		System.out.println("\n******TELEFONE DESATUALZIADO, POR FAVOR INSIRA UM NOVO NUMERO*****");
		user3.setTelefone("(011)92543-4132");
		user3.infoSaida();
		
		
		
		
		
		
		
		
		
	}

}
