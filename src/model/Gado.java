package model;


import database.AtributosFixos;

public class Gado extends AtributosFixos {

    private double pesoKgMedia;
    private String uPesoKgMedia = "Kg";
    private int numeroAnimais;
    private String uNumeroAnimal = "U";
    private float anosVidamedia;
    private String uAnosVida = "Ano";

    public Gado (double pesoKgMedia, int numeroAnimais, float anosVida){
        this.pesoKgMedia = pesoKgMedia;
        this.numeroAnimais = numeroAnimais;
        this.anosVidamedia = anosVida;
    }

    public double getPesoKgMedia() {
        return pesoKgMedia;
    }

    public int getNumeroAnimais() {
        return numeroAnimais;
    }

    public float getAnosVidamedia() {
        return anosVidamedia;
    }

    public double calcGado() {

        return (pesoKgMedia * numeroAnimais )/ anosVidamedia * getPesoSecoPorAnimal() * getKcalPorGramaCarne() * getJoulesPorKcal() * getGramasPorKg();
    }

    /*
    o que atualizei:
    - Aqui não precisa fazer a cotação do dollar, só precisaria se fosse vender o gado. Este calculo é para saber a média de energia utilizada para à criação do gado.
    - Retirei a variável resul e coloquei apenas return
    - Mudei o getKcalPorGrama para getKcalPorGramaCarne, corrigindo o cálculo
     */
}
