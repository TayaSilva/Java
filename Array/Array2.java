package Taya;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
	� Os n�meros pares digitados;
	� A soma dos n�meros pares digitados;
	� Os n�meros �mpares digitados;
	� A quantidade de n�meros �mpares digitados.
		 */
		
		int [] num = new int [6];
		int soma=0, x, quant=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<6; x++)
		{
			System.out.println("\nEscreva um numero");
			num[x] = leia.nextInt();
			
			if(num[x] %2 == 0)
			{
				soma = soma + num[x];
				System.out.println("O numero � par");
			}
			
			else
			{
				quant = quant + 1;
				System.out.println("O numero � impar");
			}
		}
		
				System.out.println(" A soma dos numeros pares �: " + soma);
				System.out.println(" Quantidade de numeros impares �: " + quant);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
