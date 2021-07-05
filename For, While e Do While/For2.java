package Taya;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/
		int num;
		
		for ( num=1000; num < 2000; num++){
		    if (num%11==5) {
		        System.out.println("O numero "+ num + " é dividor de 11 e sobra 5 ");
		    }
		}
	
		
		
		
		
		/*
		 * PROF EU FIZ A ATIVIDADE DE DOIS JEITOS PQ NÃO SEI EXATAMENTE QUAL ERA O CORRETO, MAS OS DOIS FUNCIONAM
		
		int num,x, cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<2; x++)
		{
			System.out.println("Digite o primeiro numero: ");
			num = leia.nextInt();
			
			if(num%11 == 5)
			{
				cont= cont +1;
				System.out.println("É divisor ");
				
			}
			else
			{
				System.out.println("Não é divisor ");
			}
		}
		
				System.out.println("Tivemos " + cont + " numeros dividores de 11");
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
