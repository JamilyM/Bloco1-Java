package Polimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void Nome(String Nome) {
		System.out.println("O nome do Cavalo: " + Nome);
	}
	@Override
	public void Idade(int Idade) {
		System.out.println("Idade: " + Idade);
	}
	@Override
	public void Som(String Som) {
		System.out.println("Som: " + Som);
	}
    public void Correr(String Correr) {
    	System.out.println("O cavalo gosta de correr");
    }
	
}
