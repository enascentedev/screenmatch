package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String director;

    public Filme(String nome,int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getclassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " +this.getNome() + " ("+this.getAnoDeLancamento()+")";
    }
}