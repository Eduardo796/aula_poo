package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Carro c1 = new Carro();

        System.out.println("### CADASTRO DE CARRO ###");

        System.out.println("Digite a marca: ");
        c1.setMarca(sc.next());

        System.out.println("Digite a modelo: ");
        c1.setModelo(sc.next());
        
        System.out.println("Digite a cor: ");
        c1.setCor(sc.next());

        System.out.println("Digite a ano: ");
        c1.setAno(sc.nextInt());

        System.out.println("Digite a preço: ");
        c1.setPreço(sc.nextDouble());

        
    }
}
