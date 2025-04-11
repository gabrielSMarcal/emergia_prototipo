package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class ProducaoLeite extends AtributosVariaveis implements AtributosFixos {

    // ha = hectares
    private int leitePorDia;
    private double haFazendaLeite;

    public ProducaoLeite(int leitePorDia, double haFazenda) {
            this.haFazenda = haFazenda;
            this.leitePorDia = leitePorDia;
    }

    @Override
    public double getHaFazenda() {
        return haFazenda;
    }

    @Override
    public double getMediaChuva() {
        return mediaChuva;
    }

    public double calcPL () {

        double energiaTotalano = leitePorDia * getDiasAno() * getLitroParaGrama()
                * getKcalPorGramaLeite() * getJoulesPorKcalLeite();
        double resulPL = energiaTotalano/haFazenda;

        return resulPL;
    }


}
