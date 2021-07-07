package Taya;

public class TesteClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente pessoa1 = new Cliente ("Talita", "432.654.257-12", "talita@gmail.com");
		
		pessoa1.saidaInfo();
		
		Cliente pessoa2 = new Cliente ("Cleitinho", "clitonzika24sp@gmail.com");
		pessoa2.saidaInfo();
		
		
		Cliente pessoa3 = new Cliente ("qJulha", "123.345.567-00", "julha2021@hotmail.com");
		pessoa3.saidaInfo();
		System.out.println("\n***MUDANÇA DE NOME***");
		pessoa3.setNomeCliente("Alexandre");
		pessoa3.saidaInfo();
		System.out.println("\n***MUDANÇA DE ENDEREÇO DE EMAIL");
		pessoa3.setEmail("xandao2021@gmail.com");
		pessoa3.saidaInfo();
		
		
		
		
		
	}

}
