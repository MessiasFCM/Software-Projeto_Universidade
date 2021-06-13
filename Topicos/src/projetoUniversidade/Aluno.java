package projetoUniversidade;

import java.time.LocalDate;

public class Aluno { // Classe com os dados do objeto Aluno
    private String nome;
    private int numeroMatricula;
    private String numeroCPF;
    private String endereco;
    private String telefoneContato;
    private LocalDate dataNascimento;
    private String sexo;
    private String turma;
    private Departamento departamentoPrincipal;
    private Departamento departamentoSecundario;
    private String programa;

    public Aluno() {
    }

    public Aluno(String nome, int numeroMatricula, String numeroCPF, String endereco, String telefoneContato, LocalDate dataNascimento, String sexo, String turma, Departamento departamentoPrincipal, Departamento departamentoSecundario, String programa) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.numeroCPF = numeroCPF;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.turma = turma;
        this.departamentoPrincipal = departamentoPrincipal;
        this.departamentoSecundario = departamentoSecundario;
        this.programa = programa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Departamento getDepartamentoPrincipal() {
        return departamentoPrincipal;
    }

    public void setDepartamentoPrincipal(Departamento departamentoPrincipal) {
        this.departamentoPrincipal = departamentoPrincipal;
    }

    public Departamento getDepartamentoSecundario() {
        return departamentoSecundario;
    }

    public void setDepartamentoSecundario(Departamento departamentoSecundario) {
        this.departamentoSecundario = departamentoSecundario;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", numeroMatricula=" + numeroMatricula + ", numeroCPF=" + numeroCPF + ", endereco=" + endereco + ", telefoneContato=" + telefoneContato + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", turma=" + turma + ", departamentoPrincipal=" + departamentoPrincipal + ", departamentoSecundario=" + departamentoSecundario + ", programa=" + programa + '}';
    }
}
