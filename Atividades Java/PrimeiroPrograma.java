package Taya;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nescreva a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nescreva a segundaa nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nescreva a terceira nota: ");
		nota3 = leia.nextFloat();

		media= (nota1 + nota2 + nota3)/3;
	}
}
