/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.git;

/**
 *
 * @author ET36
 noah laurito*/
public abstract class  Producto {
    private int cod;
    private String desc;
    private int precio;

    public Producto(int cod, String desc, int precio) {
        this.cod = cod;
        this.desc = desc;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public abstract String toString(); 
    
    public abstract double calcularTotal();
    
}
