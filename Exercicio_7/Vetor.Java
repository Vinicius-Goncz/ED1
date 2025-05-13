public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho++] = valor;
        }
    }

    public int obter(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        }
        throw new IndexOutOfBoundsException("Índice inválido");
    }

    public int getTamanho() {
        return tamanho;
    }
}
