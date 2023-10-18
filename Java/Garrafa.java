package Java;

public class Garrafa {
    boolean tampada;
    String marca;
    float tamanho;
    String cor;
    int carga;

    void status(){
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tamanho da garrafa: " + this.tamanho);
    }

    void Destampar () {
        this.tampada = false;
    }

    void Tampar () {
        this.tampada = true;
    }

    void TomarAgua () {
        if (this.tampada == true){
            System.out.println("ERRO! Está tampada");
        }else{
            System.out.println("Estou tomando água");
        }
    }

}
