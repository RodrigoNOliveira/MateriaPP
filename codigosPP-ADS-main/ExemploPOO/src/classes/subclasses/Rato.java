package classes.subclasses;

import interfaces.Comida;

public class Rato implements Comida {

    private int nutrientes = 8;
    private String cor = "sujo";


    @Override
    public int getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



}
