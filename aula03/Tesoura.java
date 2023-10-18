package aula03;

public class Tesoura {
    
    String cor;
    String marca;
    double tamanho;
    boolean aberta;

    void status () {
        System.out.println("Marca da tesoura: " + this.marca);
        System.out.println("Tamanho: " + this.tamanho + " cm");
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberta? " + this.aberta); 
    } 

    void abrir () {
        this.aberta = true;
    }

    void fechar () {
        this.aberta = false;
    }

    void cortar () {
        if (this.aberta == true){
            System.out.println("Estou cortando");
        }else{
            System.out.println("ERRO! Não posso cortar");
        }
    }
}
