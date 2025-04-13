package model;

import database.AtributosFixos;

public class PotencialQuimico extends AtributosFixos {

    // ha = hectares
    private double haFazenda;
    private double mediaChuva;

    public PotencialQuimico(double haFazenda, double mediaChuva){
        this.haFazenda = haFazenda;
        this.mediaChuva = mediaChuva;
    }

    public double getHaFazenda() {
        return haFazenda;
    }

    public double getMediaChuva() {
        return mediaChuva;
    }

    public double calcPQ() {
        double resulPQ = haFazenda * mediaChuva * getConversaoHaParaM2() * getKgPorM3() * getEnergiaPorKg();
        return resulPQ;
    }
}