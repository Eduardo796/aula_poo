package AulaPr;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        

        p1.nome = "Maria";
        p1.cpf = "12342523";

        p2.nome = "Jose";
        p2.cpf = "3423423";

        System.out.println(p1.nome);
        System.out.println(p1.cpf);
        
        System.out.println(p2.nome);
        System.out.println(p2.cpf);

    }
}
