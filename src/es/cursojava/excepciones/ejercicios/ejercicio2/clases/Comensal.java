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
    public void tomarCafe() {
        System.out.println("El comensal está tomando café."); // TODO Auto-generated method stub

    }

    public boolean isTieneReserva() {
        return tieneReserva;
    }

    public void setTieneReserva(boolean tieneReserva) {
        this.tieneReserva = tieneReserva;
    }
}
