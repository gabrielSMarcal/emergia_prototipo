package model;

public class Racao {

    private int saca;
    private double valorSaca;
    private double mesAno = 12;
    private double cotacaoDolar = 5.7;

    public Racao (int saca, double valorSaca){
        this.saca = saca;
        this.valorSaca = valorSaca;
    }

    public int getSaca() {
        return saca;
    }

    public void setSaca(int saca) {
        this.saca = saca;
    }

    public double getValorSaca() {
        return valorSaca;
    }

    public void setValorSaca(double valorSaca) {
        this.valorSaca = valorSaca;
    }

    public double getMesAno() {
        return mesAno;
    }

    public void setMesAno(double mesAno) {
        this.mesAno = mesAno;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double CalcR() {
        double resulR = (saca * valorSaca * mesAno)/cotacaoDolar;
        return resulR;
    }
}
