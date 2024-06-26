package br.com.murata.abstrato;

public abstract class Pessoa {

    private String nome;

    private String idade;

    public abstract long caracteristicas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
