package La�osRepeti��o;

import java.util.Scanner;

public class M�diapor3DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, soma=0, m�dia, cont=0;
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

		m�dia = soma / cont;
		
		System.out.println("\nM�dia dos n�meros informados � " + m�dia);
		System.out.println("A soma de todos os n�meros informados �: " + soma);

		leia.close();

	}

}
