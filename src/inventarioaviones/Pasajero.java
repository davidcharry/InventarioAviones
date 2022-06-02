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
public class Pasajero {
    String nombre;
    String identificacion;

    public Pasajero(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + "|" + identificacion;
    }
}
