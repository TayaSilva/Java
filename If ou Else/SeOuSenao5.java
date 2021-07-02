package Taya;


import java.util.Scanner;
import java.lang.Math;

public class SeOuSenao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
		
		float num1;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = leia.nextInt();
		
		if (num1 %2 ==0)
		{
			System.out.println(" o numero é par e a raiz é: " + Math.sqrt(num1));
		}
		else
		{
			System.out.println(" o numero é impar e ele ao quadrado é: " + Math.pow(num1, 2) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
