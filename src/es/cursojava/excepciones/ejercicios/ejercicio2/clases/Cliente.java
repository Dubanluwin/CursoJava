package es.cursojava.excepciones.ejercicios.ejercicio2.clases;

public abstract class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean puedeTomarCafe(); // Se crea un metodo abstracto que devuelva boolean si las clases hijas
                                              // pueden tomar cafe.

}
