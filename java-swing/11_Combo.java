//40 programa

package combo;
import javax.swing.*;
import java.awt.event.*;

public class Combo extends JFrame implements ItemListener, ActionListener{
  
  String bandera = "";
  
  private JLabel texto1, texto2;
  private JComboBox combito;
  private JButton boton;
  
  public Combo(){
  
   setLayout(null);
   setTitle("Colores");
   
   texto1 = new JLabel("Eligar su color favorito");
   texto1.setBounds(10,40,180,25);
   add(texto1);
   
   texto2 = new JLabel("Su color favorito es:");
   texto2.setBounds(10,210,180,25);
   add(texto2);
   
   boton = new JButton("X");
   boton.setBounds(336,0,50,25);
   add(boton);
   boton.addActionListener(this);
   
   combito = new JComboBox();
   combito.setBounds(10,80,100,30);
   add(combito);
   combito.addItemListener(this);
   
   combito.addItem("Azul");
   combito.addItem("Verde");
   combito.addItem("Amarillo");
   combito.addItem("Rosa");
   combito.addItem("Blanco");
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
    if(evento.getSource() == boton){
    
      System.exit(0);
    
    }
  }
  
  public void itemStateChanged(ItemEvent evento){
  
    if(evento.getSource() == combito){
    
      bandera = combito.getSelectedItem().toString();
      texto2.setText("Su color favorito es: "+bandera);
    
    }
  }
    
  public static void main(String[] args) {
  
    Combo ventana = new Combo();
    ventana.setBounds(0,0,400,300);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }
}