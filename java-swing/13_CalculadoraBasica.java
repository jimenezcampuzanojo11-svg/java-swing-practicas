//42 programa

package calculadorabasica;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculadoraBasica extends JFrame implements ActionListener{

  String bandera1 = "", bandera2 = "";
  int num1 = 0, num2 = 0, resultado = 0;

  private JLabel texto1, texto2, texto3;
  private JTextField espacio1, espacio2;

  private JMenuBar barra;
  private JMenu opcion1, opcion2, opcion3;
  private JMenuItem color1, color2, salir;
  private JMenuItem suma, resta, multiplicacion, division;
  
  public CalculadoraBasica(){
  
   setLayout(null);
   setTitle("Calculadora Basica");
   
   texto1 = new JLabel("El valor del numero 1");
   texto1.setBounds(10,10,150,30);
   add(texto1);
   
   texto2 = new JLabel("El valor del numero 2");
   texto2.setBounds(10,50,150,30);
   add(texto2);
   
   texto3 = new JLabel("El resultado es:");
   texto3.setBounds(10,90,150,30);
   add(texto3);
   
   espacio1 = new JTextField();
   espacio1.setBounds(150,10,100,30);
   add(espacio1);
   
   espacio2 = new JTextField();
   espacio2.setBounds(150,50,100,30);
   add(espacio2);
   
   barra = new JMenuBar();
   setJMenuBar(barra);
   
   opcion1 = new JMenu("Colores");
   barra.add(opcion1);
   
   opcion2 = new JMenu("Operaciones");
   barra.add(opcion2);
   
   opcion3 = new JMenu("Salir");
   barra.add(opcion3);
   
   color1 = new JMenuItem("Rojo");
   color1.addActionListener(this);
   opcion1.add(color1);
   
   color2 = new JMenuItem("Azul");
   color2.addActionListener(this);
   opcion1.add(color2);
   
   suma = new JMenuItem("Suma");
   suma.addActionListener(this);
   opcion2.add(suma);
   
   resta = new JMenuItem("Resta");
   resta.addActionListener(this);
   opcion2.add(resta);
   
   multiplicacion = new JMenuItem("Multiplicacion");
   multiplicacion.addActionListener(this);
   opcion2.add(multiplicacion);
   
   division = new JMenuItem("Division");
   division.addActionListener(this);
   opcion2.add(division);
   
   salir = new JMenuItem("Salir");
   salir.addActionListener(this);
   opcion3.add(salir);
  
  }
  
  public void actionPerformed(ActionEvent evento){
  
    Container contenedor = this.getContentPane();
    
    if(evento.getSource() == salir){
    
      System.exit(0);
    
    }
    
    if(evento.getSource() == color1){
    
      contenedor.setBackground(Color.red);
    
    }
    
    if(evento.getSource() == color2){
    
      contenedor.setBackground(Color.blue);
    
    }
    
    if(evento.getSource() == suma){
    
      bandera1 = espacio1.getText();
      bandera2 = espacio2.getText();
      num1 = Integer.parseInt(bandera1);
      num2 = Integer.parseInt(bandera2);
      
      resultado = num1 + num2;
      
    }
    
    if(evento.getSource() == resta){
    
      bandera1 = espacio1.getText();
      bandera2 = espacio2.getText();
      num1 = Integer.parseInt(bandera1);
      num2 = Integer.parseInt(bandera2);
      
      resultado = num1 - num2;
    
    }
    
    if(evento.getSource() == multiplicacion){
    
      bandera1 = espacio1.getText();
      bandera2 = espacio2.getText();
      num1 = Integer.parseInt(bandera1);
      num2 = Integer.parseInt(bandera2);
      
      resultado = num1 * num2;
    
    }
    
    if(evento.getSource() == division){
    
      bandera1 = espacio1.getText();
      bandera2 = espacio2.getText();
      num1 = Integer.parseInt(bandera1);
      num2 = Integer.parseInt(bandera2);
      
      resultado = num1 / num2;
    
    }
    
    texto3.setText("El resultado es: "+resultado);
    espacio1.setText("");
    espacio2.setText("");
  }

    
  public static void main(String[] args) {
  
    CalculadoraBasica ventana = new CalculadoraBasica();
    ventana.setBounds(0,0,400,300);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
  
  }
}