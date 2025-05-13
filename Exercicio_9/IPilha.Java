public interface IPilha {
    void push(Aluno aluno);
    Aluno pop();
    Aluno top();
    boolean isEmpty();
    int size();
    void imprimir();
}
