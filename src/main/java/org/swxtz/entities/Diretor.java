package org.swxtz.entities;

public class Diretor {
    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    public Diretor(Diretor diretor) {
        this.nome = diretor.nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
