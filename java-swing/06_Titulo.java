//35 programa

package titulo;
import javax.swing.*;
import java.awt.event.*;

public class Titulo extends JFrame implements ActionListener{

  private JLabel texto;
  private JButton boton1, boton2;
  private JTextField blanco;
  
  public Titulo(){
  
   setLayout(null);
   
   texto = new JLabel("¿Cual deseas que sea el titulo?");
   texto.setBounds(10,10,200,20);
   add(texto);
   
   boton1 = new JButton("Aplicar");
   boton1.setBounds(30,100,75,25);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Salir");
   boton2.setBounds(110,100,75,25);
   add(boton2);
   boton2.addActionListener(this);
   
   blanco = new JTextField();
   blanco.setBounds(10,50,200,27);
   add(blanco);
   
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton1){
   
     String titulo = blanco.getText();
     setTitle(titulo);
   
   }
   
   if(evento.getSource() == boton2){
   
     System.exit(0);
   
   }
  }
  
  public static void main(String args[]){
  
    Titulo ventana = new Titulo();
    ventana.setBounds(0,0,300,200);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }
}