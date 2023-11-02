package org.swxtz.services;

import org.swxtz.entities.Ator;
import org.swxtz.entities.Diretor;
import org.swxtz.entities.Filme;
import org.swxtz.repository.AtorRepository;
import org.swxtz.repository.DiretorRepository;
import org.swxtz.repository.FilmeRepository;

import java.util.HashSet;

public class FilmeService {

    private FilmeRepository filmeRepository;
    private AtorRepository atorRepository;
    private DiretorRepository diretorRepository;

    public FilmeService() {
        this.filmeRepository = new FilmeRepository();
        this.atorRepository = new AtorRepository();
        this.diretorRepository = new DiretorRepository();
    }


    public boolean addFilme(String nome, String nomeDiretor, String atores[], float nota) {
        Diretor diretor = new Diretor(nomeDiretor);
        HashSet<Ator> elenco = new HashSet<Ator>();

        for (String atorNome : atores) {
            Ator ator = new Ator(atorNome);
            elenco.add(new Ator(ator));
        }

        Filme filme = new Filme(nome, diretor, elenco, nota);

        return this.filmeRepository.addFilme(filme);

    }



}
