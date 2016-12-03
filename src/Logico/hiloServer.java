package Logico;

import Vista.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class hiloServer implements Runnable {
    String dato;
    int posArreglo=0;
    String []Recibe;
    String Envia;
    Sucursal[] Arreglo=new Sucursal[5];
    Registro Reg=new Registro();
    ObjectOutputStream oos;
    ObjectInputStream ois;
    Socket s;
    BufferedInputStream br;
    DefaultTableModel ModT=new DefaultTableModel();
    public hiloServer(Socket s, DefaultTableModel MT) 
    {
      this.s=s; 
      this.ModT=MT;
    }//

    public Sucursal[] getArreglo() {
        return Arreglo;
    }
    
    @Override
    public void run() 
    {
    try{
    oos = new ObjectOutputStream(s.getOutputStream());
    ois = new ObjectInputStream(s.getInputStream());

    while(posArreglo<5){       
        dato=(String) ois.readObject();
        Recibe=dato.split(",");
        Arreglo[posArreglo]=new Sucursal(Integer.parseInt(Recibe[0]), Integer.parseInt(Recibe[1]), Integer.parseInt(Recibe[2]));
        ModT.addRow(new Object[]{Arreglo[posArreglo].codCiudad,Arreglo[posArreglo].nomCiudad,Arreglo[posArreglo].getTipoPedido().CodPedido,Arreglo[posArreglo].getTipoPedido().nomPedido,Arreglo[posArreglo].getTipoPedido().ValorPedido});
        Envia=String.valueOf(Arreglo[posArreglo].codCiudad);
        Envia+=","+Arreglo[posArreglo].nomCiudad;
          Envia+=","+String.valueOf(Arreglo[posArreglo].getTipoPedido().CodPedido);
          Envia+=","+Arreglo[posArreglo].getTipoPedido().nomPedido;
          Envia+=","+String.valueOf(Arreglo[posArreglo].getTipoPedido().ValorPedido);
          oos.writeObject(Envia);
          Reg.Registro(Envia);
          posArreglo++;      
        }
       } catch (IOException | ClassNotFoundException ex) {
           //Logger.getLogger(hiloServer.class.getName()).log(Level.SEVERE, null, ex);
       }        

    }

    
    }//class
