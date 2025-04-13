package model;

import api.ApiCotacaoDolar;
import database.AtributosFixos;

public class ValorConsumoManutencao extends AtributosFixos {

    private double bens;
    private int anos; // não é constante, é em quantos anos o valor em bens foi gasto na fazenda

    public double getBens() {
        return bens; // não entendi o que este get faz. não sei se é necessário.
    }

    public ValorConsumoManutencao (double bens, int anos){
        this.bens = bens;
        this.anos = anos;
    }

    public double calcBens(){
        try {
            double cotacaoDolar = ApiCotacaoDolar.getCotacaoDolar();
            return (bens / anos) / cotacaoDolar;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao calcular Valor de consumo e manutenção: " + e.getMessage());
        }
    }
    /* o que atualizei:
    - Mudei o nome da classe para ficar melhor
    - Adicionei uma variável
    - Tentei adicionar a api de cotação de dolar mais não está funcionando.
     */

}
