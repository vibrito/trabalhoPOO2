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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
            JanelaPrincipal p = new JanelaPrincipal();
            
            p.adicionarCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Adiciona carro\n");
                  }
             });
            
            p.removerCarro.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Remover carro\n");
                  }
            });
            
            p.botaoBusca.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      System.out.print("Busca\n");
                  }
            });
    }
}
