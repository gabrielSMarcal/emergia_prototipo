package model;

import database.AtributosFixos;

public class Gado extends AtributosFixos {

    private double pesoKgMedia;
    private int numeroAnimais;
    private float anosVidamedia;

    public Gado (double pesoKgMedia, int numeroAnimais, float anosVida){
        this.pesoKgMedia = pesoKgMedia;
        this.numeroAnimais = numeroAnimais;
        this.anosVidamedia = anosVida;
    }

    /* não consegui chamar as constante igual você fez, elas já estão com em AtributoFixos e com nome de gado*/

    /* o calculo é este: = (pesoKg * numeroAnimais / anosVida) * pesoSecoPorAnimal * kcalPorGrama * joulesPorKcal * gramasPorKg; */

    /* o que foi atualizado:
    - adicionei esta classe que estava faltando
    - Não conseguir chamara as constantes, já estão no AtributosFixo
    - Deixei o cálculo pronto.
     */
}
