//44 programa

package palabrasswing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class PalabrasSwing extends JFrame implements ActionListener, ChangeListener{
    
  String a = "", b = "", c = "", d = "", e = "", oracion = "";
  
  private JButton boton;
  private JLabel texto1, texto2;
  private JTextField espacio1, espacio2, espacio3, espacio4, espacio5;
  private JCheckBox check1, check2, check3, check4, check5;
  
  public PalabrasSwing(){
      
   setLayout(null);
   setTitle("Palabras");
  
   boton = new JButton("Salir");
   boton.setBounds(412,0,75,25);
   add(boton);
   boton.addActionListener(this);
   
   texto1 = new JLabel("Ingrese las palabras");
   texto1.setBounds(170,25,150,25);
   add(texto1);
   
   texto2 = new JLabel("Tu oracion es:");
   texto2.setBounds(15,220,400,25);
   add(texto2);
   
   espacio1 = new JTextField();
   espacio1.setBounds(50,60,100,25);
   add(espacio1);
   
   espacio2 = new JTextField();
   espacio2.setBounds(50,90,100,25);
   add(espacio2);
   
   espacio3 = new JTextField();
   espacio3.setBounds(50,120,100,25);
   add(espacio3);
   
   espacio4 = new JTextField();
   espacio4.setBounds(50,150,100,25);
   add(espacio4);
   
   espacio5 = new JTextField();
   espacio5.setBounds(50,180,100,25);
   add(espacio5);
   
   check1 = new JCheckBox();
   check1.setBounds(15,60,20,20);
   add(check1);
   check1.addChangeListener(this);
   
   check2 = new JCheckBox();
   check2.setBounds(15,90,20,20);
   add(check2);
   check2.addChangeListener(this);
   
   check3 = new JCheckBox();
   check3.setBounds(15,120,20,20);
   add(check3);
   check3.addChangeListener(this);
   
   check4 = new JCheckBox();
   check4.setBounds(15,150,20,20);
   add(check4);
   check4.addChangeListener(this);
   
   check5 = new JCheckBox();
   check5.setBounds(15,180,20,20);
   add(check5);
   check5.addChangeListener(this);
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton){
   
     System.exit(0); 
   }
  }
  
  public void stateChanged(ChangeEvent evento){
    
   oracion = "";
      
   if(check1.isSelected() == true){
   
     a = espacio1.getText();
     oracion = oracion +" "+ a;
   }
   
   if(check2.isSelected() == true){
   
     b = espacio2.getText();
     oracion = oracion +" "+ b;
   }
   
   if(check3.isSelected() == true){
   
     c = espacio3.getText();
     oracion = oracion +" "+ c;
   }
   
   if(check4.isSelected() == true){
   
     d = espacio4.getText();
     oracion = oracion +" "+ d;
   }
   
   if(check5.isSelected() == true){
   
     e = espacio5.getText();
     oracion = oracion +" "+ e;
   }
   
   texto2.setText("Tu oracion es: "+oracion);
  
  }
    
  public static void main(String[] args) {
  
    PalabrasSwing ventana = new PalabrasSwing();
    ventana.setBounds(0,0,500,300);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }      
}