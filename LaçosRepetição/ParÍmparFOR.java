package LaçosRepetição;

import java.util.Scanner;

public class ParÍmparFOR {
	public static void main(String[] args) {

		float num;
		int contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);

		for (int x=1; x<=10; x++)
	{
		System.out.println("Informe os valores: ");
		num = leia.nextFloat();

		if (num%2==0) {
			contpar++;
		} else {
			contimpar++;
		}
	}

		System.out.println("A quantidade de par digitado: "  + contpar);
		System.out.println("A quantidade de ímpar digitado: " + contimpar);
		
		leia.close();

	}

}
