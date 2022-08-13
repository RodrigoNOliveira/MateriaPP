public class App {
    public static void main(String[] args) throws Exception {
        
        Aeroporto aeroporto = new Aeroporto();
        GrifoDomestico grifo = new GrifoDomestico();


        aeroporto.aceita(grifo);
    }
}
