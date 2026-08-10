//37 programa

package hoja;
import javax.swing.*;
import java.awt.event.*;

public class Hoja extends JFrame implements ActionListener{
    
  private JLabel texto;
  private JButton boton;
  private JTextArea hoja;
  private JScrollPane flecha;
  
  public Hoja(){
   
   setLayout(null);
   
   texto = new JLabel("Escribe lo quieras en el espacio en blanco");
   texto.setBounds(20,10,300,10);
   add(texto);
   
   boton = new JButton("X");
   boton.setBounds(300,10,45,25);
   add(boton);
   boton.addActionListener(this);
   
   hoja = new JTextArea();
   flecha = new JScrollPane(hoja);
   flecha.setBounds(20,50,330,400);
   add(flecha);
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton){
   
     System.exit(0);
       
   }
  }
    
  public static void main(String[] args) {
  
    Hoja ventana = new Hoja();
    ventana.setBounds(0,0,500,520);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
      
  } 
}
