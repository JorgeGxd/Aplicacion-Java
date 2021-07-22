/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;




public class Ventana extends JFrame{
       public JPanel panel = new JPanel();
       public JButton[] btns = new JButton[12];
       public Ventana(){
           setSize(500,500);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setTitle("Aplicacion");
           setBounds(450, 100, 500, 500);
           this.Draw();
       }
       
       
       private void initEvents(){
           //endsWith()
           this.btns[0].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "cadena de prueba";
                    String cadena = JOptionPane.showInputDialog("'" + ref + "' verifique si termina con la palabra: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.endsWith(cadena)));
               }
           });
           
           //equals()
           this.btns[1].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "Marcos";
                    String cadena = JOptionPane.showInputDialog("Nombre: '" + ref + "' ingrese otro nombre: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.equals(cadena)));
               }
           });
           
           //equalsIgnoreCase()
           this.btns[2].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "Marcos";
                    String cadena = JOptionPane.showInputDialog("Nombre: '" + ref + "' ingrese otro nombre: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.equalsIgnoreCase(cadena)));
               }
           });
           
           //indexOf()
           this.btns[3].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "jfiowñncs";
                    String cadena = JOptionPane.showInputDialog("'" + ref + "' ingrese el caracter a obtener: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.indexOf(cadena)));
               }
           });
           
           //indexOf()
           this.btns[4].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "esto es una prueba";
                    String cadena = JOptionPane.showInputDialog("'" + ref + "' ingrese el caracter a obtener: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.lastIndexOf(cadena)));
               }
           });
           
           //length()
           this.btns[5].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
                    JOptionPane.showMessageDialog(null, "Tamaño de la cadena: " + String.valueOf(cadena.length()));
               }
           });
           
          //indexOf()
           this.btns[6].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "esto es una prueba";
                    String cadena = JOptionPane.showInputDialog("'" + ref + "' ingrese el prefijo a verificar ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.startsWith(cadena)));
               }
           });
           
           //subString()
           this.btns[7].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "esto es una prueba";
                    String cadena = JOptionPane.showInputDialog("'" + ref + "' ingrese la posicion de comienzo: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.substring(Integer.parseInt(cadena))));
               }
           });
           
           //subString(int, int)
           this.btns[8].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String ref = "esto es una prueba";
                    String n1 = JOptionPane.showInputDialog("'" + ref + "' ingrese la posicion de comienzo: ");
                    String n2 = JOptionPane.showInputDialog("'" + ref + "' ingrese la posicion de final: ");
                    JOptionPane.showMessageDialog(null, String.valueOf(ref.substring(Integer.parseInt(n1), Integer.parseInt(n2))));
               }
           });
           
           //toLoweCase()
           this.btns[9].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String cadena = JOptionPane.showInputDialog("Ingrese una cadena en mayuscula: ");
                    JOptionPane.showMessageDialog(null, "Cadena en minuscula: " + cadena.toLowerCase());
               }
           });
           
           //toUpperCase()
           this.btns[10].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String cadena = JOptionPane.showInputDialog("Ingrese una cadena en minuscula: ");
                    JOptionPane.showMessageDialog(null, "Cadena en mayuscula: " + cadena.toUpperCase());
               }
           });
           
           //trim()
           this.btns[11].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    String cadena = JOptionPane.showInputDialog("Ingrese una cadena con sangria: ");
                    JOptionPane.showMessageDialog(null, "Cadena sin sangria: " + cadena.trim());
               }
           });
           
       }
       
       private void Draw(){
           
           panel.setLayout(null);
           panel.setBackground(new Color(23, 35, 49));
           this.getContentPane().add(this.panel);
           
           //title
           JLabel title = new JLabel("Aplicacion de Funciones JAVA");
           title.setBounds(130, 5, 300, 100);
           title.setFont(new Font("Serif", Font.PLAIN, 22));
           title.setForeground((Color.WHITE));
           this.panel.add(title);
           
           //buttons
           this.DrawButtons();
           //we need call events
           this.initEvents();
           
       }
              
       private void DrawButtons()
       {
           
           String[] functions = {"endsWith()", "equals()", "equalsIgnoreCase()", "indexOf()", "lastIndexOf()", "length()", "startsWith()", "subString()", "subStringI/F()","toLoweCase()", "toUpperCase()", "trim()" };                                     
           int x = 60;
           int cont = 0;
           int y = 105;
           for(int i = 0; i < 12; i++)
           {
               if(cont == 3)
               {
                   cont = 0;
                   x = 60;
                   y+= +70;
                   JButton btn = new JButton();
                   btn.setBounds(x, y, 120, 25);
                   x += +130;
                   btn.setText(functions[i]);
                   this.btns[i] = btn;
                   this.panel.add(this.btns[i]);
                   cont++;
               }
               else
               {
               
                   JButton btn = new JButton();
                   btn.setBounds(x, y, 120, 25);
                   x += +130;
                   btn.setText(functions[i]);
                   this.btns[i] = btn;
                   this.panel.add(this.btns[i]);
                   cont++;
               }
           }        
           
       }
}
