package Taya;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 * 
		 */
		
		int [] [] mat = new int [3][3];
		int l, c, valores=0;
		
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0; l<3; l++ )
		{
			for(c=0; c<3; c++)
			{
				System.out.println("Digite um numero: ");
				mat[l][c] = leia.nextInt();
				
				if(mat [l] [c] > 10)
				{
					valores = valores + 1;
				}
			}
			
		}
		
					System.out.println("Tivemos " + valores + " maiores do que 10");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
