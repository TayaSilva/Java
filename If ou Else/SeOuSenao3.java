package Taya;

import java.util.Scanner;

public class SeOuSenao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println(" Digite sua idade ");
		idade = leia.nextInt();
		
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Você faz parte do gurpo Infantil ");
		}
		
		 else if (idade>=15 && idade <=17)
		{
			System.out.println("Você faz parte do gurpo Juvenil ");
		}
		
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Você faz parte do gurpo Adulto ");
		}
		else
		{
			System.out.println("Digite um valo entre 10 e 25 anos ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
