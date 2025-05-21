
public interface IFilaLista {
    public boolean adicionar(Aluno aluno);
    public Aluno remover(); // Retorna o Aluno removido
    public boolean estaVazia();
    public int tamanho();
}