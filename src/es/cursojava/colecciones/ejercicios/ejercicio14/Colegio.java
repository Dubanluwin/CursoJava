package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Colegio extends Ejercicio14Parte1 {

    private String nombre;
    private String direccion;
    private Map<String, List<Alumno>> colegios;

    public Colegio(String nombre, String direccion, Map<String, List<Alumno>> colegios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.colegios = colegios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, List<Alumno>> getColegios() {
        return colegios;
    }

    public void setColegios(Map<String, List<Alumno>> colegio) {
        this.colegios = colegio;
    }


    public static void main(String[] args) {

        Map<String, List<Alumno>> colegio1 = new LinkedHashMap<>();
        colegio1.put("Aula1", null);
        Colegio colegioGetafe = new Colegio("Colegio1", "Getafe Central", colegio1);

        Map<String, List<Alumno>> colegio2 = new LinkedHashMap<>();
        Colegio colegioLeganes = new Colegio("Colegio2", "Leganes Central", colegio2);
        colegio1.put("Aula1", null);

        Map<String, List<Alumno>> colegio3 = new LinkedHashMap<>();
        Colegio colegioFuenlabrada = new Colegio("Colegio3", "Fuenlabrada Central", colegio3);
        colegio1.put("Aula1", null);

        List<Colegio> colegios = new ArrayList<>();
        colegios.add(colegioGetafe);
        colegios.add(colegioLeganes);
        colegios.add(colegioFuenlabrada);

    }
}
