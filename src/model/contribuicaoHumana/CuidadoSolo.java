package model.contribuicaoHumana;

import database.AtributosFixos;

public class CuidadoSolo extends AtributosFixos{

    // Ha = Hectatres
    private double toneladasPorHa;
    private String uToneladasHa = "T";
    private int ano;
    private String uAno = "Ano";
    private double resulCuidadoSolo;
    private String uResulCuidadoSolo = "unid/ano";
    private double resulRefEmergiaSolarCuidadoSolo;
    private String uResulRefEmergiaSolarCuidadoSolo = "seJ/unid";


    public double getToneladasPorHa() {
        return toneladasPorHa;
    } //não sei se isso é necessário

    private double areaDevastadaPeloGado;

    public CuidadoSolo (double toneladasPorHa, double areaDevastadaPeloGado, int ano) {
        this.areaDevastadaPeloGado = areaDevastadaPeloGado;
        this.toneladasPorHa = toneladasPorHa;
        this.ano = ano;
    }

    public double calcCS() {
        /*getAreaPorHa()*/
        resulCuidadoSolo = (toneladasPorHa/ano) * getConversaoToneladaParaGramas() * areaDevastadaPeloGado;

        return resulCuidadoSolo;
    }

    public double calRefEmergiaSolarCuidadoSolo(){
        resulRefEmergiaSolarCuidadoSolo = calcCS() * getTransformidadeCuidadoSolo();
        return resulRefEmergiaSolarCuidadoSolo;
    }
}
