package ClassesObjetos;

public class Avi�o {

		private String marca;
		private String destino;
		private int pre�o;

		public Avi�o (String m, String d, int p)
		{
			this.setMarca(m);
			this.setDestino(d);
			this.setPre�o(p);
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

		public int getPre�o() {
			return pre�o;
		}

		public void setPre�o(int pre�o) {
			this.pre�o = pre�o;
		}

		public void imprimirInf()
		{
			System.out.println(marca+destino+pre�o);
		}

	}


