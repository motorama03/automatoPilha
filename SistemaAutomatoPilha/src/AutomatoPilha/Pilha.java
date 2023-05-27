package AutomatoPilha;

public class Pilha {
    private Nodo topo;
    private int tamanho = 0;
    private int limite = 0;

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

    public void inserir(int dado, char elemento) {
        Nodo novo = new Nodo(dado, elemento);
        if (novo.getElemento() != 'a' && novo.getElemento() != 'b' && novo.getElemento() != 'z' && novo.getElemento() != 'x') {
            System.out.println("Elemento não aceito, pois foi passado um valor diferente de 'a', 'b', 'z' ou 'x'.");
            return;
        }
        if (verificaX()) {
            if (elemento != 'x') {
                if (verificaIgualdade(elemento)) {
                    remover(elemento);
                    System.out.println(elemento + " foi removido.");
                    return;
                } else {
                    System.out.println(elemento + " é diferente do topo da pilha. Portanto, a cadeia não é aceita!");
                    return;
                }
            } else {
                System.out.println("Não é possível inserir 'x' após o caractere 'x'.");
                return;
            }
        }
        if (temEspaco()) {
            System.out.println(elemento + " foi inserido.");
            novo.setProx(topo);
            topo = novo;
            tamanho++;
        } else {
            System.out.println("Pilha cheia. Não é possível inserir mais elementos.");
        }
    }

    public void remover(char elemento) {
        if (!estaVazio()) {
            while (topo != null && topo.getElemento() == elemento) {
                topo = topo.getProx();
                tamanho--;
            }
        } else {
            System.out.println("Pilha está vazia. Não há elementos para remover.");
        }
    }

    public void mostrarPilha() {
        if (estaVazio()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        Nodo aux = topo;
        while (aux != null) {
            System.out.print(aux.getElemento());
            aux = aux.getProx();
        }
        System.out.println();
    }

    public boolean verificaX() {
        Nodo aux = topo;
        while (aux != null) {
            if (aux.getElemento() == 'x') {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public boolean verificaIgualdade(char elemento) {
        Nodo aux = topo;
        while (aux != null) {
            if (aux.getElemento() == elemento) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }
}