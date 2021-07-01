package Taya;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3;
		
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o numero 1");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com o numero ");
		n2 = leia.nextFloat();
		
		System.out.println("\nEntre com o numero 3");
		n3 = leia.nextFloat();
		
		
		System.out.println("\nA média pondera é: " + ((n1*2) + (n2*3) + (n3*5))/10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
