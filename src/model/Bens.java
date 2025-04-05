package model;

public class Bens {

    private double bens;
    private int anos = 20;

    public Bens(double valorBem, float bens){
        this.bens = bens;
    }

    public double getBens() {
        return bens;
    }

    public void setBens(float bens) {
        this.bens = bens;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public double CalcBens(){
        double resulBens = bens /anos;
        return resulBens;
    }
}
