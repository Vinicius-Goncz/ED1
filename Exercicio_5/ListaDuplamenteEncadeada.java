class No {
    Object dado;
    No anterior;
    No proximo;

    public No(Object dado) {
        this.dado = dado;
    }
}

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public void inserir(Object dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public No buscar(Object chave) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado.equals(chave)) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public boolean remover(Object chave) {
        No alvo = buscar(chave);
        if (alvo == null) return false;

        if (alvo.anterior != null) {
            alvo.anterior.proximo = alvo.proximo;
        } else {
            inicio = alvo.proximo;
        }

        if (alvo.proximo != null) {
            alvo.proximo.anterior = alvo.anterior;
        } else {
            fim = alvo.anterior;
        }

        return true;
    }

    public void imprimir(boolean reverso) {
        if (!reverso) {
            No atual = inicio;
            while (atual != null) {
                System.out.println(atual.dado);
                atual = atual.proximo;
            }
        } else {
            No atual = fim;
            while (atual != null) {
                System.out.println(atual.dado);
                atual = atual.anterior;
            }
        }
    }
}
