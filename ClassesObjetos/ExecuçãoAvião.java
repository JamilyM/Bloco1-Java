package ClassesObjetos;

public class ExecuçãoAvião {
	     
		public static void main(String[] args) {
	    	  
	    	  Avião[] Vamos = new Avião[3];
	    	  Vamos[0]= new Avião ("Gol ","Paris ", 3000);
	    	  Vamos[1]= new Avião ("Aero ","Eua ",2000);
	    	  Vamos[2]= new Avião ("Via ","Canadá ",1000);
	    	  
	    	  for (Avião outraroda:Vamos)
	    	  {
	    		  outraroda.imprimirInf();
	    	  }
			
		}
		

}
