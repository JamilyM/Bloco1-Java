package Polimorfismo;

public class Preguica extends Animal {
	
	public Preguica () {
		super("Pregui�a");
	}
	
	@Override
	public void Nome (String Nome) {
		System.out.println("Nome da pregui�a: " + Nome);
	}
	@Override
	public void Idade (int Idade) {
		System.out.println("Idade: "+ Idade);
	}
	@Override
	public void Som (String Som) {
		System.out.println("Som: "+ Som);
	}
	public void SubirEmArvores (String Arvores){
		System.out.println("As pregui�as sobem em �rvores");
	}
	

}
