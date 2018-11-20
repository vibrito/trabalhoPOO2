package cars.View;

import java.awt.Color;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class NovaJanela extends JFrame{
    private JPanel nova;
    public JButton editarCarro;
    public JButton confirmarCarro;
    public JLabel dataRegistro;
    public JLabel registro;
    public JLabel modelo;
    public JLabel marca;
    public JLabel kmRodados;
    public JLabel ano;
    public JLabel nomeAnunciante;
    public JLabel telAnunciante;
    public JTextField dataRegistroCampo;
    public JTextField registroCampo;
    public JTextField modeloCampo;
    public JTextField marcaCampo;
    public JFormattedTextField kmRodadosCampo;
    public JFormattedTextField anoCampo;
    public JTextField nomeAnuncianteCampo;
    public JFormattedTextField telAnuncianteCampo;
    public MaskFormatter kmMascara = null;
    public MaskFormatter anoMascara = null;
    public MaskFormatter telMascara = null;
    
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
        
        dataRegistro = new JLabel();
        nova.add(dataRegistro);
        dataRegistro.setFont(new java.awt.Font("Tahoma", 0, 18));
        dataRegistro.setForeground(new java.awt.Color(255, 255, 255));
        dataRegistro.setText("Data de Registro:");
        dataRegistro.setBounds(30, 20, 160, 30);
        
        dataRegistroCampo = new JTextField();
        nova.add(dataRegistroCampo);
        dataRegistroCampo.setEditable(false);
        dataRegistroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        dataRegistroCampo.setBounds(30, 50, 160, 30);
        
        registro = new JLabel();
        nova.add(registro);
        registro.setFont(new java.awt.Font("Tahoma", 0, 18));
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("Registro:");
        registro.setBounds(240, 20, 120, 30);
        
        registroCampo = new JTextField();
        nova.add(registroCampo);
        registroCampo.setEditable(false);
        registroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        registroCampo.setBounds(240, 50, 120, 30);
        
        modelo = new JLabel();
        nova.add(modelo);
        modelo.setFont(new java.awt.Font("Tahoma", 0, 18));
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        modelo.setBounds(30, 90, 330, 30);
        
        modeloCampo = new JTextField();
        nova.add(modeloCampo);
        modeloCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        modeloCampo.setBounds(30, 120, 330, 30);
        
        marca = new JLabel();
        nova.add(marca);
        marca.setFont(new java.awt.Font("Tahoma", 0, 18));
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");
        marca.setBounds(30, 160, 330, 30);
        
        marcaCampo= new JTextField();
        nova.add(marcaCampo);
        marcaCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        marcaCampo.setBounds(30, 190, 330, 30);
        
        try{
        kmMascara = new MaskFormatter("#,###.##");
        anoMascara = new MaskFormatter("####");
        anoMascara.setPlaceholderCharacter('_');
        telMascara = new MaskFormatter("(###)#####-####");
        telMascara.setPlaceholderCharacter('_');
        }catch(ParseException excp) {
             }
        
        kmRodados = new JLabel();
        nova.add(kmRodados);
        kmRodados.setFont(new java.awt.Font("Tahoma", 0, 18));
        kmRodados.setForeground(new java.awt.Color(255, 255, 255));
        kmRodados.setText("Km Rodados:");
        kmRodados.setBounds(30, 230, 160, 30);
        
        kmRodadosCampo = new JFormattedTextField(kmMascara);
        nova.add(kmRodadosCampo);
        kmRodadosCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        kmRodadosCampo.setBounds(30, 260, 160, 30);
        
        ano= new JLabel();
        nova.add(ano);
        ano.setFont(new java.awt.Font("Tahoma", 0, 18));
        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("Ano:");
        ano.setBounds(240, 230, 120, 30);
        
        anoCampo = new JFormattedTextField(anoMascara);
        nova.add(anoCampo);
        anoCampo.setToolTipText("AAAA");
        anoCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        anoCampo.setBounds(240, 260, 120, 30);
        
        nomeAnunciante = new JLabel();
        nova.add(nomeAnunciante);
        nomeAnunciante.setFont(new java.awt.Font("Tahoma", 0, 18));
        nomeAnunciante.setForeground(new java.awt.Color(255, 255, 255));
        nomeAnunciante.setText("Nome do Anunciante:");
        nomeAnunciante.setBounds(30, 300, 330, 30);
        
        nomeAnuncianteCampo= new JTextField();
        nova.add(nomeAnuncianteCampo);
        nomeAnuncianteCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        nomeAnuncianteCampo.setBounds(30, 330, 330, 30);
        
        telAnunciante = new JLabel();
        nova.add(telAnunciante);
        telAnunciante.setFont(new java.awt.Font("Tahoma", 0, 18));
        telAnunciante.setForeground(new java.awt.Color(255, 255, 255));
        telAnunciante.setText("Telefone do Anunciante:");
        telAnunciante.setBounds(30, 370, 330, 30);
        
        telAnuncianteCampo = new JFormattedTextField(telMascara);
        nova.add(telAnuncianteCampo);
        telAnuncianteCampo.setToolTipText("(DDD)NNNNN-NNNN");
        telAnuncianteCampo.setFont(new java.awt.Font("Tahoma", 0, 18));
        telAnuncianteCampo.setBounds(30, 400, 330, 30);
    }
    
    public void exibirAlerta(String mensagemErro){
        JOptionPane.showMessageDialog(null, mensagemErro, "Oops", JOptionPane.ERROR_MESSAGE);
    }
    
public static void main(String args[]){
    NovaJanela n = new NovaJanela();
}
}