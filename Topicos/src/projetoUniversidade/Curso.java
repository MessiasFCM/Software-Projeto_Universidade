package projetoUniversidade;

public class Curso {    // Classe com os dados do objeto Curso
    private String nome;
    private String descricao;
    private int numeroCurso;
    private int numeroHorasSemestrais;
    private int nivel;
    private Departamento departamentoResponsavel;

    public Curso() {
    }

    public Curso(String nome, String descricao, int numeroCurso, int numeroHorasSemestrais, int nivel, Departamento departamentoResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroCurso = numeroCurso;
        this.numeroHorasSemestrais = numeroHorasSemestrais;
        this.nivel = nivel;
        this.departamentoResponsavel = departamentoResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroCurso() {
        return numeroCurso;
    }

    public void setNumeroCurso(int numeroCurso) {
        this.numeroCurso = numeroCurso;
    }

    public int getNumeroHorasSemestrais() {
        return numeroHorasSemestrais;
    }

    public void setNumeroHorasSemestrais(int numeroHorasSemestrais) {
        this.numeroHorasSemestrais = numeroHorasSemestrais;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Departamento getDepartamentoResponsavel() {
        return departamentoResponsavel;
    }

    public void setDepartamentoResponsavel(Departamento departamentoResponsavel) {
        this.departamentoResponsavel = departamentoResponsavel;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", numeroCurso=" + numeroCurso + ", numeroHorasSemestrais=" + numeroHorasSemestrais + ", nivel=" + nivel + ", departamentoResponsavel=" + departamentoResponsavel + '}';
    }
}
