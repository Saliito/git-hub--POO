package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Zapatillas extends Producto{
    private int talle;
    private String marca ;
    private double costo;
    private int modelo;

    @Override
    public String toString() {
        return "la zapatilla tiene su" + "modelo " + modelo   + ", talle es" + talle + ", la marca es" + marca + "y su precio es" + costo ;
    }

    public Zapatillas(int talle, String marca, double costo, int modelo, int cod, String desc, int precio) {
        super(cod, desc, precio);
        this.talle = talle;
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
    }
    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public double calcularTotal(){
        switch (modelo){
            case 1:
                costo = 2000;
                
                break;
            case 2:
                costo= 2500;
                break;
            case 3:
                costo = 3000;
                break;
            case 4:
                costo = 4000;
                break;
        }
        return costo;
}
    
    
}
