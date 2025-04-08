public class Main {
    public static void main(String[] args) {
        LSE<Aluno> listaAlunos = new LSE<>();

        listaAlunos.inserir(new Aluno("Carlos", 101));
        listaAlunos.inserir(new Aluno("Maria", 102));
        listaAlunos.inserir(new Aluno("João", 103));

        listaAlunos.imprimir();

        System.out.println("\nLista de inteiros:");
        LSE<Integer> listaInt = new LSE<>();
        listaInt.inserir(10);
        listaInt.inserir(20);
        listaInt.inserir(30);
        listaInt.imprimir();
    }
}
