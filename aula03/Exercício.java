package aula03;

public class Exercício {
    public static void main(String[] args) {
        Tesoura t1 = new Tesoura();
        t1.cor = "preta";
        t1.marca = "Lacost";
        t1.tamanho = 15;
        t1.status();
        t1.fechar();
        t1.cortar();
      
    }
}
