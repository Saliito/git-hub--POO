package com.mycompany.poo.git;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Venta {
    private ArrayList<Producto>listProd=new ArrayList<Producto>();
    private int nroFact;
    private LocalDate fecha;
    private static int cantVentas;
    private Cliente cli;

    public Venta(int nroFact, LocalDate fecha, Cliente cli) {
        this.nroFact = Venta.cantVentas;
        this.fecha = LocalDate.now();
        this.cli = cli;
    }

    public ArrayList<Producto> getListProd() {
        return listProd;
    }

    public void setListProd(ArrayList<Producto> listProd) {
        this.listProd = listProd;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        this.nroFact = nroFact;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.cantVentas = cantVentas;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
public double calcularTotal(){
    int precioTotal=0;
    for(Producto p:this.listProd){
        precioTotal=+p.getPrecio();
    }
        return precioTotal;
    
}
public void emitirTicket(){
    System.out.println("Fecha: "+this.fecha+"/nNro Factura: "+this.nroFact+"/nCliente: "+this.cli+"/nProductos..... "+this.listProd+"/nTotal="+this.calcularTotal());
}

}

