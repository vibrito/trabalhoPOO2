package cars.View;

import cars.Model.Car;
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
    public JLabel preco;
    public JLabel nomeAnunciante;
    public JLabel telAnunciante;
    public JTextField dataRegistroCampo;
    public JTextField registroCampo;
    public JTextField modeloCampo;
    public JTextField marcaCampo;
    public JTextField kmRodadosCampo;
    public JFormattedTextField anoCampo;
    public JTextField precoCampo;
    public JTextField nomeAnuncianteCampo;
    public JFormattedTextField telAnuncianteCampo;
    public MaskFormatter kmMascara = null;
    public MaskFormatter anoMascara = null;
    public MaskFormatter telMascara = null;
    
    public NovaJanela(){
        Container n = getContentPane(); //Nomeando a janela
        setSize(500, 550);  //Definindo o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando para encerrar o processo quando fechar a janela
        setResizable(false);    //Definindo para o usuario não modificar o tamanho da janela
        setVisible(true);   //Deixando a janela visivel
        setTitle("Carro");  //Titulo da janela
        
        nova = new JPanel();    //Criando um novo painel
        n.add(nova);    //Adicionando o painel na janela
        
        nova.setBackground(new Color(66, 139, 202));  //Mudando o plano de fundo do painel
        nova.setLayout(null); //Colocando o estilo do plano de fundo como nulo
        
        editarCarro = new JButton();    //Adicionando botão edição de carro
        nova.add(editarCarro);  //Colocando o botão no painel
        editarCarro.setBounds(410, 20, 64, 64); //Definindo a posição e o tamanho do botão
        editarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/edit_47743.png")));    //Inserindo uma imagem para o botão
        editarCarro.setContentAreaFilled(false);    //Retirando o fundo do botão
        
        confirmarCarro = new JButton();    //Adicionando botão
        nova.add(confirmarCarro);  //Colocando o botão no painel
        confirmarCarro.setBounds(410, 120, 64, 64); //Definindo a posição e o tamanho do botão
        confirmarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/View/img/confirm_47757.png")));    //Inserindo uma imagem para o botão
        confirmarCarro.setContentAreaFilled(false);    //Retirando o fundo do botão
        
        dataRegistro = new JLabel();    //Adicionando um rotulo
        nova.add(dataRegistro);     //Inserindo o rotulo no painel
        dataRegistro.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        dataRegistro.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        dataRegistro.setText("Data de Registro:");  //Nomeando o rotulo
        dataRegistro.setBounds(30, 20, 160, 30);    //Definindo a posição e o tamanho do rotulo
        
        dataRegistroCampo = new JTextField();   //Adicionando um campo de texto
        nova.add(dataRegistroCampo);    //Inserindo o campo de texto no painel
        dataRegistroCampo.setEditable(false);   //Retirando a possibilidade de editar o campo
        dataRegistroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        dataRegistroCampo.setBounds(30, 50, 160, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        registro = new JLabel();    //Adicionando um rotulo
        nova.add(registro);     //Inserindo o rotulo no painel
        registro.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        registro.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        registro.setText("Registro:");  //Nomeando o rotulo
        registro.setBounds(240, 20, 120, 30);    //Definindo a posição e o tamanho do rotulo
        
        registroCampo = new JTextField();   //Adicionando um campo de texto
        nova.add(registroCampo);    //Inserindo o campo de texto no painel
        registroCampo.setEditable(false);   //Retirando a possibilidade de editar o campo
        registroCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        registroCampo.setBounds(240, 50, 120, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        modelo = new JLabel();    //Adicionando um rotulo
        nova.add(modelo);     //Inserindo o rotulo no painel
        modelo.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        modelo.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        modelo.setText("Modelo:");  //Nomeando o rotulo
        modelo.setBounds(30, 90, 330, 30);    //Definindo a posição e o tamanho do rotulo
        
        modeloCampo = new JTextField();   //Adicionando um campo de texto
        nova.add(modeloCampo);    //Inserindo o campo de texto no painel
        modeloCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        modeloCampo.setBounds(30, 120, 330, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        marca = new JLabel();    //Adicionando um rotulo
        nova.add(marca);     //Inserindo o rotulo no painel
        marca.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        marca.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        marca.setText("Marca:");  //Nomeando o rotulo
        marca.setBounds(30, 160, 330, 30);    //Definindo a posição e o tamanho do rotulo
        
        marcaCampo= new JTextField();   //Adicionando um campo de texto
        nova.add(marcaCampo);    //Inserindo o campo de texto no painel
        marcaCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        marcaCampo.setBounds(30, 190, 330, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        try{    //Configuraçoes da mascara
        anoMascara = new MaskFormatter("####");
        anoMascara.setPlaceholderCharacter('_');
        telMascara = new MaskFormatter("(###)#####-####");
        telMascara.setPlaceholderCharacter('_');
        }catch(ParseException excp) {
             }
        
        kmRodados = new JLabel();    //Adicionando um rotulo
        nova.add(kmRodados);     //Inserindo o rotulo no painel
        kmRodados.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        kmRodados.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        kmRodados.setText("Km Rodados:");  //Nomeando o rotulo
        kmRodados.setBounds(30, 230, 160, 30);    //Definindo a posição e o tamanho do rotulo
        
        kmRodadosCampo = new JTextField();   //Adicionando um campo de texto
        nova.add(kmRodadosCampo);    //Inserindo o campo de texto no painel
        kmRodadosCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        kmRodadosCampo.setBounds(30, 260, 160, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        ano= new JLabel();    //Adicionando um rotulo
        nova.add(ano);     //Inserindo o rotulo no painel
        ano.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        ano.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        ano.setText("Ano:");  //Nomeando o rotulo
        ano.setBounds(240, 230, 120, 30);    //Definindo a posição e o tamanho do rotulo
        
        anoCampo = new JFormattedTextField(anoMascara);   //Adicionando um campo de texto
        nova.add(anoCampo);    //Inserindo o campo de texto no painel
        anoCampo.setToolTipText("AAAA");    //Definindo um texto de auxilio
        anoCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        anoCampo.setBounds(240, 260, 120, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        preco = new JLabel();    //Adicionando um rotulo
        nova.add(preco);     //Inserindo o rotulo no painel
        preco.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        preco.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        preco.setText("Preço do Automovel:");  //Nomeando o rotulo
        preco.setBounds(30, 300, 330, 30);    //Definindo a posição e o tamanho do rotulo
        
        precoCampo= new JTextField();   //Adicionando um campo de texto
        nova.add(precoCampo);    //Inserindo o campo de texto no painel
        precoCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        precoCampo.setBounds(30, 330, 330, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        nomeAnunciante = new JLabel();    //Adicionando um rotulo
        nova.add(nomeAnunciante);     //Inserindo o rotulo no painel
        nomeAnunciante.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        nomeAnunciante.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        nomeAnunciante.setText("Nome do Anunciante:");  //Nomeando o rotulo
        nomeAnunciante.setBounds(30, 370, 330, 30);    //Definindo a posição e o tamanho do rotulo
        
        nomeAnuncianteCampo= new JTextField();   //Adicionando um campo de texto
        nova.add(nomeAnuncianteCampo);    //Inserindo o campo de texto no painel
        nomeAnuncianteCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        nomeAnuncianteCampo.setBounds(30, 400, 330, 30);   //Definindo a posição e o tamanho da caixa de texto
        
        telAnunciante = new JLabel();    //Adicionando um rotulo
        nova.add(telAnunciante);     //Inserindo o rotulo no painel
        telAnunciante.setFont(new java.awt.Font("Tahoma", 0, 18));   //Modificando a fonte do rotulo
        telAnunciante.setForeground(new java.awt.Color(255, 255, 255));  //Modificando a cor do rotulo
        telAnunciante.setText("Telefone do Anunciante:");  //Nomeando o rotulo
        telAnunciante.setBounds(30, 440, 330, 30);    //Definindo a posição e o tamanho do rotulo
        
        telAnuncianteCampo = new JFormattedTextField(telMascara);   //Adicionando um campo de texto
        nova.add(telAnuncianteCampo);    //Inserindo o campo de texto no painel
        telAnuncianteCampo.setToolTipText("(DDD)NNNNN-NNNN");   //Definindo um texto de auxilio
        telAnuncianteCampo.setFont(new java.awt.Font("Tahoma", 0, 18));  //Alterando a fonte do campo de texto
        telAnuncianteCampo.setBounds(30, 470, 330, 30);   //Definindo a posição e o tamanho da caixa de texto
    }
    
    public void exibirAlerta(String mensagemErro){
        JOptionPane.showMessageDialog(null, mensagemErro, "Oops", JOptionPane.ERROR_MESSAGE);   //Definindo janela de mensagem de erro
    }
    
    public void limparCampos(){     //Limpa os campos apos uma nova janela
    dataRegistroCampo.setText("");
    registroCampo.setText("");
    modeloCampo.setText("");
    marcaCampo.setText("");
    kmRodadosCampo.setText("");
    anoCampo.setText("");
    precoCampo.setText("");
    nomeAnuncianteCampo.setText("");
    telAnuncianteCampo.setText("");
    }
    
    public void carregarCampos(Car temp){      //Carregar os campos com os dados e tornar os campos não editaveis
    dataRegistroCampo.setText(String.valueOf(temp.getDataRegistro()));
    registroCampo.setText(String.valueOf(temp.getNum()));
    modeloCampo.setText(temp.getModelo());
    marcaCampo.setText(temp.getMarca());
    kmRodadosCampo.setText(String.valueOf(temp.getKmRodados()));
    anoCampo.setText(String.valueOf(temp.getAno()));
    precoCampo.setText(String.valueOf(temp.getPreco()));
    nomeAnuncianteCampo.setText(temp.getAnunciante().getNomeAnunciante());
    telAnuncianteCampo.setText(temp.getAnunciante().getTelefoneAnunciante());
    
    modeloCampo.setEditable(false);
    marcaCampo.setEditable(false);
    kmRodadosCampo.setEditable(false);
    anoCampo.setEditable(false);
    precoCampo.setEditable(false);
    nomeAnuncianteCampo.setEditable(false);
    telAnuncianteCampo.setEditable(false);
    }
    
    public void editarCampos(){     //Tornar os campos editaveis
    modeloCampo.setEditable(true);
    marcaCampo.setEditable(true);
    kmRodadosCampo.setEditable(true);
    anoCampo.setEditable(true);
    precoCampo.setEditable(true);
    nomeAnuncianteCampo.setEditable(true);
    telAnuncianteCampo.setEditable(true);
    }
}