package model;

import database.AtributosFixos;

public class CombustivelUsado extends AtributosFixos{

    private double horasTratorPorAno;
    private double qtdTrator;
    private double litrosPorHora;

    public CombustivelUsado(double horasTratorPorAno, double qtdTrator, double litrosPorHora) {
        this.horasTratorPorAno = horasTratorPorAno;
        this.litrosPorHora = litrosPorHora;
        this.qtdTrator = qtdTrator;

    }

    public double getHorasTratorPorAno() {
        return horasTratorPorAno;
    }

    public double getQtdTrator() {
        return qtdTrator;
    }

    public double getLitrosPorHora() {
        return litrosPorHora;
    }

    public double calcularTotalEnergiaPorAno() {
        double resulCU = (horasTratorPorAno * qtdTrator * getJoulesPorTonelada()) / getToneladaPorLitro();
        return resulCU;
    }
}