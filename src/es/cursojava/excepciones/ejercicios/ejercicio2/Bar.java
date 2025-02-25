package es.cursojava.excepciones.ejercicios.ejercicio2;

import es.cursojava.excepciones.ejercicios.ejercicio2.clases.ClienteAsiduo;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.Comensal;
import es.cursojava.excepciones.ejercicios.ejercicio2.clases.Huesped;

public class Bar {

    private String nombre;

    public static void main(String[] args) {

    }

    public void abrir() {

        Huesped huesped = new Huesped("Huesped", "A1234");
        Comensal comensal = new Comensal("Comensal", true);
        ClienteAsiduo clienteAsiduo = new ClienteAsiduo("ClienteAsiduo", "El grande");

        
    }

}
