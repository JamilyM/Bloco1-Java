package LaçosRepetição;

import java.util.Scanner;

public class IdadesWhile {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade=0, contmaior=0, contmenor=0;
		System.out.println("Quando quiser sair do laço, informe o valor -99");
		System.out.println("Quais são as idades?");
		idade= leia.nextInt();
		
		while (idade!= -99) 
		{
			if (idade <= 21) {
				contmenor++;
			} else if (idade >= 50) {
				contmaior++;
			}
			System.out.println("Quais são as idades?");
			idade= leia.nextInt();

		}
		
		System.out.println("Tem "+contmenor+" pessoas menores de 21 anos");
		System.out.println("Tem "+contmaior+" pessoas maior de 50 anos");
		
		leia.close();
		
	}
	

}
