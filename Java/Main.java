package Java;

public class Main{
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        g1.carga = 80;
        g1.cor = "Transparente";
        g1.marca = "Hostnet";
        g1.tamanho = 20;
        g1.status();
        g1.Destampar();
        g1.TomarAgua();
    }
}