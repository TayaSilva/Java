package Taya;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
		
		
		int idade=0, menos21=0, mais50=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99)
		{
		System.out.println("Entre com a idade ");
		idade = leia.nextInt();
		
			
			
			 if(idade<21)
			 {
				 menos21+= 1;
				 
			 }
			 else if (idade>50) 
			 {
				 mais50 += 1;
			 }
			 
			
			 
			}
		
				
			 System.out.println("Total de pessoas com menos de 21 anos é: " + menos21);
			 System.out.println("Total de pessoas com mais de 50 anos é: " + mais50);
			 
			 
			 
			 
	
		
		
		
		
		
		
		
		
		
		
	}

}
