package Heran�a;

public class Pregui�a extends Animal {

	private int M�diadeVidaTr�s;
	
	public Pregui�a (String Cadeia,String Habita, String Brinquedo, int M�diadeVidaTr�s) {
		super(Cadeia);
		this.M�diadeVidaTr�s = M�diadeVidaTr�s;
	}

	public int getM�diadeVidaTr�s() {
		return M�diadeVidaTr�s;
	}

	public void setM�diadeVidaTr�s(int m�diadeVidaTr�s) {
		M�diadeVidaTr�s = m�diadeVidaTr�s;
	}
	public void imprimi() {
		System.out.println("A pregui�a est� no Planeta " + getCadeia() + " e a soma dos tr�s animais com a m�dia � de "+ M�diadeVidaTr�s + " anos");
	}
	

}
