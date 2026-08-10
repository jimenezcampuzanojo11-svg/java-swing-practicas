//36 programa

package cuadrotexto;
import javax.swing.*;
import java.awt.event.*;

public class CuadroTexto extends JFrame implements ActionListener{

  private JLabel texto;
  private JButton boton;
  private JTextArea hoja;
  
  public CuadroTexto(){
   
   setLayout(null);
   
   texto = new JLabel ("Ingresa lo que quieras escribir:");
   texto.setBounds(20,20,200,20);
   add(texto);
   
   boton = new JButton ("cerrar");
   boton.setBounds(20,560,75,30);
   add(boton);
   boton.addActionListener(this);
   
   hoja = new JTextArea();
   hoja.setBounds(20,50,260,500);
   add(hoja);

  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton){
   
     System.exit(0);
   
   }
  }
  
  public static void main(String args[]){
  
    CuadroTexto ventana = new CuadroTexto();
    ventana.setBounds(0,0,315,650);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }
}