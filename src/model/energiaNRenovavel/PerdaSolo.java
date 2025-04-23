package model.energiaNRenovavel;

import database.AtributosFixos;

public class PerdaSolo extends AtributosFixos {

    private double perdaDeSoloToneladasPorAno;
    private String tPerdadeSolo = "T";


    public PerdaSolo(double perdaDeSoloToneladasPorAno){
        this.perdaDeSoloToneladasPorAno = perdaDeSoloToneladasPorAno;
    }

    public double getPerdaDeSoloToneladasPorAno() {
        return perdaDeSoloToneladasPorAno;
    }

    public double calcPS(){
        return perdaDeSoloToneladasPorAno * getConversaoToneladaParaGramas()
                * getGramasMOporGramasSolo() * getKcalPorGrama() * getJoulesPorKcal();
    }
    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */
}
