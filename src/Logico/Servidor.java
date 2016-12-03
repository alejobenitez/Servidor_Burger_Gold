/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alcarmon
 */
public class Servidor implements Runnable{
    static hiloServer hs;
    JEditorPane Estado;
    String mensajes="";
    Socket s;
    ServerSocket ss;
    DefaultTableModel ModeloT=new DefaultTableModel();
    Thread hilo;

    /**
     *
     * @param state
     * @throws IOException
     */
    public Servidor(JEditorPane state,DefaultTableModel Modelotabla)throws IOException{
        this.Estado=state;
        this.ModeloT=Modelotabla;
        ss = new ServerSocket(12345);
    }
        @Override
    public void run() {
                while (true) {
            mensajes += "Esperando...\n";
            Estado.setText(mensajes);
            try {
                s = ss.accept();
                mensajes += "cliente conectado...\n";
                Estado.setText(mensajes);
                hs = new hiloServer(s,ModeloT);
                hilo=new Thread(hs);
                hilo.start();
                mensajes += "hilo iniciado...\n";
                Estado.setText(mensajes);
                } 
            catch (IOException ex) {
                        Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                    }

        }//while

    }

}
