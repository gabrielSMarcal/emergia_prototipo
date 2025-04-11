package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class PerdaSolo extends AtributosVariaveis implements AtributosFixos {

    private double perdaDeSoloToneladasPorAno;

    public PerdaSolo(double perdaDeSoloToneladasPorAno){
        this.perdaDeSoloToneladasPorAno = perdaDeSoloToneladasPorAno;
    }

    @Override
    public double getPerdaDeSoloToneladasPorAno() {
        return perdaDeSoloToneladasPorAno;
    }

    public double CalcPS(){
        double resulPs = perdaDeSoloToneladasPorAno * getConversaoToneladaParaGramas()
                * getGramasMOporGramasSolo() * getKcalPorGrama() * getJoulesPorKcal();
        return resulPs;
    }
}
