package classes.subclasses;

import java.util.Date;

import interfaces.Comida;

public class Salsicha implements Comida {

    private int nutrientes = 1;
    private String cor = "alaranjada";
    private Date dataValidade = new Date();

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

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

}
