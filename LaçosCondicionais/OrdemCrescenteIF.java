package LaçosCondicionais;

import java.util.Scanner;

public class OrdemCrescenteIF {
	
	public static void main(String[] args) {
		
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o primeiro valor: ");
		a = leia.nextFloat();
		System.out.println("Informe o segundo valor: ");
		b = leia.nextFloat();
		System.out.println("Informe o terceiro valor: ");
		c = leia.nextFloat();
		
		if (a<=b && b<=c) {
			System.out.print(a + ",m " + b + " e " + c);
		}
		else if (a<=c && c<=b) {
			System.out.println(a + " " + c + " e " + b);
		}
		else if (b<=a && a<=c) {
			System.out.println(b + " " + a + " e " + c);
		}
		else if (b<=c && c<=a) {
			System.out.println(b + " " + c + " e " + a);
		}
		else if (c<=a && a<=b) {
			System.out.println(c + " " + a + " e " + b);
		}
		else {
			System.out.println(c + " " + b + " e " + a);
		}
		
		
		
		leia.close();
	}

}
