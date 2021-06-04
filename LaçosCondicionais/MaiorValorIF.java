package LaçosCondicionais;

import java.util.Scanner;

public class MaiorValorIF {

	public static void main(String[] args) {

		float num1, num2, num3;

		Scanner leia = new Scanner(System.in);
		System.out.println("Saiba qual é o maior numero");
		System.out.println("Informe o primeiro valor: ");
		num1 = leia.nextFloat();
		System.out.println("Informe o segundo valor: ");
		num2 = leia.nextFloat();
		System.out.println("Informe o terceiro valor: ");
		num3 = leia.nextFloat();

		if (num1 == num2 && num1 > num3) {
			System.out.println("O maior número foi o primeiro e o segundo informado");
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("O maior número foi o primeiro e o terceiro informado");
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("O maior número foi o segundo e o terceiro informado");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número foi o primeiro informado");
		} else if (num1 < num2 && num2 > num3) {
			System.out.println("O maior número foi o segundo informado");
		} else if (num1 < num3 && num1 < num3) {
			System.out.println("O maior número foi o terceiro informado");
		} else {
			System.out.println("Todos os números são iguais");
		}

		leia.close();

	}

}
