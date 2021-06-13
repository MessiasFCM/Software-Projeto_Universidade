package projetoUniversidade;

public class Disciplina { // Classe com os dados do objeto Disciplina
    private String nomeProfessor;
    private String nomeDisciplina;
    private int semestre;
    private int ano;
    private Curso curso;
    private int numeroDisciplina;

    public Disciplina() {
    }

    public Disciplina(String nomeProfessor, String nomeDisciplina, int semestre, int ano, Curso curso, int numeroDisciplina) {
        this.nomeProfessor = nomeProfessor;
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
        this.ano = ano;
        this.curso = curso;
        this.numeroDisciplina = numeroDisciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumeroDisciplina() {
        return numeroDisciplina;
    }

    public void setNumeroDisciplina(int numeroDisciplina) {
        this.numeroDisciplina = numeroDisciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nomeProfessor=" + nomeProfessor + ", nomeDisciplina=" + nomeDisciplina + ", semestre=" + semestre + ", ano=" + ano + ", curso=" + curso + ", numeroDisciplina=" + numeroDisciplina + '}';
    }
}
