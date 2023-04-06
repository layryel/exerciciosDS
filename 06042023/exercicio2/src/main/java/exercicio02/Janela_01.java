package exercicio02;

import javax.swing.*;
import java.awt.*;

public class Janela_01 extends JFrame{
    public Janela_01(){
        super("Definindo cor de fundo para nossa janela");
        Container tela = getContentPane();
        tela.setBackground(new Color(125,125,125));
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setSize(400,200);
        setVisible(true);
    }
    
    public static void main (String args[]){
        Janela_01 app = new Janela_01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}