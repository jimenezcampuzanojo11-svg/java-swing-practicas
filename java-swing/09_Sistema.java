//38 programa

package sistema;
import javax.swing.*;
import java.awt.event.*;

public class Sistema extends JFrame implements ActionListener{
   
String texto = "";

private JLabel titulo;
private JButton boton, accion;
private JScrollPane flecha;
private JTextField espacio;
private JTextArea area;

public Sistema(){

 setLayout(null);
 
 titulo = new JLabel("Ingrese el alumno al sistema:");
 titulo.setBounds(10,10,200,25);
 add(titulo);
 
 boton = new JButton("Terminar");
 boton.setBounds(350,10,100,25);
 add(boton);
 boton.addActionListener(this);
 
 accion = new JButton("Agregar");
 accion.setBounds(350,50,100,25);
 add(accion);
 accion.addActionListener(this);
 
 espacio = new JTextField();
 espacio.setBounds(10,50,200,25);
 add(espacio);
 
 area = new JTextArea();
 flecha = new JScrollPane(area);
 flecha.setBounds(10,100,400,330);
 add(flecha);

}

public void actionPerformed(ActionEvent evento){

 if(evento.getSource() == boton){
 
   System.exit(0);
 
 }
 
 if(evento.getSource() == accion){
 
   texto += espacio.getText() + "\n";
   area.setText(texto);
   espacio.setText("");
 
 }
}

  public static void main(String[] args) {
  
    Sistema ventana = new Sistema();
    ventana.setBounds(0,0,500,500);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setVisible(true);
  
  }   
}