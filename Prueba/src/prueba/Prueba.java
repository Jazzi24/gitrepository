/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.io.*;
/**
 *
 * @author labdessw09
 */
public class Prueba {

    
    public static void main(String[] args) {
        File ruta = new File("/home/labdessw09/Documentos/Prueba");
        System.out.println(ruta.getAbsolutePath());
        String[] nombres_files = ruta.list();
        for (int i = 0; i < nombres_files.length; i++) {
            System.out.println(nombres_files[i]);
            File f = new File(ruta.getAbsolutePath(),nombres_files[i]);
            if (f.isDirectory()){
                String[] archivos_subfolder = f.list();
                for (int j = 0; j < archivos_subfolder.length; j++) {
                    System.out.println(archivos_subfolder[j]);
                }
            }
        }
    }
    
}
