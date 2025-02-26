package es.cursojava.excepciones.ejercicios.ejercicio2.clases;

import es.cursojava.excepciones.ejercicios.ejercicio2.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.ejercicio2.excepciones.TooHotTemperatureException;

public class TazaCafe {

    private String tipoCafe;
    private int temperatura;

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public TazaCafe(String tipoCafe, int temperatura) throws TooColdTemperatureException, TooHotTemperatureException {

        if (temperatura <= 20) {
            throw new TooColdTemperatureException("La taza de café está muy fria.");
        }
        if (temperatura >= 80) {
            throw new TooHotTemperatureException("La taza de café está muy caliente.");
        }

        this.tipoCafe = tipoCafe;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "TazaCafe [tipoCafe=" + tipoCafe + ", temperatura=" + temperatura + "]";
    }

}
