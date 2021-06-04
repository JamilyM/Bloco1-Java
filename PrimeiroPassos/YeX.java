package PrimeiroPassos;

import java.util.Scanner;

public class YeX {
	
	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Informe o valor B: ");
		b = leia.nextFloat();
		System.out.println("Informe o valor C: ");
		c = leia.nextFloat();
		System.out.println("Informe o valor D: ");
		d = leia.nextFloat();
		System.out.println("Informe o valor E: ");
		e = leia.nextFloat();
		System.out.println("Informe o valor F: ");
		f = leia.nextFloat();
		
		y = (a*f - c*a) / (a*e - b*d);
		x = (c*e - b*f) / (a*e - b*d);
		
		System.out.println("Valor de Y:" + y);
		System.out.println("Valor de X:" + x);
		
		leia.close();
	}

}
