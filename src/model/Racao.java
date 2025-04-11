package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class Racao extends AtributosVariaveis implements AtributosFixos{

    private int saca;
    private double valorSaca;
    private double cotacaoDolar = 5.7;

    public Racao (int saca, double valorSaca){
        this.saca = saca;
        this.valorSaca = valorSaca;
    }

    @Override
    public int getSaca() {
        return saca;
    }

    @Override
    public double valorSaca() {
        return valorSaca;
    }

    public double CalcR() {
        double resulR = (saca * valorSaca * mesAno)/cotacaoDolar;
        return resulR;
    }
}
