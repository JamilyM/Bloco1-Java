package LaçosRepetição;

import java.util.Scanner;

public class somaInteiroDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, soma=0;
		System.out.println("Informe o valor: ");
		num = leia.nextInt();
		
		do {
			soma = soma + num;
			System.out.println("Informe o valor: ");
			num = leia.nextInt();
		} while (num != 0);

		System.out.println("A soma de todos os números informados é: " + soma);
		
		leia.close();
	}

}
