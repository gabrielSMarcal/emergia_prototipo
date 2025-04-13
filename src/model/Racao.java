package model;

import database.AtributosFixos;

public class Racao extends AtributosFixos{

    private int saca;
    private double valorSaca;
    private double cotacaoDolar = 5.7;

    public Racao (int saca, double valorSaca){
        this.saca = saca;
        this.valorSaca = valorSaca;
    }

    public int getSaca() {
        return saca;
    }

    public double getValorSaca() {
        return valorSaca;
    }

    public double CalcR() {
        double resulR = (saca * valorSaca * getMesAno())/cotacaoDolar;
        return resulR;
    }
}
