import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = rand.nextInt(100000); // Números aleatórios até 100.000
        }
    }

    public int[] getElementos() {
        return elementos;
    }

    public void bubbleSort() {
        int n = elementos.length;
        for (int i = 0; i < n - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
