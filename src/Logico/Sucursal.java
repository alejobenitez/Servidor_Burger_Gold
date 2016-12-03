/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import java.io.IOException;

/**
 *
 * @author Alber
 */
public class Sucursal {
public int codCiudad;
public String nomCiudad; //Nombre de la ciudad
public static Pedido TipoPedido;
public int CodPedido;
public int ValPedido;
    /**
     *
     * @param codCiud
     * @param Ciudad
     */
    public Sucursal(int codCiud, int CodPedido, int ValPedido) {
        this.codCiudad=codCiud;
        this.CodPedido=CodPedido;
        this.ValPedido=ValPedido;
        pedido();
        Ciudad();
}

    public int getCodCiudad() {
        return codCiudad;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public Pedido getTipoPedido() {
        return TipoPedido;
    }
    
    public Pedido pedido()
    {
        if (CodPedido==1)
            TipoPedido=new Pedido(CodPedido,"A Domicilio", ValPedido);
        if (CodPedido==2)
            TipoPedido=new Pedido(CodPedido,"Para llevar", ValPedido);
        if (CodPedido==3)
            TipoPedido=new Pedido(CodPedido,"A la mesa", ValPedido);
        return TipoPedido;
    }
     public void Ciudad()
    {
        if (codCiudad==1)
            nomCiudad="Bogotá";
        if (codCiudad==2)
            nomCiudad="Medellín";
        if (codCiudad==3)
            nomCiudad="Cartagena";
    }
}
