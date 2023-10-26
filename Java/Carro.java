package Java;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private double preço;

    public Carro(){
}
public Carro (String modelo, String marca, String cor, int ano, double preço){
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
    this.preço = preço;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public double getPreço() {
    return preço;
}
public void setPreço(double preço) {
    this.preço = preço;
}

public void acelerar(){
    System.out.println("Acelerou");
}

}

