package ClassesObjetos;

public class Execu��oEletro {
	
	public static void main(String[] args) {
  	  
  	  Eletronico [] domestico = new Eletronico [3];
  	  domestico[0]= new Eletronico ("Geladeira: ","manter os alimentos refrigerados ");
  	  domestico[1]= new Eletronico ("Microonas: ","esquenta a comida ");
  	  domestico[2]= new Eletronico ("Ventilador: ","mantem o ar fresco");
  	  
  	  for (Eletronico outraroda:domestico)
  	  {
  		  outraroda.imprimirInfo();
  	  }

   }
}
