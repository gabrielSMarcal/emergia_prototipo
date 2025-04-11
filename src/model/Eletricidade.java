package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class Eletricidade extends AtributosVariaveis implements AtributosFixos{

    private double energiaPORKWH;


    public Eletricidade (double energiaPORKWH) {
        this.energiaPORKWH = energiaPORKWH;
    }

    @Override
    public double getEnergiaPorKWH() {
        return energiaPORKWH;
    }

    public double CalcE () {
        double resulE = (energiaPORKWH * getMesAno() * getKwhParaKcal()) / getEnergiaPorKcal();
        return resulE;
    }


}
