package model;

import database.AtributosFixos;

public class CombustivelUsado extends AtributosFixos{

    private double horasTratorPorAno;
    private String uHorasTrator = "Hrs";
    private double qtdTrator;
    private String uQtdTrator = "U";
    private double litrosPorHora;
    private String uLitrosCombustivelHora = "L";

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

    public double calcularCombustivelUsado() {
        return (horasTratorPorAno * qtdTrator * getJoulesPorTonelada()) / getToneladaPorLitro();
    }
    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */
}