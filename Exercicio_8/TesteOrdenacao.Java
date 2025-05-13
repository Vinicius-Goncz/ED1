public class TesteOrdenacao {
    public static void main(String[] args) {
        int[] tamanhos = {1000, 10000, 100000};

        for (int tamanho : tamanhos) {
            System.out.println("Tamanho do vetor: " + tamanho);
            Vetor vetor = new Vetor(tamanho);

            long inicio = System.currentTimeMillis();
            vetor.bubbleSort();
            long fim = System.currentTimeMillis();

            System.out.println("Tempo de execução: " + (fim - inicio) + " ms\n");
        }
    }
}
