package Taya;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.And;

public class SeOuSenao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor: ");
		num1 = leia.nextInt();
		
		
		System.out.println("Entre com o segundo valor: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		num3 = leia.nextInt();
		
		
		if (num1 > num2 && num1> num3)
			
		{
			System.out.println("O " + num1 + " é o maior valor ");
			
		}
		
		else if ( num2 > num1 && num2>num3)
		{
			System.out.println("O " + num2 + " é o maior valor ");
		}
		
		else 
		{
			System.out.println("O " + num3 + " é o maior valor ");
		}
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
