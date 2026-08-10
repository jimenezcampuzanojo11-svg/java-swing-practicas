//30 programa

package interfazgrafica;
import java.util.Scanner;
import javax.swing.*;

public class InterfazGrafica extends JFrame{
  private JLabel ventana;
  
  public InterfazGrafica(){
  
   setLayout(null);
   ventana = new JLabel("Bienvenido a tu primera interfaz grafica :)");
   ventana.setBounds(100,20,500,200);
   add(ventana);
   
  }
  
  public static void main(String args[]){
      
    Scanner Input = new Scanner(System.in);
    boolean opcion = true;
    
    System.out.println("Escriber true si quieres ver la interfaz.");
    System.out.println("De lo contrario escribe false.");
    opcion = Input.nextBoolean();
    
    InterfazGrafica interfaz = new InterfazGrafica();
    interfaz.setBounds(0,0, 500,400);
    interfaz.setVisible(opcion);
    interfaz.setLocationRelativeTo(null);
  }
}