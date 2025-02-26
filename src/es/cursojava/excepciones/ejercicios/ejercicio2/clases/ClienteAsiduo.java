package es.cursojava.excepciones.ejercicios.ejercicio2.clases;

import es.cursojava.excepciones.ejercicios.ejercicio2.interfaz.TomarCafe;

public class ClienteAsiduo extends Cliente implements TomarCafe {

    private String mote;

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public ClienteAsiduo(String nombre, String mote) {
        super(nombre);
        this.mote = mote;
    }

    @Override
    public String toString() {
        return "ClienteAsiduo [mote=" + mote + "]";
    }

    @Override
    public void tomarCafe(TazaCafe tazaCafe) {
        System.out.println("El cliente asiduo está tomando" + tazaCafe + "."); // TODO Auto-generated method stub

    }

    @Override
    public boolean puedeTomarCafe() {

        // LOS CLIENTES ASIDUOS SI PUEDEN TOMAR CAFÉ.

        return true;
    }

}
