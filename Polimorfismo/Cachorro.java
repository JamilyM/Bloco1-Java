package Polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro() 
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome(String Nome) {
		System.out.println("O nome do cachorro: " + Nome);
	}
    @Override
    public void Idade(int Idade) {
    	System.out.println("Idade: " + Idade);
    }
    @Override 
    public void Som (String Som) {
    	System.out.println("Som: " + Som );
    }
    public void Correr (String Correr) {
    	System.out.println("O cachorro corre, mas não gosta tanto");
    }
}
