package model;

import database.AtributosFixos;

public class Eletricidade extends AtributosFixos{

    private double energiaPORKWH;


    public Eletricidade (double energiaPORKWH) {
        this.energiaPORKWH = energiaPORKWH;
    }

    public double getEnergiaPorKWH() {
        return energiaPORKWH;
    }

    public double calcE() {
        double resulE = (energiaPORKWH * getMesAno() * getKwhParaKcal()) * getEnergiaPorKcal();
        return resulE;
    }
    /* O que foi atualizado:
    - Corrigir o código
     */

}
