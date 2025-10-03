public class Fila {
    private Object[] elementos;
    private int inicio;
    private int fim;
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enfileirar(Object elemento) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia");
            return;
        }
        fim = (fim + 1) % capacidade; 
        elementos[fim] = elemento;
        tamanho++;
    }

    public Object desenfileirar(){
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return null;
        }
        Object elemento = elementos[inicio];
        inicio = (inicio + 1) % capacidade; 
        tamanho--;
        return elemento;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public Object verInicio(){
        if (estaVazia()) {
            return null;
        }
        return elementos[inicio];
    }

    public int getTamano(){
        return tamanho;
    }
}
