package es.cursojava.excepciones.ejercicios.ejercicio2.clases;

import es.cursojava.excepciones.ejercicios.ejercicio2.interfaz.TomarCafe;

public class Comensal extends Cliente implements TomarCafe {

    private boolean tieneReserva;

    public Comensal(String nombre, boolean tieneReserva) {
        super(nombre);
        this.tieneReserva = tieneReserva;
    }

    @Override
    public String toString() {
        return "Comensal [tieneReserva=" + tieneReserva + "]";
    }

    @Override
    public void tomarCafe(TazaCafe tazaCafe) {
        System.out.println("El comensal está tomando " + tazaCafe);

    }

    @Override
    public boolean puedeTomarCafe() {

        // LOS COMENSALES SI PUEDEN TOMAR CAFÉ.

        return true;
    }

    public boolean isTieneReserva() {
        return tieneReserva;
    }

    public void setTieneReserva(boolean tieneReserva) {
        this.tieneReserva = tieneReserva;
    }

}
