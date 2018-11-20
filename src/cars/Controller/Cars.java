/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars.Controller;

import cars.View.JanelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author viniciusbrito
 */
public class Cars 
{
    private DefaultListModel lista;
    private static JanelaPrincipal p;    
    
    public static void main(String[] args) 
    {
        Cars carros = new Cars(); 
        p = new JanelaPrincipal();
        
        carros.criaLista();
            
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
                  }
            });
            
            p.segundaOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 2\n");
                  }
            });
            
            p.terceiraOpcao.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Ordenar 3\n");
                  }
            });
    }
    
    private void criaLista()
    {
        lista = new DefaultListModel();
        lista.addElement("Kombi");
        lista.addElement("Fusca");
        lista.addElement("Chevette");
        lista.addElement("Brasilia");
        p.criaLista(lista);
    }
    
    private void adicionaItemLista()
    {
        lista.addElement("Gol");
        p.alteraLista(lista);
    }
    
    private void removeItemLista()
    {
        lista.remove(0);
        p.alteraLista(lista);
    }
}
