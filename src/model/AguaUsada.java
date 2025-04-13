package model;

import database.AtributosFixos;

public class AguaUsada extends AtributosFixos {

    private double litroPorDiaAnimal;
    private int qtdAnimal;
    private double litrosAdicionalDia;

    public AguaUsada (double litroPorDiaAnimal, int qtdAnimal, double litrosAdicionalDia){
        this.litroPorDiaAnimal= litroPorDiaAnimal;
        this.qtdAnimal = qtdAnimal;
        this.litrosAdicionalDia = litrosAdicionalDia;
    }

    public double getLitroPorDiaAnimal() {
        return litroPorDiaAnimal;
    }

    public int getQtdAnimal() {
        return qtdAnimal;
    }

    public double getLitrosAdicionalDia() {
        return litrosAdicionalDia;
    }

    public double CalcAU (){

        double totalLitrosDia = (litroPorDiaAnimal * qtdAnimal) + litrosAdicionalDia;
        double totalEnergiaAno = totalLitrosDia * getDiasAno() * getQtdEnergiaPorKilo();
        return totalEnergiaAno;
    }

}
