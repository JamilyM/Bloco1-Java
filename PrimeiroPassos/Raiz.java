package PrimeiroPassos;

import java.util.Scanner;

public class Raiz {

	public static void main(String[] args) {
		
		float x, y, d, p1, p2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de X: ");
		x = leia.nextFloat();
		System.out.println("Informe o valor de Y: ");
		y = leia.nextFloat();
		
		p1 = (x*2 - x*1);
		p1 = (float) Math.pow(p1, 2);
		
		p2 = (y*2 - y*1);
		p2 = (float) Math.pow(p2, 2);
		
		d = p1 + p2;
		d = (float)Math.sqrt(d);
		
		System.out.printf("\nValor de D: %2.2f", d);
		
		leia.close();
					
		
	}
}
