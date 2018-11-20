/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars.Controller;

import cars.Model.Car;
import cars.View.JanelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author viniciusbrito
 */
public class Cars 
{
    private DefaultListModel lista;
    private ArrayList<Car> listaVeiculos;
    private static JanelaPrincipal p;   
    
    public enum Ordenacao 
    {
        NOME, ANO, KM
    }
    
    public static void main(String[] args) 
    {
        Cars carros = new Cars(); 
        p = new JanelaPrincipal();        
        carros.criaArrayList();
            
            p.adicionarCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Adiciona carro\n");
                      carros.adicionaItemLista();
                  }
            });
            
            p.removerCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Remove carro\n");
                      carros.removeItemLista();
                  }
            });
            
            p.botaoBusca.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Busca\n");
                  }
            });
            
            p.primeiraOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 1\n");
                      carros.ordenaLista(Ordenacao.NOME);
                  }
            });
            
            p.segundaOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 2\n");
                      carros.ordenaLista(Ordenacao.ANO);
                  }
            });
            
            p.terceiraOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    System.out.print("Ordenar 3\n");
                    carros.ordenaLista(Ordenacao.KM);
                  }
            });
    }
    
    private void criaArrayList()
    {
        listaVeiculos = new ArrayList<Car>();
        LocalDate today = LocalDate.now();
        Car carro1 = new Car("Gol", "Volkswagen", 2012, today, 120.00, 18000.00);
        Car carro2 = new Car("Fusca", "Volkswagen", 1967, today, 1120.00, 22000.00);
        Car carro3 = new Car("Chevette", "Chevrolet", 1992, today, 520.00, 16000.00);
        Car carro4 = new Car("Uno", "FIAT", 2001, today, 120.00, 14000.00);
        listaVeiculos.add(carro1);
        listaVeiculos.add(carro2);
        listaVeiculos.add(carro3);
        listaVeiculos.add(carro4);
        System.out.print(listaVeiculos);
        ordenaLista(Ordenacao.NOME);
    }
    
    private void ordenaLista(Ordenacao ordem)
    {
         switch (ordem) 
         {
            case NOME:
                listaVeiculos.sort((o1, o2) -> o1.getModelo().compareTo(o2.getModelo()));
                break;
                    
            case ANO:
                listaVeiculos.sort((o1, o2) -> o1.getAno() - (o2.getAno()));
                break;
                         
            case KM:
                listaVeiculos.sort((o1, o2) -> o1.getMarca().compareTo(o2.getMarca()));
                break;
                        
            default:
                listaVeiculos.sort((o1, o2) -> o1.getModelo().compareTo(o2.getModelo()));
                break;
        }
        
        System.out.print(listaVeiculos);
        criaLista(listaVeiculos);
    }
    
    private void criaLista(ArrayList<Car> listaV)
    {
        lista = new DefaultListModel();
        for(Car c : listaV)
        {
            lista.addElement(c.toString());
        }
  
        p.criaLista(lista);
    }
    
    private void adicionaItemLista()
    {
        LocalDate today = LocalDate.now();
        Car carro5 = new Car("Escort", "Ford", 1996, today, 120.00, 16000.00);
        lista.addElement(carro5.toString());
        listaVeiculos.add(carro5);
        p.alteraLista(lista);
    }
    
    private void removeItemLista()
    {
        lista.remove(0);
        listaVeiculos.remove(0);
        p.alteraLista(lista);
    }
}
