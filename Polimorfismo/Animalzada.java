package Polimorfismo;

import java.util.Scanner;

public class Animalzada {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x;
	    Cavalo cavalo = new Cavalo();
	    Cachorro cachorro = new Cachorro();
	    Preguica pregui�a = new Preguica();
	    
	    System.out.println("Qual � nome do Cavalo?");
	    String Nome = leia.next();
	    System.out.println("Idade?");
	    int Idade = leia.nextInt();
	    System.out.println("E o som?");
		String Som = leia.next();
		
		cavalo.Nome(Nome);
		cavalo.Idade(Idade);
		cavalo.Som(Som);
		
	    cavalo.Correr(null);;
		
		System.out.println("\nDeseja agora:");
		System.out.println("1-Cachorro\n2-Pregui�a");
		x = leia.nextInt();
		
		switch(x) {
		     case 1:
		    	System.out.println("Qual � nome do Cachorro?");
		 	    String nome = leia.next();
		 	    System.out.println("Idade?");
		 	    int idade = leia.nextInt();
		 	    System.out.println("E o som?");
		 		String som = leia.next();
		 	
		 		cachorro.Nome(nome);
		 		cachorro.Idade(idade);
		 		cachorro.Som(som);
		 		cachorro.Correr(null);
		 		break;
		     case 2:
		 	    System.out.println("Qual � nome da pregui�a?");
		 	    String nomec = leia.next();
		 	    System.out.println("Idade?");
		 	    int idadec = leia.nextInt();
		 	    System.out.println("E o som?");
		 		String somc = leia.next();
		 		
		 		pregui�a.Nome(nomec);
		 		pregui�a.Idade(idadec);
		 		pregui�a.Som(somc);
		 		pregui�a.SubirEmArvores(null);
		 		break;
		   default:
			   System.out.println("Tudo bem, at� a pr�xima =)");
			   break;
		}
		
		leia.close();
	}

}
