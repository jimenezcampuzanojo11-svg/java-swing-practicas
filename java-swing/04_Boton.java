//33 programa

package boton;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{

  JButton boton1;
  
  public Boton(){
  
   setLayout(null);
   boton1 = new JButton("salir");
   boton1.setBounds(50,300,75,30);
   add(boton1);
   boton1.addActionListener(this);
   
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton1){System.exit(0);}
     
  }
  
  public static void main(String args[]){
  
    Scanner Input = new Scanner(System.in);
    String opcion;
    int x, y;
    
    System.out.println("Deseas que la ventana este en el centro?");
    opcion = Input.nextLine();
    
    if(opcion.equalsIgnoreCase("si")){
    
      Boton ventana = new Boton();
      ventana.setBounds(0,0,600,450);
      ventana.setVisible(true);
      ventana.setLocationRelativeTo(null);
      ventana.setResizable(true);
      
    }else{
    
      System.out.print("Ingrese la coordenada en x: ");
      x = Input.nextInt();
      System.out.print("Ingrese la coordenada en y: ");
      y = Input.nextInt();
      
      Boton ventana = new Boton();
      ventana.setBounds(x,y,600,450);
      ventana.setVisible(true);
      ventana.setResizable(true);
    
    } 
  }
}