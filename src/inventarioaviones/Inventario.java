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
public class Inventario {

    ArrayList<Avion> lista = new ArrayList<>();

    public Inventario() {
    }

    public void addAvion(Avion plane) {
        lista.add(plane);
    }

    public void listarAviones() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).visualizar();
        }

    }
}
