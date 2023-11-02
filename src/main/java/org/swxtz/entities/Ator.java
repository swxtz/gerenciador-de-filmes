package org.swxtz.entities;

public class Ator {
    private String nome;

    public Ator(String nome) {
        this.nome = nome;
    }

    public Ator(Ator ator) {
        this.nome = ator.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
