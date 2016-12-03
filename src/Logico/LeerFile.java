package Logico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFile{

    public String[] proceso;
    BufferedReader br;
    public int[]vldsuc;
    public int[]vldped;
    String linea;
    public int contlinea;
    public int totalventas;
    public int contpb;
    public int contpm;
    public int contpc;
    public int venb;
    public int venm;
    public int venc;
    FileReader fr;
    DefaultTableModel MdlTFtro=new DefaultTableModel();

    public LeerFile(int[] vldsuc, int[] vldped) {
        this.vldsuc = vldsuc;
        this.vldped = vldped;
    }


    public void filtro()throws FileNotFoundException, IOException{
            try {
            MdlTFtro.addColumn("id. Registro");
            MdlTFtro.addColumn("Cod. ciudad");
            MdlTFtro.addColumn("Ciudad");
            MdlTFtro.addColumn("Cod. pedido");
            MdlTFtro.addColumn("Tipo pedido");
            MdlTFtro.addColumn("Valor Total");
            File dir = new File("C:\\Users\\Alber\\Documents\\Registro.txt");
            fr=new FileReader(dir);
            br = new BufferedReader(fr);
                if (vldsuc[0]==1 && vldsuc[1]==1 && vldsuc[2]==1){
                    while ((br.readLine()) != null) {
                      contlinea++;  
                      proceso=br.readLine().split(",");
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }
                    }br.close();                
                }
                else
                {
                    if (vldsuc[0]==0 && vldsuc[1]==1 && vldsuc[2]==1){
                      while ((br.readLine()) != null) {
                        contlinea++;  
                        proceso=br.readLine().split(",");
                        if("Medellín".equals(proceso[1]) || "Cartagena".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                        }
                      }br.close();                
                    }
                    else{
                      if (vldsuc[0]==1 && vldsuc[1]==0 && vldsuc[2]==1){
                        while ((br.readLine()) != null) {
                            contlinea++;
                            proceso=br.readLine().split(",");
                            if("Bogotá".equals(proceso[1]) || "Cartagena".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                            }
                        }br.close();                
                        
                      }
                      else{
                        if (vldsuc[0]==1 && vldsuc[1]==1 && vldsuc[2]==0){
                            while ((br.readLine()) != null) {
                                contlinea++;
                                proceso=br.readLine().split(",");
                                if("Bogotá".equals(proceso[1]) || "Medellín".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                                }
                            }br.close();                   
                        }
                        else{
                            if (vldsuc[0]==1 && vldsuc[1]==0 && vldsuc[2]==0){
                                while ((br.readLine()) != null) {
                                    contlinea++;
                                    proceso=br.readLine().split(",");
                                    if("Bogotá".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                                    }
                                }br.close();                
                            }
                            else{
                               if (vldsuc[0]==0 && vldsuc[1]==1 && vldsuc[2]==0){
                                    while ((br.readLine()) != null) {
                                        contlinea++;
                                        proceso=br.readLine().split(",");
                                        if("Medellín".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                                        }
                                    }br.close();                
                                }
                               else{
                                    if (vldsuc[0]==0 && vldsuc[1]==0 && vldsuc[2]==1){
                                        while ((br.readLine()) != null) {
                                            contlinea++;
                                            proceso=br.readLine().split(",");
                                            if("Cartagena".equals(proceso[1])){
                      if(vldped[0]==1&&vldped[1]==1&&vldped[2]==1){
                          MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                      }
                      else
                      {
                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==1){
                                if("Para llevar".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                }                            
                            }
                            else
                            {
                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==1){
                                    if("A Domicilio".equals(proceso[3]) || "A la mesa".equals(proceso[3])){
                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                    }                            
                                }
                                else
                                {
                                    if(vldped[0]==1&&vldped[1]==1&&vldped[2]==0){
                                        if("A Domicilio".equals(proceso[3]) || "Para llevar".equals(proceso[3])){
                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                        }                            
                                    }
                                    else
                                    {
                                        if(vldped[0]==0&&vldped[1]==0&&vldped[2]==1){
                                            if("A la mesa".equals(proceso[3])){
                                                MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                            }                            
                                        }
                                        else
                                        {
                                            if(vldped[0]==0&&vldped[1]==1&&vldped[2]==0){
                                                if("Para llevar".equals(proceso[3])){
                                                    MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                }                            
                                            }
                                            else
                                            {
                                                if(vldped[0]==1&&vldped[1]==0&&vldped[2]==0){
                                                    if("A Domicilio".equals(proceso[3])){
                                                        MdlTFtro.addRow(new Object[]{contlinea,proceso[0],proceso[1],proceso[2],proceso[3],proceso[4]});
                                                    }                            
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                      }                                            }
                                        }br.close();                
                                    }
                               }
                            }
                        }
                      }
                    }
                }
        } catch (MalformedURLException mue) {
            System.out.println("Error en la URL");
        } catch (IOException ioe) {
            //System.out.println("Error leyendo informacion");
        }
        finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }//reliza validaciones de pedido tipo por sucursal
    
    public DefaultTableModel getMdlTFtro() {
        return MdlTFtro;
    }

    public int getContlinea() {
        return contlinea;
    }

    public int getTotalventas() {
        return totalventas;
    }

    public int getContpb() {
        return contpb;
    }

    public int getContpm() {
        return contpm;
    }

    public int getContpc() {
        return contpc;
    }

    public int getVenb() {
        return venb;
    }

    public int getVenm() {
        return venm;
    }

    public int getVenc() {
        return venc;
    }
public void consultas() throws FileNotFoundException, IOException{
            File dir = new File("C:\\Users\\Alber\\Documents\\Registro.txt");
            fr=new FileReader(dir);
            br = new BufferedReader(fr);
            totalventas=0;
            contpb=0;
            venb=0;
            venm=0;
            venc=0;
            contpb=0;
            contpm=0;
            contpc=0;
            while ((br.readLine()) != null) {
                proceso=br.readLine().split(",");
                totalventas+=Integer.parseInt(proceso[4]);
                if ("1".equals(proceso[0])){
                    contpb++;
                    venb+=Integer.parseInt(proceso[4]);
                }
                else
                {
                    if ("2".equals(proceso[0])){
                        contpm++;
                        venm+=Integer.parseInt(proceso[4]);
                    }
                    else{
                        contpc++;
                        venc+=Integer.parseInt(proceso[4]);
                    }
                }
            }
}
    
}
