package LaçosCondicionais;

import java.util.Scanner;

public class ClassificaçãoCase {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a idade, através da escolha: ");
		System.out.println("(1) 10 à 14 idade");
		System.out.println("(2) 15 à 17 idade");
		System.out.println("(3) 18 à 25 idade");
		System.out.println("\nQual das três opções? ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\nSua Categoria é Infatil");
			break;
		case 2:
			System.out.println("\nSua Categoria é Juvenil");
			break;
		case 3:
			System.out.println("\nSua Categoria é Adulta");
			break;
		default:
			System.out.println("\nOpção Inválida");
			break;	
		}
		
		leia.close();
			

	}
}
