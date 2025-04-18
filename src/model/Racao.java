package model;

import api.ApiCotacaoDolar;
import database.AtributosFixos;

public class Racao extends AtributosFixos{

    private int saca;
    private double valorSaca;

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

    public double calcR() {

        try {
            double cotacaoDolar = ApiCotacaoDolar.getCotacaoDolar();
            return (saca * valorSaca * getMesAno()) / cotacaoDolar;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao calcular Racao: " + e.getMessage());
        }
    }
}
