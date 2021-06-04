package PrimeiroPassos;

import java.util.Scanner;

public class DescubraValordeD {
	
	public static void main(String[] args) {
		float a, b, c, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Informe o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Informe o valor de C: ");
		c = leia.nextFloat();
		
		R = (a + b);
		R = (float) Math.pow(R,2);
		
		S = (b + c);
		S = (float) Math.pow(S,2);
		
		D = (R + S) / 2;
		
		System.out.printf("\nValor de R: %2.2f", R);
		System.out.printf("\nValor de S: %2.2f", S);
		System.out.printf("\nValor de D: %2.2f", D);
		
		leia.close();
		
		
	}

}
