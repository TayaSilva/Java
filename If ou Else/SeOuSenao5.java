package Taya;


import java.util.Scanner;
import java.lang.Math;

public class SeOuSenao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
		
		float num1;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = leia.nextInt();
		
		if (num1 %2 ==0)
		{
			System.out.println(" o numero � par e a raiz �: " + Math.sqrt(num1));
		}
		else
		{
			System.out.println(" o numero � impar e ele ao quadrado �: " + Math.pow(num1, 2) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
