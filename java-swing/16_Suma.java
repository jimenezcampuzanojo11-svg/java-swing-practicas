//45 programa

package suma;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener, ChangeListener{
    
  int x = 0, y = 0, suma = 0;
  
  private JLabel texto1, texto2, texto3, texto4;
  private JButton boton1, boton2;
  private JTextField espacio1, espacio2;
  private JCheckBox check;
  
  public Suma(){
  
   setLayout(null);
   setTitle("Suma");
   
   texto1 = new JLabel("Ingresa el primer numero:");
   texto1.setBounds(15,30,160,25);
   add(texto1);
   
   texto2 = new JLabel("Ingresa el segundo numero:");
   texto2.setBounds(15,60,165,25);
   add(texto2);
   
   texto3 = new JLabel("");
   texto3.setBounds(15,90,180,25);
   add(texto3);
   
   texto4 = new JLabel("¿Estas seguro que deseas salir?");
   texto4.setBounds(150,125,190,25);
   add(texto4);
   
   espacio1 = new JTextField();
   espacio1.setBounds(190,30,100,25);
   add(espacio1);
   
   espacio2 = new JTextField();
   espacio2.setBounds(190,60,100,25);
   add(espacio2);
   
   check = new JCheckBox("Si");
   check.setBounds(225,150,55,25);
   add(check);
   check.addChangeListener(this);
   
   boton1 = new JButton("Suma");
   boton1.setBounds(190,90,100,25);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Salir");
   boton2.setBounds(412,0,75,26);
   add(boton2);
   boton2.addActionListener(this);
   boton2.setEnabled(false);
   
  }
  
  public void actionPerformed(ActionEvent evento){
  
    if(evento.getSource() == boton1){
    
      x = Integer.parseInt(espacio1.getText());
      y = Integer.parseInt(espacio2.getText());
      
      suma = x + y;
      texto3.setText(x+" + "+y+" es igual a "+suma);
      
      espacio1.setText("");
      espacio2.setText("");
    }
    
    if(evento.getSource() == boton2){
    
      System.exit(0);
    }
  }
  
  public void stateChanged(ChangeEvent evento){
  
   if(check.isSelected() == true){
   
     boton2.setEnabled(true);
   
   }else{
   
     boton2.setEnabled(false);  
   
   }
  }
 
  public static void main(String[] args) {
  
    Suma ventana = new Suma();
    ventana.setBounds(0,0,500,300);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }   
}