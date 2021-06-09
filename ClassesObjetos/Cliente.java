package ClassesObjetos;

public class Cliente {

	private String nome;
	private String produto;
	private int quantidade;
	
	public Cliente (String n, String p, int q)
	{
		this.setNome(n);
		this.setProduto(p);
		this.setQuantidade(q);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void imprimirInfo(){
		System.out.println(nome+produto+quantidade);
	}
	
	
	
}
