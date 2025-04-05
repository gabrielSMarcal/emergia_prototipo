package model;

public class Eletricidade {

    private double energiaPORKWH;
    private int mesAno = 12;
    private int kwhParaKcal = 860;
    private int energiaPorKcal = 4186;

    public Eletricidade (double energiaPORKWH) {
        this.energiaPORKWH = energiaPORKWH;
    }

    public double getEnergiaPORKWH() {
        return energiaPORKWH;
    }

    public void setEnergiaPORKWH(double energiaPORKWH) {
        this.energiaPORKWH = energiaPORKWH;
    }

    public int getMesAno() {
        return mesAno;
    }

    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }

    public int getKwhParaKcal() {
        return kwhParaKcal;
    }

    public void setKwhParaKcal(int kwhParaKcal) {
        this.kwhParaKcal = kwhParaKcal;
    }

    public int getEnergiaPorKcal() {
        return energiaPorKcal;
    }

    public void setEnergiaPorKcal(int energiaPorKcal) {
        this.energiaPorKcal = energiaPorKcal;
    }

    public double CalcE () {
        double resulE = (energiaPORKWH * mesAno * kwhParaKcal)/energiaPorKcal;
        return resulE;
    }


}
