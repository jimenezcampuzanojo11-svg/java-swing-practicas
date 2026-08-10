//43 programa

package menuswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuSwing extends JFrame implements ActionListener{
    
  private JMenuBar barra;
  private JMenu menu1, menu2, menu3, primarios, secundarios, terciarios;
  private JMenuItem salir, tamaño1, tamaño2, tamaño3,
  color1, color2, color3, color4, color5, color6;
  
  public MenuSwing(){
  
   setLayout(null);
   setTitle("Menu");
   
   barra = new JMenuBar();
   setJMenuBar(barra);
   
   menu1 = new JMenu("Colores");
   barra.add(menu1);
   
   menu2 = new JMenu("Tamaño");
   barra.add(menu2);
   
   menu3 = new JMenu("Salir");
   barra.add(menu3);
   
   primarios = new JMenu("primarios");
   menu1.add(primarios);
   
   secundarios = new JMenu("secundarios");
   menu1.add(secundarios);
   
   terciarios = new JMenu("terciarios");
   menu1.add(terciarios);
   
   salir = new JMenuItem("X");
   menu3.add(salir);
   salir.addActionListener(this);
   
   tamaño1 = new JMenuItem("Original");
   menu2.add(tamaño1);
   tamaño1.addActionListener(this);
   
   tamaño2 = new JMenuItem("640*380");
   menu2.add(tamaño2);
   tamaño2.addActionListener(this);
   
   tamaño3 = new JMenuItem("1000*650");
   menu2.add(tamaño3);
   tamaño3.addActionListener(this);
   
   color1 = new JMenuItem("Amarillo");
   primarios.add(color1);
   color1.addActionListener(this);
   
   color2 = new JMenuItem("Azul");
   primarios.add(color2);
   color2.addActionListener(this);
   
   color3 = new JMenuItem("Verde");
   secundarios.add(color3);
   color3.addActionListener(this);
   
   color4 = new JMenuItem("Naranja");
   secundarios.add(color4);
   color4.addActionListener(this);
   
   color5 = new JMenuItem("Turquesa");
   terciarios.add(color5);
   color5.addActionListener(this);
   
   color6 = new JMenuItem("Guinda");
   terciarios.add(color6);
   color6.addActionListener(this);
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == salir){
   
     System.exit(0);
   }
   
   if(evento.getSource() == tamaño1){
   
     setSize(500,500);
   }
   
   if(evento.getSource() == tamaño2){
   
     setSize(640,380);
   }
   
   if(evento.getSource() == tamaño3){
   
     setSize(1000,650);
   }
   
   if(evento.getSource() == color1){
   
     barra.setBackground(Color.yellow);
   }
   
   if(evento.getSource() == color2){
   
     barra.setBackground(Color.blue);
   }
   
   if(evento.getSource() == color3){
   
     barra.setBackground(Color.green);
   }
   
   if(evento.getSource() == color4){
   
     barra.setBackground(Color.orange);
   }
   
   if(evento.getSource() == color5){
   
     barra.setBackground(new Color(64,224,208));
   }
   
   if(evento.getSource() == color6){
   
     barra.setBackground(new Color(117,9,70));
   }
  }

  public static void main(String[] args) {
  
    MenuSwing ventana = new MenuSwing();
    ventana.setBounds(0,0,500,500);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
            
  } 
}