/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars.Controller;

import cars.Model.Car;
import cars.View.JanelaPrincipal;
import cars.View.NovaJanela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
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
    private static NovaJanela novaJanela;
    public enum Ordenacao 
    {
        NOME, ANO, PRECO
    }
    
    public static void main(String[] args) 
    {
        Cars carros = new Cars(); 
        p = new JanelaPrincipal();
        novaJanela = new NovaJanela();
        novaJanela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        novaJanela.setVisible(false);
        
        try 
        {
            carros.criaArrayList();
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
            
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
                      carros.mostraAlerta();
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
                    carros.ordenaLista(Ordenacao.PRECO);
                  }
            });
    }
    
    private void criaArrayList() throws IOException
    {
        listaVeiculos = new ArrayList<Car>();
        LocalDate today = LocalDate.now();
        
        BufferedReader br = new BufferedReader(new FileReader("Lista.txt"));
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null)
            {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if (line != null)
                {
                    String[] stringArray = line.split(":");
                    Car carro = new Car(stringArray[0], stringArray[1], Integer.parseInt(stringArray[2]), today, Double.parseDouble(stringArray[4]), Double.parseDouble(stringArray[5]));
                    listaVeiculos.add(carro);
                    System.out.print(carro);
                }
            }
            
            
            ordenaLista(Ordenacao.NOME);        
        }
        finally
        {
            br.close();
        }        
     }
    
    private void ordenaLista(Ordenacao ordem)
    {
         switch (ordem) 
         {
            case NOME:
                listaVeiculos.sort((o1, o2) -> o1.getModelo().compareTo(o2.getModelo()));
                break;
                    
            case ANO:
                listaVeiculos.sort((o1, o2) -> o1.getAno() - o2.getAno());
                break;
                         
            case PRECO:
                listaVeiculos.sort((o1, o2) -> Double.compare(o1.getPreco(), o2.getPreco()));
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
        novaJanela.setVisible(true);
    }
    
    private void removeItemLista()
    {
        lista.remove(0);
        listaVeiculos.remove(0);
        p.alteraLista(lista);
    }
    
    private void mostraAlerta()
    {
        p.exibirAlerta("Deu ruim");
    }
}
