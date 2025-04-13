package model;

import database.AtributosFixos;

public class Maquinarios extends AtributosFixos {

    private double qtdHoraTrator;
    private double valorHoraTrator;
    private double contacaoDolar = 5.70;

    public Maquinarios(double qtdHoraTrator, double valorHoraTrator) {
        this.qtdHoraTrator = qtdHoraTrator;
        this.valorHoraTrator = valorHoraTrator;
    }

    public double getQtdHorasTrator() {
        return qtdHoraTrator;
    }

    public double getValorHoraTrator() {
        return valorHoraTrator;
    }

    public double CalcM() {
        double resulM = (qtdHoraTrator * valorHoraTrator) / contacaoDolar;
        return resulM;
    }
}
