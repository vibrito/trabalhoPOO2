package cars.View;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
    private JTextField registroCampo;
    private JTextField modeloCampo;
    private JTextField marcaCampo;
    private JTextField anoCampo;
    private JTextField dataRegistroCampo;
    private JTextField kmRodadosCampo;
    
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
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("Registro:");
        registro.setBounds(30, 50, 330, 30);
        
        modelo = new JLabel();
        nova.add(modelo);
        modelo.setFont(new java.awt.Font("Tahoma", 0, 18));
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        modelo.setBounds(30, 120, 330, 30);
        
        marca = new JLabel();
        nova.add(marca);
        marca.setFont(new java.awt.Font("Tahoma", 0, 18));
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");
        marca.setBounds(30, 190, 330, 30);
        
        ano= new JLabel();
        nova.add(ano);
        ano.setFont(new java.awt.Font("Tahoma", 0, 18));
        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("Ano:");
        ano.setBounds(30, 260, 330, 30);
        
        dataRegistro = new JLabel();
        nova.add(dataRegistro);
        dataRegistro.setFont(new java.awt.Font("Tahoma", 0, 18));
        dataRegistro.setForeground(new java.awt.Color(255, 255, 255));
        dataRegistro.setText("Data de Registro:");
        dataRegistro.setBounds(30, 330, 330, 30);
        
        kmRodados = new JLabel();
        nova.add(kmRodados);
        kmRodados.setFont(new java.awt.Font("Tahoma", 0, 18));
        kmRodados.setForeground(new java.awt.Color(255, 255, 255));
        kmRodados.setText("Km Rodados:");
        kmRodados.setBounds(30, 400, 330, 30);
        
        registroCampo = new JTextField();
        nova.add(registroCampo);
        registroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        registroCampo.setBounds(30, 85, 330, 30);
        
        modeloCampo = new JTextField();
        nova.add(modeloCampo);
        modeloCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        modeloCampo.setBounds(30, 155, 330, 30);
        
        marcaCampo= new JTextField();
        nova.add(marcaCampo);
        marcaCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        marcaCampo.setBounds(30, 225, 330, 30);
        
        anoCampo = new JTextField();
        nova.add(anoCampo);
        anoCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        anoCampo.setBounds(30, 295, 330, 30);
        
        dataRegistroCampo = new JTextField();
        nova.add(dataRegistroCampo);
        dataRegistroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        dataRegistroCampo.setBounds(30, 365, 330, 30);
        
        kmRodadosCampo = new JTextField();
        nova.add(kmRodadosCampo);
        kmRodadosCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        kmRodadosCampo.setBounds(30, 435, 330, 30);
    }
    
public static void main(String args[]){
    NovaJanela n = new NovaJanela();
}
}