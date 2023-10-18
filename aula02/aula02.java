package aula02;
public class aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.modelo = "Bic";
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.8f;
        c2.carga = 50;
        c2.modelo = "Compact";
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}