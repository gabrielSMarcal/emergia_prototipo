package model;

import database.AtributosFixos;

public class ProducaoLeite extends AtributosFixos {

    // ha = hectares
    private double leitePorDia;
    private double haFazendaLeite;

    public ProducaoLeite(double leitePorDia, double haFazendaLeite) {
            this.haFazendaLeite = haFazendaLeite; /* este Ha é o tamanho da fazendo, ou seja, a gente pode puxar de uma variável que já existe.*/
            this.leitePorDia = leitePorDia;
    }

    public double getLeitePorDia() {
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

    /* o que foi atualizei:
    - Adicionei um comentário, acho que só.
     */
}
