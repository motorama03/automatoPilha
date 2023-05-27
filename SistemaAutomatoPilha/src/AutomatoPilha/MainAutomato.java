package AutomatoPilha;

public class MainAutomato {

	public static void main(String[] args) {
		
		Pilha pilhaAutomato = new Pilha(10);
		
		System.out.println("O elemento x indica a mudança de estado que é feita no sistema \n apartir dos métodos booleanos verificaX() e verificaIgualdade()");
		System.out.println("Esta pilha ira inserir enquanto o topo != de x, após isso ele \n chamará a função remover CASO o topo da pilha seja igual ao valor passado após o x");
		
		pilhaAutomato.inserir(0, 'z');
		pilhaAutomato.inserir(1, 'a');
		pilhaAutomato.inserir(2, 'b');
		pilhaAutomato.inserir(3, 'x');
		pilhaAutomato.inserir(4, 'b');
		pilhaAutomato.inserir(5, 'a');
		
		
		System.out.println("EM CASOS DE TESTE. Caso houve algum equivoco na hora da inserção, \n o erro será sinalizado no desenvolvimento do code");
	}
}
