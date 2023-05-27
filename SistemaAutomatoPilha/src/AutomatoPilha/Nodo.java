package AutomatoPilha;

public class Nodo {
	
	private int dado;
	private char elemento;
	private Nodo prox;
	
	Nodo(int dado, char elemento){
		this.dado = dado;
		this.elemento = elemento;
		prox = null;
	}
//	Nodo(int dado){
//		this.dado = dado;
//		prox = null;
//	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public char getElemento() {
		return elemento;
	}

	public void setElemento(char elemento) {
		this.elemento = elemento;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
	
	
	
}
