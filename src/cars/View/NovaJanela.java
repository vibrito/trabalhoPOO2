package cars.View;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NovaJanela extends JFrame{
    private JPanel nova;
    private JButton editarCarro;
    private JButton confirmarCarro;
    private JLabel registro;
    private JLabel modelo;
    private JLabel marca;
    private JLabel ano;
    private JLabel dataRegistro;
    private JLabel kmRodados;
    
    public NovaJanela(){
        Container n = getContentPane(); //Nomeando o painel
        setSize(500, 550);  //Definindo o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando para encerrar o processo quando fechar a janela
        setResizable(false);    //Definindo para o usuario não modificar o tamanho da janela
        setVisible(true);   //Deixando a janela visivel
        
        nova = new JPanel();
        n.add(nova);
        
        nova.setBackground(new Color(66, 139, 202));  //Mudando o plano de fundo do painel
        nova.setLayout(null); //Colocando o estilo do plano de fundo como nulo
        
        editarCarro = new JButton();
        nova.add(editarCarro);
        editarCarro.setBounds(410, 20, 64, 64);
        editarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/edit_47743.png")));
        editarCarro.setContentAreaFilled(false);
        
        confirmarCarro = new JButton();
        nova.add(confirmarCarro);
        confirmarCarro.setBounds(410, 120, 64, 64);
        confirmarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/confirm_47757.png")));
        confirmarCarro.setContentAreaFilled(false);
        
        registro = new JLabel();
        nova.add(registro);
        registro.setFont(new java.awt.Font("Tahoma", 0, 18));
        registro.setText("Registro:");
        registro.setBounds(30, 50, 120, 30);
        
        modelo = new JLabel();
        nova.add(modelo);
        modelo.setFont(new java.awt.Font("Tahoma", 0, 18));
        modelo.setText("Modelo:");
        modelo.setBounds(30, 100, 120, 30);
        
        marca = new JLabel();
        nova.add(marca);
        marca.setFont(new java.awt.Font("Tahoma", 0, 18));
        marca.setText("Marca:");
        marca.setBounds(30, 150, 120, 30);
        
        ano= new JLabel();
        nova.add(ano);
        ano.setFont(new java.awt.Font("Tahoma", 0, 18));
        ano.setText("Ano:");
        ano.setBounds(30, 200, 120, 30);
        
        dataRegistro = new JLabel();
        nova.add(dataRegistro);
        dataRegistro.setFont(new java.awt.Font("Tahoma", 0, 18));
        dataRegistro.setText("Data de Registro:");
        dataRegistro.setBounds(30, 250, 120, 30);
        
        kmRodados = new JLabel();
        nova.add(kmRodados);
        kmRodados.setFont(new java.awt.Font("Tahoma", 0, 18));
        kmRodados.setText("Km Rodados:");
        kmRodados.setBounds(30, 300, 120, 30);
        
    }
    
public static void main(String args[]){
    NovaJanela n = new NovaJanela();
}
}
