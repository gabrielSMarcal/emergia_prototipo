package model;

public class Maquinarios {

    private double qtdHoraTrator;
    private double valorHoraTrator;
    private double contacaoDolar = 5.70;

    public Maquinarios(double qtdHoraTrator, double valorHoraTrator) {
        this.qtdHoraTrator = qtdHoraTrator;
        this.valorHoraTrator = valorHoraTrator;
    }

    public double getQtdHoraTrator() {
        return qtdHoraTrator;
    }

    public void setQtdHoraTrator(double qtdHoraTrator) {
        this.qtdHoraTrator = qtdHoraTrator;
    }

    public double getValorHoraTrator() {
        return valorHoraTrator;
    }

    public void setValorHoraTrator(double valorHoraTrator) {
        this.valorHoraTrator = valorHoraTrator;
    }

    public double getContacaoDolar() {
        return contacaoDolar;
    }

    public void setContacaoDolar(double contacaoDolar) {
        this.contacaoDolar = contacaoDolar;
    }

    public double CalcM() {
        double resulM = (qtdHoraTrator * valorHoraTrator) / contacaoDolar;
        return resulM;
    }
}
