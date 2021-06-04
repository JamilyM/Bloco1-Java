package LaçosRepetição;

import java.util.Scanner;

public class PsicologiaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, sexo, op, x=0;
		int contcalma=0,contnervosa=0,contpcalma=0,contagressivo=0,contocalma = 0; 

		
		while (x<=3) {
			
			System.out.println("Informe a idade: ");
			idade = leia.nextInt();
			System.out.println("Informe a opção: ");
			System.out.println("1- Mulher \n2- Homem \n3- Outro");
			sexo = leia.nextInt();
			System.out.println("Informe qual é Você: ");
			System.out.println("1- Calma \n2- Nervosa \n3- Agressivo");
			op = leia.nextInt();
			
			if (idade<=18 && op == 1) {
				contcalma++;
				
			}if(idade>=40 && op == 2){
				contnervosa++;
				
		    }if (op == 1) {
		    	contpcalma++;
		    	
		    }if (sexo == 1 && op == 2) {
		    	contnervosa++;
		    	
		    }if (sexo == 2 && op == 3) {
		    	contagressivo++;
		    	
		    }if (sexo == 3 && op == 1) {
		    	contocalma++;
		    	
		    }
			
			x++;
		}
		
		
		System.out.println("Pessoas calma " + contpcalma);
		System.out.println("Mulheres nervosas " + contnervosa);
		System.out.println("Homem agressivo " + contagressivo);
		System.out.println("Outro calmos " + contocalma);
		System.out.println("Maiores de 40 anos, que são nervosas " + contnervosa);
		System.out.println("Menores de 18 anos, que são calmas " + contcalma);
		
		leia.close();
		
	   }
}

