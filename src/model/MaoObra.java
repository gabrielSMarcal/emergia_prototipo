package model;

import database.AtributosFixos;

public class MaoObra extends AtributosFixos{

    private int pessoa;
    private String uPessoa = "U";
    private double horasTrabalhada;
    private String uHorasTrabalhada = "H";
    private int qtdDiasTrabalhado;
    private String uQtdDiasTrabalhado = "Dias";
    private int horasAnoReferencia = 2000;

    public MaoObra (int pessoa, double horasTrabalhada, int qtdDiasTrabalhado){
        this.pessoa = pessoa;
        this.horasTrabalhada = horasTrabalhada;
        this.qtdDiasTrabalhado = qtdDiasTrabalhado;
    }

    public int getPessoas() {
        return pessoa;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhada;
    }

    public int getQtdDiasTrabalhado() {
        return qtdDiasTrabalhado;
    }

    public double calcMO() {
        return (pessoa * horasTrabalhada * qtdDiasTrabalhado) / horasAnoReferencia * getEnergiaPessoaAno();
    }

    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */
}
