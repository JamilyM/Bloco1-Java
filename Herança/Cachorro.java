package Herança;

public class Cachorro extends Animal{

	private String Brinquedo;
	
	 public Cachorro (String Cadeia,String habita, String Brinquedo){
	    super(Cadeia);
	    this.Brinquedo = Brinquedo;
	}

	public String getBrinquedo() {
		return Brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		Brinquedo = brinquedo;
	}
	public void imprimiri() {
		System.out.println("O cachorro está na " +getCadeia() +" e gosta de "+ Brinquedo);
	}
	
}
