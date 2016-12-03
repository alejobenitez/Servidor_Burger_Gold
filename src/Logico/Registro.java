/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;

/**
 *
 * @author alcarmon
 */
public class Registro {
    Sucursal Suc;
    String reghilo;
    int posReg=0;
    String ruta = "C:\\Users\\Alber\\Documents\\Registro.txt";
    File archivo;
    FileWriter fw;
    PrintWriter pw = null; 
    BufferedWriter bw;
    public synchronized void Registro(String a) throws IOException{
        try{
        archivo = new File(ruta);
        fw=new FileWriter(archivo,true);
        pw = new PrintWriter(fw);
        pw.println("\n"+a);
        } catch (Exception e) { 
        e.printStackTrace(); 
        } finally { 
        // Nuevamente aprovechamos el finally para 
        // asegurarnos que se cierra el fichero. 
        if (null != fw) 
        fw.close(); 
            try { 
            }   
            catch (Exception e2) { 
            e2.printStackTrace(); 
            }        
        } 

    }

  
}
