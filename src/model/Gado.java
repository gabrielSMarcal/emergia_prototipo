package model;

import api.ApiCotacaoDolar;
import database.AtributosFixos;

public class Gado extends AtributosFixos {

    private double pesoKgMedia;
    private int numeroAnimais;
    private float anosVidamedia;

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
        try {
            double cotacaoDolar = ApiCotacaoDolar.getCotacaoDolar();
            return (pesoKgMedia * numeroAnimais / anosVidamedia) * getPesoSecoPorAnimal()
                    * getKcalPorGrama() * getJoulesPorKcal() * getGramasPorKg() / cotacaoDolar;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao calcular Gado: " + e.getMessage());
        }
    }
}
