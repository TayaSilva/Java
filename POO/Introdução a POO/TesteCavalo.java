package Taya;

public class TesteCavalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(String nome,String idade, String som)
		Cavalo cavalo1 = new Cavalo ("Doris", "33");
		cavalo1.saida();
		cavalo1.emitirsom1();
		System.out.println("----ALTERAÇÃO NO NOME------");
		cavalo1.setNome("Flika");
		cavalo1.saida();
		
		Cavalo cavalo2 = new Cavalo ("Francisco", "12", "João Vitor", "123456789", "Corre", "Marrom");
		cavalo2.saida();
		cavalo2.emitirsom1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
