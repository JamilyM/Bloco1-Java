package ClassesObjetos;

public class Avião {

		private String marca;
		private String destino;
		private int preço;

		public Avião (String m, String d, int p)
		{
			this.setMarca(m);
			this.setDestino(d);
			this.setPreço(p);
		}
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public int getPreço() {
			return preço;
		}

		public void setPreço(int preço) {
			this.preço = preço;
		}

		public void imprimirInf()
		{
			System.out.println(marca+destino+preço);
		}

	}


