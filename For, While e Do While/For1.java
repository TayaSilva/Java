package Taya;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
		
		int num, x, contpar=0, contaimp=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<=10; x++)
		{
		System.out.println("Digite o primeiro numero: ");
		num = leia.nextInt();
		
		if(num %2 ==0)
		{
			contpar = contpar +1;
		}
		
		
		else 
		{
			contaimp = contaimp + 1;
		}
		
		
			
		}
		
		
			System.out.println("Temos " + contaimp + " numero(s) impares ");
		
			System.out.println("Temos " + contpar + " numero(s) pares ");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
