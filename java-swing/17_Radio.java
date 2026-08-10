//46 programa

package radio;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Radio extends JFrame implements ActionListener, ChangeListener{
    
  private JLabel texto;
  private JButton boton;
  private JRadioButton radio1, radio2, radio3, radio4;
  private ButtonGroup grupo;
  private JMenuBar barra;
  private JMenu menu;
  private JMenuItem item1, item2, item3;
  
  public Radio(){
      
   setLayout(null);
   setTitle("Botones de radio");
  
   texto = new JLabel("¿De que color deseas que sea el fondo?");
   texto.setBounds(200,40,240,30);
   add(texto);
   
   boton = new JButton("Abandonar");
   boton.setBounds(20,200,100,25);
   add(boton);
   boton.addActionListener(this);
   
   barra = new JMenuBar();
   setJMenuBar(barra);
   
   menu = new JMenu("Tamaños");
   barra.add(menu);
   
   item1 = new JMenuItem("640 x 480");
   menu.add(item1);
   item1.addActionListener(this);
   
   item2 = new JMenuItem("753 x 521");
   menu.add(item2);
   item2.addActionListener(this);
   
   item3 = new JMenuItem("847 x 613");
   menu.add(item3);
   item3.addActionListener(this);
   
   grupo = new ButtonGroup();
   
   radio1 = new JRadioButton("Rojo");
   radio1.setBounds(20,70,70,30);
   radio1.setOpaque(false);
   add(radio1);
   grupo.add(radio1);
   radio1.addChangeListener(this);
   
   radio2 = new JRadioButton("Azul");
   radio2.setBounds(20,100,70,30);
   radio2.setOpaque(false);
   add(radio2);
   grupo.add(radio2);
   radio2.addChangeListener(this);
   
   radio3 = new JRadioButton("Verde");
   radio3.setBounds(20,130,70,30);
   radio3.setOpaque(false);
   add(radio3);
   grupo.add(radio3);
   radio3.addChangeListener(this);
   
   radio4 = new JRadioButton("Amarillo");
   radio4.setBounds(20,160,100,30);
   radio4.setOpaque(false);
   add(radio4);
   grupo.add(radio4);
   radio4.addChangeListener(this);
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
    if(evento.getSource() == boton){
    
      System.exit(0);
    }
    
    if(evento.getSource() == item1){
    
      setSize(640,480);
    }
    
    if(evento.getSource() == item2){
    
      setSize(753,521);
    }
    
    if(evento.getSource() == item3){
    
      setSize(847,613);
    }
  }
  
  public void stateChanged(ChangeEvent evento){
  
   if(radio1.isSelected()){
   
     this.getContentPane().setBackground(Color.red);
   }
   
   if(radio2.isSelected()){
   
     this.getContentPane().setBackground(Color.blue);
   }
   
   if(radio3.isSelected()){
   
     this.getContentPane().setBackground(Color.green);
   }
   
   if(radio4.isSelected()){
   
     this.getContentPane().setBackground(Color.yellow);
   }
  }
    
  public static void main(String[] args) {
  
    Radio ventana = new Radio();
    ventana.setBounds(0,0,640,480);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }
}