package org.example.builder;

public class Vendedor {

    private long id;
    private String nome;

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nome=" + nome + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

}
