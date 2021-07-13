package Taya;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int el;
		Scanner leia = new Scanner(System.in);
		
		
		ArrayList<String> estoque =new ArrayList();
		
		do
		{
			System.out.println("\n (1) Deseja adicionar produto ao estoque? \n (2) Deseja Remover um produto? \n (3) Atualizar \n (4) Mostrar os produtos do estoque \n (0) Encerrar programa");
			
			
			System.out.println("digite sua opção");
			el = leia.nextInt();
			
			
			switch(el)
			{
			
			case 1:
				leia.nextLine();
				System.out.println("digite o produto para adicionar");
				String produto = leia.nextLine(); //Next line apenas para String
				estoque.add(produto);
			break;
			
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque");
				String produto1 = leia.nextLine();
			
			
			if(estoque.contains(produto1)) //contains é pra ver se o que foi digitado tem no estoque 
			{
				estoque.remove(produto1);
			}
			
			else
			{
				System.out.println("\nProduto não existe no estoque :( ");
			}
			break;
			
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = leia.nextLine();
				System.out.println("Digite o produto que você quer colocar no lugar de " + verifica);
				String novo = leia.nextLine();
			
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Produto fora do estoque");
				}
			
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos no estoque são " + estoque );
				break;
				
			default:
				System.out.println("Finalizamos o programa");
				
			
			
			
				
				
				
				
				
				
				
				
				
				
			
			
			}
			
			
		}
		
		while(el!=0);
		
		
		
		
	}

}
