/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pruebas;

import java.awt.Color;
import javax.swing.JFrame;
import Estructura.Lienzo;

/**
 *
 * @author viane
 */
public class Prueba_Grafo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        
        ventana.add(new Lienzo());
        ventana.setBackground(Color.cyan);
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

}
    

