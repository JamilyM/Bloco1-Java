package Polimorfismo;

public abstract class Animal {

	private String TipoAnimal;
	
	abstract public void Nome (String Nome);
	abstract public void Idade (int Idade);
	abstract public void Som (String Som);
	
	public Animal(String tipoAnimal)
	{
		this.TipoAnimal = tipoAnimal;
	}
	
	public String getTipoAnimal() {
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
}

