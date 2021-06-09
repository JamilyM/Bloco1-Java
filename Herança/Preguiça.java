package Herança;

public class Preguiça extends Animal {

	private int MédiadeVidaTrês;
	
	public Preguiça (String Cadeia,String Habita, String Brinquedo, int MédiadeVidaTrês) {
		super(Cadeia);
		this.MédiadeVidaTrês = MédiadeVidaTrês;
	}

	public int getMédiadeVidaTrês() {
		return MédiadeVidaTrês;
	}

	public void setMédiadeVidaTrês(int médiadeVidaTrês) {
		MédiadeVidaTrês = médiadeVidaTrês;
	}
	public void imprimi() {
		System.out.println("A preguiça está no Planeta " + getCadeia() + " e a soma dos três animais com a média é de "+ MédiadeVidaTrês + " anos");
	}
	

}
