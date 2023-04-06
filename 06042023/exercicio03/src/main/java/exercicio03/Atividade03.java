package exercicio03;

import javax.swing.*;
import java.awt.*;

public class Atividade03 extends JFrame{
    JLabel cd,rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
    public Atividade03(){
        ImageIcon icone = new ImageIcon("image.gif");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        setLayout(null);
        cd = new JLabel ("Cadastro de Clientes: ");
        rotulo1 = new JLabel ("Nome: ");
        rotulo2 = new JLabel ("Endereço: ");
        rotulo3 = new JLabel ("Cidade: ");
        rotulo4 = new JLabel ("Estado: ");
        rotulo5 = new JLabel ("CEP: ");
        rotulo6 = new JLabel ("Telefone: ");
        cd.setBounds(50,10,130,20);
        rotulo1.setBounds(50,30,80,20);
        rotulo2.setBounds(50,50,80,20);
        rotulo3.setBounds(50,70,80,20);
        rotulo4.setBounds(50,90,80,20);
        rotulo5.setBounds(50,110,80,20);
        rotulo6.setBounds(50,130,80,20);
        cd.setForeground(Color.blue);
        tela.add(cd);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        
        tela.setBackground(Color.cyan);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(250,250);
        setVisible(true);
    }
    
    public static void main (String args[]){
        Atividade03 app = new Atividade03();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
