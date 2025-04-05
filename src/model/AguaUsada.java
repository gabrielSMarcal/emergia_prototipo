package model;

public class AguaUsada {
    private double litroPorDiaAnimal;
    private int qtdAnimal;
    private int litrosAdicionalDia;
    private int diasAno = 365;
    private double qtdEnergiaPorKilo = 4.94E03;

    public AguaUsada (double litroPorDiaAnimal, int qtdAnimal, int litrosAdicionalDia){
        this.litroPorDiaAnimal= litroPorDiaAnimal;
        this.qtdAnimal = qtdAnimal;
        this.litrosAdicionalDia = litrosAdicionalDia;
    }

    public double getLitroPorDiaAnimal() {
        return litroPorDiaAnimal;
    }

    public void setLitroPorDiaAnimal(double litroPorDiaAnimal) {
        this.litroPorDiaAnimal = litroPorDiaAnimal;
    }

    public int getQtdAnimal() {
        return qtdAnimal;
    }

    public void setQtdAnimal(int qtdAnimal) {
        this.qtdAnimal = qtdAnimal;
    }

    public int getLitrosAdicionalDia() {
        return litrosAdicionalDia;
    }

    public void setLitrosAdicionalDia(int litrosAdicionalDia) {
        this.litrosAdicionalDia = litrosAdicionalDia;
    }

    public int getDiasAno() {
        return diasAno;
    }

    public void setDiasAno(int diasAno) {
        this.diasAno = diasAno;
    }

    public double getQtdEnergiaPorKilo() {
        return qtdEnergiaPorKilo;
    }

    public void setQtdEnergiaPorKilo(double qtdEnergiaPorKilo) {
        this.qtdEnergiaPorKilo = qtdEnergiaPorKilo;
    }

    public double CalcAU (){

        double totalLitrosDia = (litroPorDiaAnimal * qtdAnimal) + litrosAdicionalDia;
        double totalEnergiaAno = totalLitrosDia * diasAno * qtdEnergiaPorKilo;

        return totalEnergiaAno;
    }

}
