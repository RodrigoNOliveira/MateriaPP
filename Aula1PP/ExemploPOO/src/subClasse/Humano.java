package subClasse;

import superClasse.Animal;

public class Humano {
    
    private String nome;

    public Humano(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void darCarinho(Animal animal){
        System.out.println("Fazendo carinho " + animal.getNome());
        animal.emitirsom();
    }



}
