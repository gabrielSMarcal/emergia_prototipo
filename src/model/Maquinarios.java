package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class Maquinarios extends AtributosVariaveis implements AtributosFixos {

    private double qtdHoraTrator;
    private double valorHoraTrator;
    private double contacaoDolar = 5.70;

    public Maquinarios(double qtdHoraTrator, double valorHoraTrator) {
        this.qtdHoraTrator = qtdHoraTrator;
        this.valorHoraTrator = valorHoraTrator;
    }

    @Override
    public double getQtdHorasTrator() {
        return qtdHoraTrator;
    }

    @Override
    public double getValorHoraTrator() {
        return valorHoraTrator;
    }

    public double CalcM() {
        double resulM = (qtdHoraTrator * valorHoraTrator) / contacaoDolar;
        return resulM;
    }
}
