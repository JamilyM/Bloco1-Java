package ClassesObjetos;

public class Eletronico {

	private String Produto;
	private String Utilidade;
	
	public Eletronico (String p, String u)
	{
		this.setProduto(p);
		this.setUtilidade(u);
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public String getUtilidade() {
		return Utilidade;
	}

	public void setUtilidade(String utilidade) {
		Utilidade = utilidade;
	}
	public void imprimirInfo(){
		System.out.println(Produto+Utilidade);
	}
	
}
