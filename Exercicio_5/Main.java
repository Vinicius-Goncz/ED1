public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        Aluno a1 = new Aluno("Alice", 101);
        Aluno a2 = new Aluno("Bruno", 102);
        Aluno a3 = new Aluno("Carla", 103);

        lista.inserir(a1);
        lista.inserir(a2);
        lista.inserir(a3);

        System.out.println("Lista normal:");
        lista.imprimir(false);

        System.out.println("\nLista reversa:");
        lista.imprimir(true);

        System.out.println("\nRemovendo aluno Bruno...");
        lista.remover(a2);

        System.out.println("\nLista após remoção:");
        lista.imprimir(false);
    }
}
