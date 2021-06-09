package Herança;

public class Animal {
	
	 public String Cadeia;
	 
	 public Animal (String Cadeia) {
		super();
		this.Cadeia = Cadeia;
	 }

	public String getCadeia() {
		return Cadeia;
	}

	public void setCadeia(String cadeia) {
		Cadeia = cadeia;
	}
	public void imprimirInfo() {
		System.out.println(Cadeia);
	}
	
}
