public class PesquisaBinaria {

    public static int buscaIterativa(Vetor vetor, int alvo) {
        int inicio = 0;
        int fim = vetor.getTamanho() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int valorMeio = vetor.obter(meio);

            if (valorMeio == alvo) {
                return meio;
            } else if (valorMeio < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int buscaRecursiva(Vetor vetor, int alvo, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;
        int valorMeio = vetor.obter(meio);

        if (valorMeio == alvo) {
            return meio;
        } else if (valorMeio < alvo) {
            return buscaRecursiva(vetor, alvo, meio + 1, fim);
        } else {
            return buscaRecursiva(vetor, alvo, inicio, meio - 1);
        }
    }
}
