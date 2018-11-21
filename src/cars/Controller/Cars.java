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
    private static JanelaPrincipal janelaPrincipal;
    private static NovaJanela novaJanela;
    public enum Ordenacao 
    {
        NOME, ANO, PRECO
    }
    
    public static void main(String[] args) 
    {
        Cars carros = new Cars(); 
        janelaPrincipal = new JanelaPrincipal();
        
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
            
            janelaPrincipal.adicionarCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Adiciona carro\n");
                      carros.chamaTelaDetalhes();
                  }
            });
            
            janelaPrincipal.removerCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Remove carro\n");
                      carros.removeItemLista();
                  }
            });
            
            janelaPrincipal.botaoBusca.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Busca\n");
                      carros.mostraAlerta();
                  }
            });
            
            janelaPrincipal.primeiraOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 1\n");
                      carros.ordenaLista(Ordenacao.NOME);
                  }
            });
            
            janelaPrincipal.segundaOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 2\n");
                      carros.ordenaLista(Ordenacao.ANO);
                  }
            });
            
            janelaPrincipal.terceiraOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    System.out.print("Ordenar 3\n");
                    carros.ordenaLista(Ordenacao.PRECO);
                  }
            });
            
            novaJanela.editarCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    System.out.print("Editar Carro");
                  }
            });
            
            novaJanela.confirmarCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    System.out.print("Adicionar Carro");
                    carros.adicionaItemLista();
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
  
        janelaPrincipal.criaLista(lista);
    }
        
    private void removeItemLista()
    {
        lista.remove(0);
        listaVeiculos.remove(0);
        janelaPrincipal.alteraLista(lista);
    }
    
    private void mostraAlerta()
    {
        janelaPrincipal.exibirAlerta("Deu ruim");
    }
    
    private void chamaTelaDetalhes()
    {
        novaJanela.setVisible(true);
    }
    
    private void adicionaItemLista()
    {
       LocalDate today = LocalDate.now();
       //public Car(String modelo, String marca, int ano, LocalDate dataRegistro, double kmRodados, double preco){
       System.out.print(novaJanela.ano.getText());
       System.out.print(novaJanela.kmRodados.getText());
//       Car carro = new Car(novaJanela.modelo.getText(), novaJanela.marca.getText(), 1967, today, Double.parseDouble(novaJanela.kmRodados.getText()), 22000.00);
//       listaVeiculos.add(carro);
//       lista.addElement(carro.toString());
//       janelaPrincipal.alteraLista(lista);
    }
}
