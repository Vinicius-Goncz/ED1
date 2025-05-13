public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        // Populando o vetor com números de 1 a 1000
        for (int i = 1; i <= 1000; i++) {
            vetor.inserir(i);
        }

        int alvo = 1000;

        // Pesquisa Iterativa
        long inicioIterativa = System.nanoTime();
        int resultadoIterativa = PesquisaBinaria.buscaIterativa(vetor, alvo);
        long fimIterativa = System.nanoTime();
        long tempoIterativa = fimIterativa - inicioIterativa;

        // Pesquisa Recursiva
        long inicioRecursiva = System.nanoTime();
        int resultadoRecursiva = PesquisaBinaria.buscaRecursiva(vetor, alvo, 0, vetor.getTamanho() - 1);
        long fimRecursiva = System.nanoTime();
        long tempoRecursiva = fimRecursiva - inicioRecursiva;

        // Resultados
        System.out.println("Resultado Iterativa: índice = " + resultadoIterativa + ", tempo = " + tempoIterativa + " ns");
        System.out.println("Resultado Recursiva: índice = " + resultadoRecursiva + ", tempo = " + tempoRecursiva + " ns");
    }
}
