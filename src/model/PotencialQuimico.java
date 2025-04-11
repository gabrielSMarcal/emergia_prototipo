package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class PotencialQuimico extends AtributosVariaveis implements AtributosFixos {

    // ha = hectares
    private double haFazenda;
    private double mediaChuva;

    public PotencialQuimico(double haFazenda, double mediaChuva){
        this.haFazenda = haFazenda;
        this.mediaChuva = mediaChuva;
    }

    @Override
    public double getHaFazenda() {
        return haFazenda;
    }

    @Override
    public double getMediaChuva() {
        return mediaChuva;
    }

    public double CalcPQ() {
        double resulPQ = haFazenda * mediaChuva * getConversaoHaParaM2() * getKgPorM3() * getEnergiaPorKg();
        return resulPQ;
    }
}