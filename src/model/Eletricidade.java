package model;

import database.AtributosFixos;

public class Eletricidade extends AtributosFixos{

    private double energiaPORKWH;
    private String uEnergiaKWH = "kWH";


    public Eletricidade (double energiaPORKWH) {
        this.energiaPORKWH = energiaPORKWH;
    }

    public double getEnergiaPorKWH() {
        return energiaPORKWH;
    }

    public double calcE() {
        return (energiaPORKWH * getMesAno() * getKwhParaKcal()) * getEnergiaPorKcal();
    }
    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */

}
