package es.cursojava.excepciones.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.excepciones.ejercicios.ejercicio2.clases.Cliente;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.ClienteAsiduo;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.Comensal;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.Huesped;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.TazaCafe;
import es.cursojava.excepciones.ejercicios.ejercicio2.excepciones.TemperatureException;
import es.cursojava.excepciones.ejercicios.ejercicio2.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.ejercicio2.excepciones.TooHotTemperatureException;

public class Bar {

    private String nombre;

    public static void main(String[] args) throws TooColdTemperatureException, TooHotTemperatureException {

        Bar bar = new Bar("El Bar de Mou.");
        List<Cliente> clientes = bar.abrir();
        bar.servirCafe(clientes);
    }

    //
    //
    //
    //
    //
    //
    //
    //
    //

    public List<Cliente> abrir() {

        Huesped huesped = new Huesped("Huesped", "A1234");
        Comensal comensal = new Comensal("Comensal", true);
        ClienteAsiduo clienteAsiduo = new ClienteAsiduo("ClienteAsiduo", "El Grande");

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(huesped);
        clientes.add(comensal);
        clientes.add(clienteAsiduo);

        return clientes;

    }

    public void servirCafe(List<Cliente> clientes) throws TooColdTemperatureException, TooHotTemperatureException {

        for (Cliente cliente : clientes) {
            if (cliente.puedeTomarCafe()) {

                try {

                    TazaCafe mocaccino = new TazaCafe("Mocaccino", 99);
                    System.out.println("El cliente " + cliente.getNombre() + ", está tomando " + mocaccino.toString());

                    if (mocaccino.getTemperatura() > 80) {

                        throw new TooHotTemperatureException(
                                "¡El café está demasiado caliente!" + mocaccino.getTemperatura());

                    } else if (mocaccino.getTemperatura() < -20) {

                        throw new TooColdTemperatureException(
                                "¡El café está demasiado frío!" + mocaccino.getTemperatura());
                    }

                } catch (TemperatureException e) {

                    System.out.println(e.getMessage());

                }
            }

        }
    }

    @Override
    public String toString() {
        return "Bar [nombre=" + nombre + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bar(String nombre) {
        this.nombre = nombre;
    }
}
