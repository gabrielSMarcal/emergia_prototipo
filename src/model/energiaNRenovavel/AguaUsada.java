package model.energiaNRenovavel;

import database.AtributosFixos;

public class AguaUsada extends AtributosFixos {

    private double litroPorDiaAnimal;
    private String lAnimal = "L";
    private int qtdAnimal;
    private String uAnimal = "U";
    private double litrosAdicionalDia;
    private String lAnimalAdicinal = "L";

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

    public double calcAU (){

        double totalLitrosDia = litroPorDiaAnimal * qtdAnimal + litrosAdicionalDia;
        return totalLitrosDia * getDiasAno() * getQtdEnergiaPorKilo(); // energia ano
    }
    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */

}
