public class GrifoDomestico implements TransporteAereo {

    @Override
    public void voar(String origem, String destino, int numeroPassageiros) {
        System.out.println("Fuuh Fuuh");
        System.out.println("Partiu da origem: " + origem);
        System.out.println("toc toc toc");
        System.out.println("Chegou no destino: " + destino);
        System.out.println("Quantidade de passageiros: " + numeroPassageiros);

        
    }
    
}
