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
public class Carga extends Avion {

    private static ArrayList<Paquete> paquetes = new ArrayList<>(1);
    private double pesoMaximo;
    private double pesoActual;

    public Carga(double pesoMaximo, int velocidad, String matricula) {
        super(velocidad, matricula);
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = pesoMaximo;
    }

    public void addPaquete(Paquete paquete) {
        pesoActual -= paquete.getPeso();
        if (pesoActual >= 0) {
            paquetes.add(paquete);
        } else {
            System.out.println("El paquete " + paquete.getNombre() + " no puede ser agregado. Carga máxima superada");
        }
    }

    @Override
    public void visualizar() {
        System.out.println("Avión de Carga matrícula: " + super.getMatricula()
                + ", capacidad: " + pesoMaximo + "kg velocidad:" + super.getVelocidad()+ " km/h, contiene:");
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println(paquetes.get(i));
        }
    }
}
