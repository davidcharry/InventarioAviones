/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioaviones;

import java.util.ArrayList;

/**
 *
 * @author mono-
 */
public class Comercial extends Avion {

    private int numMaxPasajeros;
    private static ArrayList<Pasajero> pasaj = new ArrayList();
    private int numPasajeros;

    public Comercial(int numPasajeros, int velocidad, String matricula) {
        super(velocidad, matricula);
        this.numPasajeros = numPasajeros;
        this.numMaxPasajeros = numPasajeros;
    }

    public void addPasajero(Pasajero pasa) {
        if (numMaxPasajeros == 0) {
            System.out.println("Avión Comercial lleno. No es posible agregar a " + pasa.getNombre());
        } else {
            pasaj.add(pasa);
            numMaxPasajeros--;
        }
    }

    @Override
    public void visualizar() {
        System.out.println("Avión Comercial matrícula: " + super.getMatricula()
                + ", capacidad: " + numPasajeros + ", velocidad: " + super.getVelocidad() + " km/h");
        for (int i = 0; i < pasaj.size(); i++) {
            System.out.println(pasaj.get(i));
        }
    }
}
