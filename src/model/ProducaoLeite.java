package model;

import database.AtributosFixos;

public class ProducaoLeite extends AtributosFixos {

    // ha = hectares
    private int leitePorDia;
    private double haFazendaLeite;

    public ProducaoLeite(int leitePorDia, double haFazendaLeite) {
            this.haFazendaLeite = ProducaoLeite.this.haFazendaLeite;
            this.leitePorDia = leitePorDia;
    }

    public int getLeitePorDia() {
        return leitePorDia;
    }

    public double getHaFazenda() {
        return haFazendaLeite;
    }

    public double calcPL () {

        double energiaTotalano = leitePorDia * getDiasAno() * getLitroParaGrama()
                * getKcalPorGramaLeite() * getJoulesPorKcalLeite();
        double resulPL = energiaTotalano/haFazendaLeite;

        return resulPL;
    }


}
