package automatoPilha;

public class MainAutomato {

	public static void main(String[] args) {
		
		Pilha pilhaAutomato = new Pilha(10);
		
		pilhaAutomato.inserir(0, 'z');
		pilhaAutomato.inserir(1, 'a');
		pilhaAutomato.inserir(2, 'a');
		pilhaAutomato.inserir(3, 'a');
		pilhaAutomato.inserir(4, 'X');
		pilhaAutomato.inserir(5, 'a');
		pilhaAutomato.inserir(6, 'a');
		pilhaAutomato.inserir(7, 'a');
		pilhaAutomato.inserir(8, 'b');
		pilhaAutomato.inserir(9, 'b');
		
//		pilhaAutomato.mostrarPilha();
		pilhaAutomato.remover();

	}
	
	// delta(q,a,A) = (q,AA)
	
	// delta(p,a,A) = (q,E)
	
	
}
