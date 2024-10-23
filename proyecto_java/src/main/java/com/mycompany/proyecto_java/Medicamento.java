/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_java;

/**
 *
 * @author chett
 */
public class Medicamento {
     private String nombre;
    private double precio;
    private int cantidad;
     public Medicamento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
     
     public String getNombre(){
     return nombre;
     }
      public double getPrecio() {
        return precio;
    }
       public int getCantidad() {
        return cantidad;
    }
        public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void Llenar(){
       inventario.agregarMedicamento(new Medicamento("Paracetamol", 20.0, 100));
        inventario.agregarMedicamento(new Medicamento("Ibuprofeno", 15.0, 50));
        inventario.agregarMedicamento(new Medicamento("Aspirina", 10.0, 80));
    }
}
