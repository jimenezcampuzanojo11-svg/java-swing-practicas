//34 programa

package botones;
import javax.swing.*;
import java.awt.event.*;

public class Botones extends JFrame implements ActionListener{

  private JLabel texto;
  private JButton boton1, boton2, boton3;

  public Botones(){

   setLayout(null);

   texto = new JLabel("Cual es el resultado de 2 + 2 en programacion?");
   texto.setBounds(15,10,300,50);
   add(texto);

   boton1 = new JButton("4");
   boton1.setBounds(15,200,75,30);
   add(boton1);
   boton1.addActionListener(this);

   boton2 = new JButton("22");
   boton2.setBounds(105,200,75,30);
   add(boton2);
   boton2.addActionListener(this);

   boton3 = new JButton("salir");
   boton3.setBounds(195,200,75,30);
   add(boton3);
   boton3.addActionListener(this);

  }

  public void actionPerformed(ActionEvent evento){

   if(evento.getSource() == boton1){
 
     texto.setText("Incorrecto :(");
 
   }
 
   if(evento.getSource() == boton2){
 
     texto.setText("Correcto :)");
 
   }
 
   if(evento.getSource() == boton3){
 
     System.exit(0);
 
   }
  }

  public static void main(String args[]){
      
    Botones ventana = new Botones();
    ventana.setBounds(0,0,450,350);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    ventana.setResizable(false);

  }
}