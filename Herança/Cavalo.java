package Herança;

public class Cavalo extends Animal {
	
	private String Habita;
	
	 public Cavalo (String Cadeia, String Habita){
		 super(Cadeia);
		 this.Habita = Habita;
	 }

	public String getHabita() {
		return Habita;
	}

	public void setHabita(String habita) {
		this.Habita = habita;
	}
	public void imprimir() {
		System.out.println("O cavalo está no Planeta " + getCadeia() + " e localizado no "+ Habita);
	}


}
