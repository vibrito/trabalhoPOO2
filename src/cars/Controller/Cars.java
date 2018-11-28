/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars.Controller;

import cars.Model.Anunciante;
import cars.Model.Car;
import cars.View.JanelaPrincipal;
import cars.View.NovaJanela;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import java.time.format.DateTimeFormatter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author viniciusbrito
 */
public class Cars {

    private DefaultListModel lista;
    private ArrayList<Car> listaVeiculos;
    private ArrayList<Car> listaBusca;
    private static JanelaPrincipal janelaPrincipal;
    private static NovaJanela novaJanela;
    private int indexSelection;

    public enum Ordenacao {
        NOME, ANO, PRECO
    }

    public static void main(String[] args) {
        Cars carros = new Cars();
        janelaPrincipal = new JanelaPrincipal();

        novaJanela = new NovaJanela();
        novaJanela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        novaJanela.setVisible(false);

        carros.indexSelection = -1;

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                carros.save();
            }
        });

        try {
            carros.criaArrayList();
        } catch (IOException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }

        janelaPrincipal.adicionarCarro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.print("Adiciona carro\n");
                novaJanela.limparCampos();
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
                carros.busca();
            }
        });

        janelaPrincipal.primeiraOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.print("Ordenar 1\n");
                carros.ordenaLista(Ordenacao.ANO);
            }
        });

        janelaPrincipal.segundaOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.print("Ordenar 2\n");
                carros.ordenaLista(Ordenacao.PRECO);
            }
        });

        janelaPrincipal.terceiraOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.print("Ordenar 3\n");
                carros.ordenaLista(Ordenacao.NOME);
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

        janelaPrincipal.listaCarros.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {

                JList source = (JList) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                if (mouseEvent.getClickCount() == 2 && source.getSelectedIndex() != -1) {
                    carros.indexSelection = source.getSelectedIndex();
                    carros.chamaEditar();
                }
            }
        });

        janelaPrincipal.listaCarros.addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                JList source = (JList) event.getSource();
                carros.indexSelection = source.getSelectedIndex();
            }
        });
    }
    
    private void save()
    {       
        System.out.print("Salvando\n");
        
        BufferedWriter writer = null;
        
        try {
            FileWriter cleaner = new FileWriter("Lista.txt");
            cleaner.write("");
            cleaner.flush();
            cleaner.close();
            writer = new BufferedWriter(new FileWriter("Lista.txt", true));
            for (Car temp : listaVeiculos) {
                writer.write(temp.getModelo() + ":" + temp.getMarca() + ":" + temp.getAno() + ":" + "today" + ":" + Double.toString(temp.getKmRodados()) + ":" + Double.toString(temp.getPreco()) + ":" + temp.getAnunciante().getNomeAnunciante() + ":" + temp.getAnunciante().getTelefoneAnunciante() + "\n");
            }

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
    }
    
    private void busca()
    {
        listaBusca = new ArrayList<Car>();
                
        for(Car c : listaVeiculos)
        {
            if (c.getModelo() != null && c.getModelo().contains(janelaPrincipal.caixaBusca.getText())) 
            {
                listaBusca.add(c);
            }
        }
        
        if (listaBusca.isEmpty())
        {
            janelaPrincipal.exibirAlerta("A busca não trouxe resultados");
            limparBusca();
        }
        else
        {
           criaLista(listaBusca);
        }
    }
    
    private void limparBusca()
    {
        listaBusca = new ArrayList<Car>();
        janelaPrincipal.caixaBusca.setText("");
        criaLista(listaVeiculos);
    }
    
    private void criaArrayList() throws IOException
    {
        listaVeiculos = new ArrayList<Car>();
        LocalDate today = LocalDate.now();
        
        BufferedReader br = new BufferedReader(new FileReader("Lista.txt"));
        try 
        {
            StringBuilder sb = new StringBuilder();
            
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] stringArray = line.split(":");
                Anunciante anum = new Anunciante(stringArray[6], stringArray[7]);
                Car carro = new Car(stringArray[0], stringArray[1], Integer.parseInt(stringArray[2]), today, Double.parseDouble(stringArray[4]), Double.parseDouble(stringArray[5]), anum);
                listaVeiculos.add(carro);
                System.out.print(carro);
            }
            
            listaVeiculos.sort((o1, o2) -> o1.getModelo().compareTo(o2.getModelo()));
            lista = new DefaultListModel();
            for (Car c : listaVeiculos) {
                lista.addElement(c.toString());
            }

            janelaPrincipal.criaListaEAdiciona(lista);
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
        
        criaLista(listaVeiculos);
    }
    
    private void criaLista(ArrayList<Car> listaV)
    {                
        lista.removeAllElements();

        for(Car c : listaV)
        {
            lista.addElement(c.toString());
            System.out.print(c.toString());
        }
  
        janelaPrincipal.criaLista(lista);
        indexSelection = -1;
    }
        
    private void removeItemLista()
    {
        if (indexSelection >= 0)
        {
            listaVeiculos.remove(indexSelection);
            criaLista(listaVeiculos);
            System.out.print(indexSelection);
            indexSelection = -1;
        }
        else
        {
            mostraAlerta("Selecione um item");
        }
    }
    
    private void mostraAlerta(String msg)
    {
        janelaPrincipal.exibirAlerta(msg);
    }
    
    private void chamaTelaDetalhes()
    {
        novaJanela.setVisible(true);
    }
    
    private void chamaEditar()
    {
       if (listaBusca == null || listaBusca.isEmpty())
       {
            chamaTelaDetalhes();
            novaJanela.carregarCampos(listaVeiculos.get(indexSelection));
       }
       else
       {
            chamaTelaDetalhes();
            novaJanela.carregarCampos(listaBusca.get(indexSelection));
       }
    }
    
    private void adicionaItemLista()
    {
       LocalDate today = LocalDate.now();
       System.out.print(today);
       Anunciante anum = new Anunciante(novaJanela.nomeAnuncianteCampo.getText(), novaJanela.telAnuncianteCampo.getText());
       Car carro = new Car(novaJanela.modeloCampo.getText(), novaJanela.marcaCampo.getText(), Integer.parseInt(novaJanela.anoCampo.getText()), today, Double.parseDouble(novaJanela.kmRodadosCampo.getText()), Double.parseDouble(novaJanela.precoCampo.getText()), anum);
       listaVeiculos.add(carro);
       criaLista(listaVeiculos);
       novaJanela.setVisible(false);
       novaJanela.limparCampos();
    }
}
