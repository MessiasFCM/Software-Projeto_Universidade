package projetoUniversidade;

import java.util.ArrayList;

public class Historico {    // Classe com os dados do objeto Histórico
    private Aluno aluno;
    private ArrayList<Disciplina> disciplina;
    private char[] notasConceito;
    private int[] notasNumericas;

    public Historico() {
    }

    public Historico(Aluno aluno, ArrayList<Disciplina> disciplina, char[] notasConceito, int[] notasNumericas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.notasConceito = notasConceito;
        this.notasNumericas = notasNumericas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public char[] getNotasConceito() {
        return notasConceito;
    }

    public void setNotasConceito(char[] notasConceito) {
        this.notasConceito = notasConceito;
    }

    public int[] getNotasNumericas() {
        return notasNumericas;
    }

    public void setNotasNumericas(int[] notasNumericas) {
        this.notasNumericas = notasNumericas;
    }

    @Override
    public String toString() {
        return "Historico{" + "aluno=" + aluno + ", disciplina=" + disciplina + ", notasConceito=" + notasConceito + ", notasNumericas=" + notasNumericas + '}';
    }

}
