package Taya;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
		 */
	
	int num, media=0,aux=0, res=0;
	
	Scanner leia = new Scanner(System.in);
	
	do
	{
		System.out.println("Digite um numero");
		num = leia.nextInt();
		
		if ( num%3 == 0 )
		{
			aux = aux + 1;
			media = media + num;
			res = media/aux;
			
		}
		
		
	}
	
		while (num != 0);
	
	System.out.println(" A média é: " + res);
			
	
	
	}

}
