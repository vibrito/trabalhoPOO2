
package cars.Model;

import java.time.LocalDate;


public class Car 
{
    private static int numAux = 0;
    private int num;
    private String modelo;
    private String marca;
    private int ano;
    private LocalDate dataRegistro;
    private double kmRodados;
    
    public Car(String modelo, String marca, int ano, LocalDate dataRegistro, double kmRodados){
    this.num = numAux++;
    this. modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.dataRegistro = dataRegistro;
    this.kmRodados = kmRodados;
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
    
    @Override
    public String toString(){
        return String.format("Número de registro: %d\nModelo: %s\nMarca: %s\nAno: %d\nKilometros rodados: %.2f\nData de Registro: %s\n", num, modelo, marca, ano, kmRodados, dataRegistro);

    }
    
}
