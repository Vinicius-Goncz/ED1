public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno outro) {
            return this.matricula == outro.matricula;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula=" + matricula + "}";
    }
}
