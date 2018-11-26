package cars.Model;

import java.time.LocalDate;


public class Car 
{
    private static int numAux = 0;
    private int num;
    private String modelo, marca;
    private int ano;
    private LocalDate dataRegistro;
    private double kmRodados, preco;
    private Anunciante anunciante = new Anunciante();

    public Car(String modelo, String marca, int ano, LocalDate dataRegistro, double kmRodados, double preco, Anunciante anunciante){

    this.num = numAux++;
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.dataRegistro = dataRegistro;
    this.kmRodados = kmRodados;
    this.preco = preco;
    this.anunciante = anunciante;
    }

    public static int getNumAux() {
        return numAux;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Anunciante getAnunciante() {
        return anunciante;
    }
    
    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

    @Override
    public String toString(){
        return String.format("Modelo: %s\tAno: %d\tPreço: %.2f", modelo, ano, preco );
    }//Isso vai ser exibido na lista
    
    public String retornaString(Car carro){
        return String.format("%s:%s:%d:%d:%.2f:%.2f:%s:%s\n", modelo, marca, ano, dataRegistro, kmRodados, preco, getAnunciante().getNomeAnunciante(), getAnunciante().getTelefoneAnunciante() );
        //Então, você recebe o objeto carro e não usa ele. tem que ser carro.modelo, carro.marca, etc...
        //Exemplo de retorno Diablo:Lamborghini:1991:25/11/2018:10000.0:500000.0:Vinicius:(021)99999-0909
    }   
}