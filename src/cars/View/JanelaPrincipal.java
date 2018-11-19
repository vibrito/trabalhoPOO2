package cars.View;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class JanelaPrincipal extends JFrame{
    
    private JPanel janela;
    private JLabel logo;
    public JButton botaoBusca;
    private JTextField caixaBusca;
    private JList listaCarros;
    public JButton adicionarCarro;
    public JButton removerCarro;
    public ButtonGroup escolhaOrdem;
    public JRadioButton primeiraOpcao;
    public JRadioButton segundaOpcao;
    public JRadioButton terceiraOpcao;
    
    public JanelaPrincipal(){
        Container p = getContentPane(); //Nomeando o painel
        setSize(900, 600);  //Definindo o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando para encerrar o processo quando fechar a janela
        setResizable(false);    //Definindo para o usuario não modificar o tamanho da janela
        setVisible(true);   //Deixando a janela visivel
        
        janela = new JPanel();  //Criando o painel
        p.add(janela);  //Adicionando o painel na janela
        
        janela.setBackground(new Color(66, 139, 202));  //Mudando o plano de fundo do painel
        janela.setLayout(null); //Colocando o estilo do plano de fundo como nulo
        
        logo = new JLabel();    //Criando uma label
        logo.setIcon(new ImageIcon(getClass().getResource("/cars/View/img/logo-uva.png")));    //Setando e inserindo um icone
        janela.add(logo);   //Adicionando o label no painel
        logo.setBounds(30, 30, 192, 47);    //Definindo a posição do logo e o tamanho dele
        
        botaoBusca = new JButton(); //Criando o botão de busca
        botaoBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/search_47686.png")));  //Setando e inserindo um icone para o botão
        botaoBusca.setContentAreaFilled(false); //Fazendo o botão incorporar o plano de fundo ao do painel
        janela.add(botaoBusca); //Adicionando o botão no painel
        botaoBusca.setBounds(770, 40, 64, 64);  //Definindo a posição do botão e o tamanho dele
        
        caixaBusca = new JTextField();   //Criando uma caixa de texto
        janela.add(caixaBusca); //Adicionando a caixa de texto no painel
        caixaBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); //Editando a fonte caixa de texto
        caixaBusca.setText("Campo de busca");   //Definindo um texto padrão para a caixa de texto
        caixaBusca.setBounds(460, 50, 290, 40); //Definindo a posição e o tamanho da caixa de texto
                
        adicionarCarro = new JButton(); //Criando o botão adicionar carro
        janela.add(adicionarCarro); //Adicionando o botão no painel
        adicionarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/plus_47697.png")));    //Setando e inserindo uma imagem para o botão
        adicionarCarro.setContentAreaFilled(false); //Fazendo o botão se incorporar com o plano de fundo
        adicionarCarro.setBounds(770, 220, 64, 64); //Definindo a posição e o tamanho do botão
        
        removerCarro = new JButton();   //Criando o botão para remover carro
        janela.add(removerCarro);   //Adicionando o botão no painel
        removerCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/trash_47674.png")));     //Setando e inserindo uma imagem para o botao
        removerCarro.setContentAreaFilled(false);   //Fazendo o botao se incorporar com o plano de fundo
        removerCarro.setBounds(770, 380, 64, 64);   //Definindo a posição e o tamanho do botão
        
        
        escolhaOrdem = new ButtonGroup();   //Criando um grupo para os botões radio
        
        primeiraOpcao = new JRadioButton(); //Criando um botão estilo radio
        primeiraOpcao.setSelected(true);
        janela.add(primeiraOpcao);  //Adicionando o botão de radio a janela
        primeiraOpcao.setFont(new java.awt.Font("Tahoma", 0, 18));  //Modificando a fonte do botão radio
        primeiraOpcao.setForeground(new java.awt.Color(255, 255, 255)); //Modificando a cor da fonte
        primeiraOpcao.setText("Ordernar por modelo");   //Renomeando o botão de radio
        primeiraOpcao.setContentAreaFilled(false);  //Fazendo o botão se incorporar com o plano de fundo
        primeiraOpcao.setBounds(150, 500, 200, 40);   //Definindo a posição e o tamanho do botão de radio
        
        segundaOpcao = new JRadioButton(); //Criando um botão estilo radio
        janela.add(segundaOpcao);  //Adicionando o botão de radio a janela
        segundaOpcao.setFont(new java.awt.Font("Tahoma", 0, 18));  //Modificando a fonte do botão radio
        segundaOpcao.setForeground(new java.awt.Color(255, 255, 255)); //Modificando a cor da fonte
        segundaOpcao.setText("Ordernar por ano");   //Renomeando o botão de radio
        segundaOpcao.setContentAreaFilled(false);  //Fazendo o botão se incorporar com o plano de fundo
        segundaOpcao.setBounds(350, 500, 200, 40);   //Definindo a posição e o tamanho do botão de radio
        
        terceiraOpcao = new JRadioButton(); //Criando um botão estilo radio
        janela.add(terceiraOpcao);  //Adicionando o botão de radio a janela
        terceiraOpcao.setFont(new java.awt.Font("Tahoma", 0, 18));  //Modificando a fonte do botão radio
        terceiraOpcao.setForeground(new java.awt.Color(255, 255, 255)); //Modificando a cor da fonte
        terceiraOpcao.setText("Ordernar por placa");   //Renomeando o botão de radio
        terceiraOpcao.setContentAreaFilled(false);  //Fazendo o botão se incorporar com o plano de fundo
        terceiraOpcao.setBounds(550, 500, 200, 40);   //Definindo a posição e o tamanho do botão de radio
        
        escolhaOrdem.add(primeiraOpcao);    //Adicionando os botões ao grupo de botões
        escolhaOrdem.add(segundaOpcao);    //Adicionando os botões ao grupo de botões
        escolhaOrdem.add(terceiraOpcao);    //Adicionando os botões ao grupo de botões
    }
    
    public void criaLista(DefaultListModel lista)
    {
        listaCarros = new JList(lista); //Criando uma lista
        janela.add(listaCarros);    //Adicionando a lista no painel
        listaCarros.setFont(new java.awt.Font("Tahoma", 0, 18));    // Editando a fonte da lista
        listaCarros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);  //Tornando a lista selecionar uma por vez
        listaCarros.setBounds(90, 150, 620, 330);   //Definindo a posição e o tamanho da lista
    }
    
    public void alteraLista(DefaultListModel lista)
    {
        System.out.print("Adiciona: " + lista + "\n");
        listaCarros = new JList(lista);
    }
}