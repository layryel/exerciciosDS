package exercicio01;

import javax.swing.*;


public class Atividade1 extends JFrame{
    public Atividade1(){
        super("Programação orientada a objeto");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(450,250);
        setVisible(true);
    }
    
    public static void main (String args[]){
        Atividade1 app = new Atividade1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}