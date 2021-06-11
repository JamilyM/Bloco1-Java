package ColletionsEu;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList<String>();
		
		Scanner leia = new Scanner (System.in);
		int op;
		
		do	{

		System.out.println("Digite a opção:");
		System.out.println("1- Armazenar dados no estoque\n2-Remover dados do estoque\n"
				+ "3-Atualizar dados do estoque\n4-Apresentar todos os dados do estoque");
		op= leia.nextInt();
		
		switch(op) {
		    case 1:
		    	leia.nextLine();
				System.out.println("Informe o produto do estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
		    case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto que deseja remover: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de"+verifica+" : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
					
				}
				else
				{
					System.out.println("\nProduto não existe");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa");
		}
	}while(op!=0);
		
		leia.close();
	}
}
