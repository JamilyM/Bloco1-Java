package Polimorfismo;

public class Preguica extends Animal {
	
	public Preguica () {
		super("Preguiça");
	}
	
	@Override
	public void Nome (String Nome) {
		System.out.println("Nome da preguiça: " + Nome);
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
		System.out.println("As preguiças sobem em árvores");
	}
	

}
