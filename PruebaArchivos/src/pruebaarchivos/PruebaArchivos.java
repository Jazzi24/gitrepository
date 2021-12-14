/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarchivos;
import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;
public class PruebaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           String n = JOptionPane.showInputDialog(null,"Ingrese el nombre");
           File archivo = new File("/home/labdessw09/Documentos/Prueba/prueba.txt");
           archivo.createNewFile();
           FileWriter W = new FileWriter(archivo);
           BufferedWriter bw = new BufferedWriter(W);
            for (int i = 0; i < n.length(); i++) {
                bw.write(n.charAt(i));
                bw.newLine();   
            }
           bw.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo");
        }
//                int c= (int)(Math.random()*10+1);
//                System.out.println(c);
    }
    
}
