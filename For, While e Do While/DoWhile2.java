package Taya;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
		 */
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);

		
		do
		{
			System.out.println(" Entre com um  valor");
			num = leia.nextInt();
			
			soma = soma + num;
		}
		
		while (num!=0);
		System.out.println("A soma dos valores digitados é: " + soma);
		
		
		
		
	}

}
