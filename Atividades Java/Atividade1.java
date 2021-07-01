package Taya;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int d1, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Escreva a sua idade em dias?: ");
		d1 = leia.nextInt();
		
		
		
		System.out.println("\n Sua idade em anos é "+ (d1/365));
		System.out.println("\n Sua idade em meses é: "+ (d1%365)/30);
		System.out.println("\n Sua idade em dias é: "+ (d1%365)%30);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
