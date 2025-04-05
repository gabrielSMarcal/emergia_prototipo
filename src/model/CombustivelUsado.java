package model;

public class CombustivelUsado {

    private double horasTratorPorAno;
    private double qtdTrator;
    private double litrosPorHora;
    private double joulesPorTonelada = 4.40E10;
    private double toneladaPorLitro = 1.00E03;

    public CombustivelUsado(double horasTratorPorAno, double qtdTrator, double litrosPorHora) {
        this.horasTratorPorAno = horasTratorPorAno;
        this.litrosPorHora = litrosPorHora;
        this.qtdTrator = qtdTrator;

    }

    public double getHorasTratorPorAno() {
        return horasTratorPorAno;
    }

    public void setHorasTratorPorAno(double horasTratorPorAno) {
        this.horasTratorPorAno = horasTratorPorAno;
    }

    public double getQtdTrator() {
        return qtdTrator;
    }

    public void setQtdTrator(double qtdTrator) {
        this.qtdTrator = qtdTrator;
    }

    public double getLitrosPorHora() {
        return litrosPorHora;
    }

    public void setLitrosPorHora(double litrosPorHora) {
        this.litrosPorHora = litrosPorHora;
    }

    public double getJoulesPorTonelada() {
        return joulesPorTonelada;
    }

    public void setJoulesPorTonelada(double joulesPorTonelada) {
        this.joulesPorTonelada = joulesPorTonelada;
    }

    public double getToneladaPorLitro() {
        return toneladaPorLitro;
    }

    public void setToneladaPorLitro(double toneladaPorLitro) {
        this.toneladaPorLitro = toneladaPorLitro;
    }

    public double calcularTotalEnergiaPorAno() {
        double resulCU = (horasTratorPorAno * qtdTrator * joulesPorTonelada) / toneladaPorLitro;
        return resulCU;
    }
}