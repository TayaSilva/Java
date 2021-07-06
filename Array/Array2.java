package Taya;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que receba 6 números inteiros e mostre:
	• Os números pares digitados;
	• A soma dos números pares digitados;
	• Os números ímpares digitados;
	• A quantidade de números ímpares digitados.
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
				System.out.println("O numero é par");
			}
			
			else
			{
				quant = quant + 1;
				System.out.println("O numero é impar");
			}
		}
		
				System.out.println(" A soma dos numeros pares é: " + soma);
				System.out.println(" Quantidade de numeros impares é: " + quant);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
