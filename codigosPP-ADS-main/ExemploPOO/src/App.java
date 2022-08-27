import classes.subclasses.Cachorro;
import classes.subclasses.Gato;
import classes.subclasses.Humano;
import classes.subclasses.Salsicha;
import classes.subclasses.Rato;

public class App {
    
    public static void main(String[] args) {
        
        Gato g1 = new Gato("Manda Chuva", 'M', 2, 9.0, "",false,5);
        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        System.out.println(g1.getNome());

        Humano kennes = new Humano("Kennes");


        Salsicha s = new Salsicha();
        g1.alimentar(s);
        System.out.println(g1.getEnergia());

        Rato ratatouile = new Rato();
        g1.alimentar(ratatouile);
        System.out.println(g1.getEnergia());

    }
}
