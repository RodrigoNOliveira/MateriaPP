import subClasse.Cachorro;
import subClasse.Gato;
import subClasse.Humano;

public class App {
    public static void main(String[] args) throws Exception {

        Gato g1 = new Gato("Manda chuva", 'M', 2, 9.0, "rajado", false);

        Humano h1 = new Humano("Kennes");

        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        System.out.println(g1.getNome());
        System.out.println("O " + g1.getNome() + " está bravo? " + g1.getEstaMalHumorado());



        Cachorro c1 = new Cachorro("Sofi", 'M', 2, 15.0, "zebrada", h1, "srd");
        c1.latir();
        g1.miar();
        g1.comer("rato");


        h1.darCarinho(c1);


    }
}
