package Taya;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		int seg;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva quantos segundo foram usados: ");
		seg = leia.nextInt();
		
		
		System.out.println("\n foram usados " + (seg/3600) + "hora(s)" + (seg%60) + "minuto(s)" + (seg%1) + "segundo(s)" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
