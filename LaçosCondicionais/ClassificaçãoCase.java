package La�osCondicionais;

import java.util.Scanner;

public class Classifica��oCase {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a idade, atrav�s da escolha: ");
		System.out.println("(1) 10 � 14 idade");
		System.out.println("(2) 15 � 17 idade");
		System.out.println("(3) 18 � 25 idade");
		System.out.println("\nQual das tr�s op��es? ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\nSua Categoria � Infatil");
			break;
		case 2:
			System.out.println("\nSua Categoria � Juvenil");
			break;
		case 3:
			System.out.println("\nSua Categoria � Adulta");
			break;
		default:
			System.out.println("\nOp��o Inv�lida");
			break;	
		}
		
		leia.close();
			

	}
}
