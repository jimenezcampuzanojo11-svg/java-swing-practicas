//41 programa

package colores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colores extends JFrame implements ActionListener{
  
  String Rojo = "", Verde = "", Azul = ""; 
  int rojo = 0, verde = 0, azul = 0;
  
  private JLabel texto1, texto2, texto3;
  private JComboBox combo1, combo2, combo3;
  private JButton boton1, boton2;

  public Colores(){
  
   setLayout(null);
   setTitle("Colores");
   
   texto1 = new JLabel("Eligar la intensidad del rojo:");
   texto1.setBounds(0,40,180,30);
   add(texto1);
   
   texto2 = new JLabel("Eligar la intensidad del verde:");
   texto2.setBounds(0,80,180,30);
   add(texto2);
   
   texto3 = new JLabel("Eligar la intensidad del azul:");
   texto3.setBounds(0,120,180,30);
   add(texto3);
   
   boton1 = new JButton("X");
   boton1.setBounds(436,0,50,25);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Aplicar color");
   boton2.setBounds(180,160,120,30);
   add(boton2);
   boton2.addActionListener(this);
   
   combo1 = new JComboBox();
   combo1.setBounds(180,40,100,30);
   add(combo1);
   for(int i = 0; i != 256; i++){
       combo1.addItem(String.valueOf(i));}
   
   combo2 = new JComboBox();
   combo2.setBounds(180,80,100,30);
   add(combo2);
   for(int i = 0; i != 256; i++){
       combo2.addItem(String.valueOf(i));}
   
   combo3 = new JComboBox();
   combo3.setBounds(180,120,100,30);
   add(combo3);
   for(int i = 0; i != 256; i++){
       combo3.addItem(String.valueOf(i));}
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton1){
  
     System.exit(0);
       
   }
   
   if(evento.getSource() == boton2){
   
     Rojo = combo1.getSelectedItem().toString();
     Verde = combo2.getSelectedItem().toString();
     Azul = combo3.getSelectedItem().toString();
     
     rojo = Integer.parseInt(Rojo);
     verde = Integer.parseInt(Verde);
     azul = Integer.parseInt(Azul);
     
     Color color = new Color(rojo,verde,azul);
     this.getContentPane().setBackground(color);
   }
  }

  public static void main(String[] args) {
  
    Colores ventana = new Colores();
    ventana.setBounds(0,0,500,300);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);  
  }
}