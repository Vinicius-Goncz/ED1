public class PilhaLista implements IPilha {
    private No topo;
    private int tamanho;

    public PilhaLista() {
        topo = null;
        tamanho = 0;
    }

    @Override
    public void push(Aluno aluno) {
        No novo = new No(aluno);
        novo.setProximo(topo);
        topo = novo;
        tamanho++;
    }

    @Override
    public Aluno pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        Aluno removido = topo.getAluno();
        topo = topo.getProximo();
        tamanho--;
        return removido;
    }

    @Override
    public Aluno top() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return topo.getAluno();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Estado atual da pilha (topo -> base):");
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getAluno());
            atual = atual.getProximo();
        }
    }
}
