package automatoPilha;

public class Pilha {
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	//construtor
	public Pilha(int limite) {
		this.limite = limite;
	}
	public int getTopo() {
		return topo.getDado();
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	//inserir na pilha
	public void inserir(int dado, char elemento) {
		Nodo novo = new Nodo(dado, elemento);
//		Nodo inicial = new Nodo(0, 'z');
//		if(novo == null) {
//			novo.setProx(inicial);
//		}
		if (temEspaco()) {
			novo.setProx(topo);
			System.out.println(novo.getElemento());
			topo = novo;
			tamanho++;  
		}else {
			System.out.println("Pilha cheia");
		}
	}
	//Remover da pilha
	public void remover() {
		if(!estaVazio()) {
			System.out.println("|");

			while(topo != null) {
				System.out.println(topo.getElemento());
				topo = topo.getProx();
				tamanho--;
			}
		}else {
			System.out.println("Pilha está vazia");
		}
	}
	
	//Mostra pilha
	public void mostrarPilha() {
		if(estaVazio()) {
			return ;
		}
		Nodo aux = topo;
		while(aux != null) {
			System.out.print(aux.getElemento());
			aux = aux.getProx();
		}
		
		
		
		
	}
	
	
}