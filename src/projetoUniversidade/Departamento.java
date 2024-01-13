package projetoUniversidade;

public class Departamento { // Classe com os dados do objeto Departamento
    private String nome;
    private int codigoDepartamento;
    private int numeroSala;
    private String telefone;

    public Departamento() {
    }

    public Departamento(String nome, int codigoDepartamento, int numeroSala, String telefone) {
        this.nome = nome;
        this.codigoDepartamento = codigoDepartamento;
        this.numeroSala = numeroSala;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nome=" + nome + ", codigoDepartamento=" + codigoDepartamento + ", numeroSala=" + numeroSala + ", telefone=" + telefone + '}';
    }
}
