package Array;

import java.util.Scanner;

public class ParÍmparesArrayLinha {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int[] numeros = new int[6];
			float somapar = 0, contimpar = 0;
			int x;

			for (x = 0; x < 6; x++) {
				System.out.println("Informe o valor: ");
				numeros[x] = leia.nextInt();
				if (numeros[x] % 2 == 0) {
					somapar += numeros[x];
				} else {
					contimpar++;
				}
			}

			for (x = 0; x < 6; x++) {
				if (numeros[x] % 2 == 0) {
					System.out.printf(numeros[x] + " <-- Par\n");
				} else
					System.out.printf(numeros[x] + " <-- Ímpar\n");
			}
			System.out.printf("\nSoma dos valores pares: %2.0f", somapar);
			System.out.printf("\nA quantidade de valores ímpares: %2.0f", contimpar);
		}

	}

}
