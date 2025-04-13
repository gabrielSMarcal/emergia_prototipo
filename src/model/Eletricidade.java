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

    public double CalcE () {
        double resulE = (energiaPORKWH * getMesAno() * getKwhParaKcal()) / getEnergiaPorKcal();
        return resulE;
    }


}
