package ClassesObjetos;

public class Execu��oAvi�o {
	     
		public static void main(String[] args) {
	    	  
	    	  Avi�o[] Vamos = new Avi�o[3];
	    	  Vamos[0]= new Avi�o ("Gol ","Paris ", 3000);
	    	  Vamos[1]= new Avi�o ("Aero ","Eua ",2000);
	    	  Vamos[2]= new Avi�o ("Via ","Canad� ",1000);
	    	  
	    	  for (Avi�o outraroda:Vamos)
	    	  {
	    		  outraroda.imprimirInf();
	    	  }
			
		}
		

}
