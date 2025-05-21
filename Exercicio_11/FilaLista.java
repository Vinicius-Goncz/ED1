
public class FilaLista implements IFilaLista {

    // Classe interna para representar um nó da lista encadeada
    private class No {
        Aluno dado;
        No proximo;

        No(Aluno dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No primeiro; // Ponteiro para o início da fila
    private No ultimo;   // Ponteiro para o final da fila
    private int numElementosFila; // Contador de elementos na fila

    public FilaLista() {
        this.primeiro = null;
        this.ultimo = null;
        this.numElementosFila = 0;
    }

    @Override
    public boolean adicionar(Aluno aluno) {
        No novoNo = new No(aluno);
        if (estaVazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.proximo = novoNo;
        }
        this.ultimo = novoNo;
        this.numElementosFila++;
        return true;
    }

    @Override
    public Aluno remover() {
        if (estaVazia()) {
            System.out.println("Fila está vazia. Não é possível remover.");
            return null;
        }
        Aluno alunoRemovido = this.primeiro.dado;
        this.primeiro = this.primeiro.proximo;
        if (this.primeiro == null) { // Se a fila ficou vazia após a remoção
            this.ultimo = null;
        }
        this.numElementosFila--;
        return alunoRemovido;
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
        System.out.println("Estado da Fila:");
        No atual = this.primeiro;
        while (atual != null) {
            System.out.println("  " + atual.dado);
            atual = atual.proximo;
        }
    }

    public static void main(String[] args) {
        FilaLista filaDeAlunos = new FilaLista();

        System.out.println("Adicionando alunos na fila:");
        filaDeAlunos.adicionar(new Aluno("Ana Silva", 101));
        filaDeAlunos.adicionar(new Aluno("Bruno Costa", 102));
        filaDeAlunos.adicionar(new Aluno("Carla Dias", 103));
        filaDeAlunos.imprimirFila();
        System.out.println("Tamanho da fila: " + filaDeAlunos.tamanho());
        System.out.println("A fila está vazia? " + filaDeAlunos.estaVazia());

        System.out.println("\nRemovendo alunos da fila:");
        Aluno alunoRemovido1 = filaDeAlunos.remover();
        if (alunoRemovido1 != null) {
            System.out.println("Removido: " + alunoRemovido1.getNome());
        }
        filaDeAlunos.imprimirFila();
        System.out.println("Tamanho da fila: " + filaDeAlunos.tamanho());

        Aluno alunoRemovido2 = filaDeAlunos.remover();
        if (alunoRemovido2 != null) {
            System.out.println("Removido: " + alunoRemovido2.getNome());
        }
        filaDeAlunos.imprimirFila();
        System.out.println("Tamanho da fila: " + filaDeAlunos.tamanho());

        System.out.println("\nAdicionando mais um aluno:");
        filaDeAlunos.adicionar(new Aluno("Daniel Mendes", 104));
        filaDeAlunos.imprimirFila();
        System.out.println("Tamanho da fila: " + filaDeAlunos.tamanho());

        System.out.println("\nRemovendo todos os alunos restantes:");
        while (!filaDeAlunos.estaVazia()) {
            Aluno a = filaDeAlunos.remover();
            System.out.println("Removido: " + a.getNome());
        }
        filaDeAlunos.imprimirFila();
        System.out.println("Tamanho da fila: " + filaDeAlunos.tamanho());
        System.out.println("A fila está vazia? " + filaDeAlunos.estaVazia());

        System.out.println("\nTentando remover de uma fila vazia:");
        filaDeAlunos.remover();
    }
}