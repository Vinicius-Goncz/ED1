import java.util.Random;

public class Vetor {
    private int[] dados;
    private int tamanho;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            dados[i] = rand.nextInt(10000); // valores entre 0 e 9999
        }
    }

    // Método iterativo para encontrar o maior elemento
    public int encontrarMaiorIterativo() {
        int maior = dados[0];
        for (int i = 1; i < tamanho; i++) {
            if (dados[i] > maior) {
                maior = dados[i];
            }
        }
        return maior;
    }

    // Método recursivo para encontrar o maior elemento
    public int encontrarMaiorRecursivo() {
        return encontrarMaiorRecursivo(0, tamanho - 1);
    }

    private int encontrarMaiorRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return dados[inicio];
        }
        int meio = (inicio + fim) / 2;
        int maxEsquerda = encontrarMaiorRecursivo(inicio, meio);
        int maxDireita = encontrarMaiorRecursivo(meio + 1, fim);
        return Math.max(maxEsquerda, maxDireita);
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        long inicioIter = System.nanoTime();
        int maiorIter = vetor.encontrarMaiorIterativo();
        long fimIter = System.nanoTime();
        System.out.println("Maior (iterativo): " + maiorIter);
        System.out.println("Tempo iterativo: " + (fimIter - inicioIter) + " ns");

        long inicioRec = System.nanoTime();
        int maiorRec = vetor.encontrarMaiorRecursivo();
        long fimRec = System.nanoTime();
        System.out.println("Maior (recursivo): " + maiorRec);
        System.out.println("Tempo recursivo: " + (fimRec - inicioRec) + " ns");
    }
}
