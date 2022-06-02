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
public abstract class Avion {

    int velocidad;
    String matricula;

    public Avion(int velocidad, String matricula) {
        this.velocidad = velocidad;
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract void visualizar();
}