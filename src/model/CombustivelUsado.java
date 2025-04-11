package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class CombustivelUsado extends AtributosVariaveis implements AtributosFixos{

    private double horasTratorPorAno;
    private double qtdTrator;
    private double litrosPorHora;

    public CombustivelUsado(double horasTratorPorAno, double qtdTrator, double litrosPorHora) {
        this.horasTratorPorAno = horasTratorPorAno;
        this.litrosPorHora = litrosPorHora;
        this.qtdTrator = qtdTrator;

    }

    @Override
    public double getHorasTratorPorAno() {
        return horasTratorPorAno;
    }

    @Override
    public double getQtdTrator() {
        return qtdTrator;
    }

    @Override
    public double getLitrosPorHora() {
        return litrosPorHora;
    }

    public double calcularTotalEnergiaPorAno() {
        double resulCU = (horasTratorPorAno * qtdTrator * getJoulesPorTonelada()) / getToneladaPorLitro();
        return resulCU;
    }
}