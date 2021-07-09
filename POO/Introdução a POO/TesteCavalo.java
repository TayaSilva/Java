package Taya;

public class TesteCavalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(String nome,String idade, String som)
		Cavalo cavalo1 = new Cavalo ("Doris", "33", "Relinchar");
		cavalo1.saida();
		System.out.println("----ALTERAÇÃO NO NOME------");
		cavalo1.setNome("Flika");
		cavalo1.saida();
		
		Cavalo cavalo2 = new Cavalo ("Francisco", "12", "relinchar", "João Vitor", "123456789", "Corre", "Marrom");
		cavalo2.saida();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
