//31 programa

package interfacesgraficas;
import javax.swing.*;

public class InterfacesGraficas extends JFrame{
  private JLabel ventanita;
  
  public InterfacesGraficas(){
   
   setLayout(null);
   ventanita = new JLabel();
   ventanita.setBounds(0,0,1,1);
   add(ventanita);
  
  }
  
  public static void main(String args[] ){
      
    InterfacesGraficas interfaz = new InterfacesGraficas();
    interfaz.setBounds(0,0,400,600);
    interfaz.setVisible(true);
    interfaz.setLocationRelativeTo(null);
    interfaz.setResizable(false);
      
  }
}