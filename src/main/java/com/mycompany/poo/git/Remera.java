/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.git;

/**
 *
 * @author ET36
 */
public class Remera extends Producto{
    private String marca;
    private double costo;
    private String talle;
    private int modelo;
    private String descripcion;

    public Remera(String marca, String talle, int modelo, String descripcion, int cod, String desc, int precio) {
        super(cod, desc, precio);
        this.marca = marca;
        this.talle = talle;
        this.modelo = modelo;
        this.descripcion = descripcion;
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

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "La remera es el modelo "+modelo+" de la marca "+marca+" el talle es "+talle+" y tiene un costo de "+costo;
    }
    
    @Override
    public double calcularTotal(){
        switch(modelo){
            case 1:
                costo = 4999;
                descripcion = "Negra con lineas blancas en los hombros y logo blanco";
                marca = "Adidas";
                break;
            case 2:
                costo = 15999;
                descripcion = "Chomba Azul Con Rayas Blancas";
                marca = "Zara";
                break;
            case 3:
                costo = 6999;
                descripcion = "Remera rosa con logo de nike en amarillo, ademas una flor blanca con un centro amarillo";
                marca = "Nike";
                break;
            case 4:
                costo = 15000;
                descripcion = "Remera a rayas celeste, amarilla, blanca y verde";
                marca = "Lacoste";
                break;
            default:
                System.out.println("No eligio ninguna opcion disponible");
                break;
        }
        return costo;
    }
}
