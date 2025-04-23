package model;

import api.ApiCotacaoDolar;
import database.AtributosFixos;

public class Maquinarios extends AtributosFixos {

    private double qtdHoraTrator;
    private String QtdHorasTrator = "H";
    private double valorHoraTrator;
    private String uValorHoraTrator = "R$";

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

    public double calcM() {

        try {
            double cotacaoDolar = ApiCotacaoDolar.getCotacaoDolar();
            return (qtdHoraTrator * valorHoraTrator) / cotacaoDolar;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao calcular Maquinarios: " + e.getMessage());
        }
    }
}
