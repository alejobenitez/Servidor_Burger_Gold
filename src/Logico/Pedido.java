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
public class Pedido {
 public int CodPedido; //código pedido (1-domicilio, 2-para llevar, 3-a la mesa)
 public String nomPedido; //código pedido (1-domicilio, 2-para llevar, 3-a la mesa)
 public int ValorPedido;

    public Pedido(int CodPedido, String nomPedido, int ValorPedido) {
        this.CodPedido = CodPedido;
        this.nomPedido = nomPedido;
        this.ValorPedido = ValorPedido;
    }

    public int getCodPedido() {
        return CodPedido;
    }

    public String getNomPedido() {
        return nomPedido;
    }

    public int getValorPedido() {
        return ValorPedido;
    }
 

 


}
