package ClassesObjetos;

public class ExecuçãoCliente {
     
	public static void main(String[] args) {
    	  
    	  Cliente [] Mercado = new Cliente [3];
    	  Mercado[0]= new Cliente ("Jamily ","Doce ",3);
    	  Mercado[1]= new Cliente ("Luciana ","Feijão ",4);
    	  Mercado[2]= new Cliente ("Manu ","Bolacha ",7);
    	  
    	  for (Cliente outraroda:Mercado)
    	  {
    		  outraroda.imprimirInfo();
    	  }
		
	}
	
	
}
