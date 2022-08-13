package superClasse;
public abstract class Animal {


    protected String nome;
    protected char genero;
    protected Integer idade;
    protected Double peso;
    protected String color;
    
    public Animal() {
    }

    public Animal(String nome, char genero, Integer idade, Double peso, String color) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.color = color;
    }


    public void respirar(){
        System.out.println(this.nome + " está respirando.");
    }

    public void comer(String comida){
        System.out.println(this.nome + " está comendo " + comida);
    }

    public void correr(String destino){
        System.out.println(this.nome + " está correndo "+ destino);
    }

    public void dormir(int horas){
        System.out.printf("%s dormiu %d horas", this.nome, horas);
    }


    public abstract void emitirsom();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
