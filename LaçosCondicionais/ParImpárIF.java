package La�osCondicionais;

import java.util.Scanner;

public class ParImp�rIF {
	public static void main(String[] args) {
		
		int num, raiz, elevado;	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o um n�mero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			raiz = (int) Math.sqrt(num);
			System.out.println("O n�mero � par e a sua raiz � " + raiz);
			
		} else if (num % 2 != 0) {
			elevado = (int) Math.pow(num, 2);
			System.out.println("O n�mero � �mpar e a sua pot�ncia � " + elevado);
		}

		leia.close();
			
	}
		
}


