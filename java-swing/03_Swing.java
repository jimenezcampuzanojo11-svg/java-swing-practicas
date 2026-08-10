//32 programa

package swing;
import java.util.Scanner;
import javax.swing.*;

public class Swing extends JFrame{
  private JLabel etiqueta1;
  private JLabel etiqueta2;
  
  public Swing(){
  
   setLayout(null);
   etiqueta1 = new JLabel("Bienvenido a esta interfaz");
   etiqueta1.setBounds(50,50,200,100);
   add(etiqueta1);
  
   etiqueta2 = new JLabel("Joshua");
   etiqueta2.setBounds(100,100,150,200);
   add(etiqueta2);
  
  }
  
  public static void main (String args[]){
     
    Scanner Input = new Scanner(System.in);
    int x, y, ancho, alto;
    
    System.out.println("Cual va a ser la cordenada en x?");
    x = Input.nextInt();
    System.out.println("Cual va a ser la cordenada en y?");
    y = Input.nextInt();
    
    System.out.println("Cual va a ser el ancho?");
    ancho = Input.nextInt();
    System.out.println("Cual va a ser el alto?");
    alto = Input.nextInt();
    
    Swing ventana = new Swing();
    ventana.setBounds(x, y, ancho, alto);
    ventana.setVisible(true);
    ventana.setResizable(false);
  }
}