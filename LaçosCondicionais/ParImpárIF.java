package LaçosCondicionais;

import java.util.Scanner;

public class ParImpárIF {
	public static void main(String[] args) {
		
		int num, raiz, elevado;	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o um número: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			raiz = (int) Math.sqrt(num);
			System.out.println("O número é par e a sua raiz é " + raiz);
			
		} else if (num % 2 != 0) {
			elevado = (int) Math.pow(num, 2);
			System.out.println("O número é ímpar e a sua potência é " + elevado);
		}

		leia.close();
			
	}
		
}


