package LaçosRepetição;

import java.util.Scanner;

public class Médiapor3DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, soma=0, média, cont=0;
		System.out.println("Informe o valor: ");
		num = leia.nextInt();
		
		do {
			
			if(num%3==0) {
				soma = soma + num;
				cont++;
			}
			System.out.println("Informe o valor: ");
			num = leia.nextInt();
			
		} while (num != 0);

		média = soma / cont;
		
		System.out.println("\nMédia dos números informados é " + média);
		System.out.println("A soma de todos os números informados é: " + soma);

		leia.close();

	}

}
