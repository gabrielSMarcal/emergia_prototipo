package model;

import database.AtributosFixos;

public class PotencialQuimico extends AtributosFixos {

    // ha = hectares
    private double haFazenda;
    private double mediaChuvaAnoMetros; //é por ano em metros

    public PotencialQuimico(double haFazenda, double mediaChuvaAnoMetros){
        this.haFazenda = haFazenda;
        this.mediaChuvaAnoMetros = mediaChuvaAnoMetros;
    }

    public double getHaFazenda() {
        return haFazenda;
    }

    public double getMediaChuva() {
        return mediaChuvaAnoMetros;
    }

    public double calcPQ() {
        double resulPQ = haFazenda * mediaChuvaAnoMetros * getConversaoHaParaM2() * getKgPorM3() * getEnergiaPorKg();
        return resulPQ;
    }
    /* O que atualizei:
    - Mudei o nome da variável para ficar mais intuitivo.
     */
}