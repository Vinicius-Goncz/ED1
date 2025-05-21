
public class FilaVet implements IFila {
    private int numElementosFila;
    private int inicio;
    private Object[] vetorFila;

    public FilaVet(int tamanhoFila) {
        this.numElementosFila = 0;
        this.inicio = 0;
        this.vetorFila = new Object[tamanhoFila];
    }

    @Override
    public boolean adicionar(Object info) {
        if (this.numElementosFila == vetorFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.numElementosFila) % this.vetorFila.length;
        this.vetorFila[fim] = info;
        this.numElementosFila++;
        return true;
    }

    @Override
    public boolean remover() {
        if (this.estaVazia()){
            System.out.println("Fila está vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetorFila.length;
        this.numElementosFila--;
        return true;
    }

    @Override
    public boolean estaVazia() {
        return this.numElementosFila == 0;
    }

    @Override
    public int tamanho() {
        return this.numElementosFila;
    }

    public void imprimirFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.print("Fila: [");
        for (int i = 0; i < this.numElementosFila; i++) {
            int indice = (this.inicio + i) % this.vetorFila.length;
            System.out.print(this.vetorFila[indice]);
            if (i < this.numElementosFila - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        FilaVet fila = new FilaVet(5);

        System.out.println("Adicionando elementos:");
        fila.adicionar(10);
        fila.imprimirFila();
        fila.adicionar(20);
        fila.imprimirFila();
        fila.adicionar(30);
        fila.imprimirFila();
        fila.adicionar(40);
        fila.imprimirFila();
        fila.adicionar(50);
        fila.imprimirFila();
        fila.adicionar(60);

        System.out.println("\nRemovendo elementos:");
        fila.remover();
        fila.imprimirFila();
        fila.remover();
        fila.imprimirFila();
        fila.adicionar(60);
        fila.imprimirFila();
        fila.adicionar(70);
        fila.imprimirFila();

        System.out.println("\nTamanho final da fila: " + fila.tamanho());
        fila.remover();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.imprimirFila();
        System.out.println("A fila está vazia? " + fila.estaVazia());
    }
}