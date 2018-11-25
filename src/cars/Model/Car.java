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
    Anunciante anunciante;

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

    @Override
    public String toString(){
        return String.format("Modelo: %s\nAno: %d\nPreço: %.2f\n", modelo, ano, preco );
                
    }
    
    public String retornaString(Car carro){
        return String.format("Modelo: %s\tMarca: %s\tAno: %d\tData de Registro: %d\tKms rodados: %.2f\tPreço: %.2f\t", modelo, marca, ano, dataRegistro, kmRodados, preco);
    }
    
    //TODO:
    //Recebe: Car carro
    //Retorna: "Corolla:Toyota:2016:today:20.00:37000.00" <- Lógico que atualizado pra refletir as alterações com o anunciante.
}