/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioaviones;

/**
 *
 * @author mono-
 */
public class Paquete {
    String nombre;
    double peso;

    public Paquete(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", peso: " + peso + " kg";
    } 
}
