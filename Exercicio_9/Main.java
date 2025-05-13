public class Main {
    public static void main(String[] args) {
        PilhaLista pilha = new PilhaLista();

        pilha.push(new Aluno("Maria", 101));
        pilha.push(new Aluno("João", 102));
        pilha.push(new Aluno("Ana", 103));

        pilha.imprimir();

        System.out.println("Topo da pilha: " + pilha.top());

        pilha.pop();
        System.out.println("Após pop:");
        pilha.imprimir();
    }
}
