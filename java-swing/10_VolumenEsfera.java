//39 programa

package volumenesfera;
import javax.swing.*;
import java.awt.event.*;

public class VolumenEsfera extends JFrame implements ActionListener{
  
  String u = "";
  double r = 0, R = 0, volumen = 0;
  
  private JLabel texto1, texto2, texto3, texto4;
  private JTextField espacio1, espacio2;
  private JButton boton1, boton2;
  
  public VolumenEsfera(){
   
   setLayout(null);
   setTitle("Volumen de una esfera");
   
   texto1 = new JLabel("Ingrese el radio de una esfera:");
   texto1.setBounds(10,25,300,25);
   add(texto1);
   
   texto2 = new JLabel("Ingrese las unidades de medida de tu esfera:");
   texto2.setBounds(10,60,300,25);
   add(texto2);
   
   texto3 = new JLabel("Presiona el boton para calcular --->");
   texto3.setBounds(10,90,300,25);
   add(texto3);
   
   texto4 = new JLabel("El volumen de tu esfera es:");
   texto4.setBounds(10,120,300,25);
   add(texto4);
   
   espacio1 = new JTextField();
   espacio1.setBounds(310,25,100,25);
   add(espacio1);
   
   espacio2 = new JTextField();
   espacio2.setBounds(310,60,100,25);
   add(espacio2);
   
   boton1 = new JButton("X");
   boton1.setBounds(500,0,50,25);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Calcular");
   boton2.setBounds(310,90,100,25);
   add(boton2);
   boton2.addActionListener(this);
   
  }
  
  public void actionPerformed(ActionEvent evento){
  
   if(evento.getSource() == boton1){
   
     System.exit(0);
   
   }
   
   if(evento.getSource() == boton2){
   
     r = Double.parseDouble(espacio1.getText());
     R = Math.pow(r, 3);
     volumen = (4*(3.1416*R)/3);
     u = espacio2.getText();
     
     texto4.setText("El volumen de tu esfera es: "+volumen+" "+u+"^3");
     espacio1.setText("");
     espacio2.setText("");
   }
  }
  
  public static void main(String[] args) {
  
    VolumenEsfera ventana = new VolumenEsfera();
    ventana.setBounds(0,0,564,200);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }  
}