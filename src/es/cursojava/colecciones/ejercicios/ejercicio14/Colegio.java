package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Colegio {

    private String nombre;
    private String direccion;
    private Map<String, List<Alumno>> aulas;

    public Colegio(String nombre, String direccion, Map<String, List<Alumno>> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = aulas;
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

    public Map<String, List<Alumno>> getAulas() {
        return aulas;
    }

    public void setAulas(Map<String, List<Alumno>> aulas) {
        this.aulas = aulas;
    }

    public static void main(String[] args) {

        // Creación de los alumnos utilizando el metodo generarAlumnos que está en la
        // clase del E14P1
        List<Alumno> alumnos = Ejercicio14Parte1.generarAlumnos();

        // Mapa del primer colegio
        Map<String, List<Alumno>> colegio1 = new LinkedHashMap<>();
        colegio1.put("Aula1", alumnos.subList(0, 2));
        Colegio colegioGetafe = new Colegio("Salesiano", "Getafe Central", colegio1);


        // Mapa del segundo colegio
        Map<String, List<Alumno>> colegio2 = new LinkedHashMap<>();
        colegio2.put("Aula2", alumnos.subList(2, 4));
        Colegio colegioLeganes = new Colegio("El Pilar", "Leganes Central", colegio2);

        // Mapa del tercer colegio
        Map<String, List<Alumno>> colegio3 = new LinkedHashMap<>();
        colegio3.put("Aula3", alumnos.subList(4, 6));
        Colegio colegioFuenlabrada = new Colegio("San Francisco de Sales", "Fuenlabrada Central",
                colegio3);

        List<Colegio> colegios = new ArrayList<>();
        colegios.add(colegioGetafe);
        colegios.add(colegioLeganes);
        colegios.add(colegioFuenlabrada);

        for (Colegio colegio : colegios) {
            System.out
                    .println("El colegio " + colegio.getNombre() + ", tiene como dirección: " + colegio.getDireccion());
            // Utilizamos este metodo para tener los valores pero no se relacionan con el
            // ejercicio ya que pide coherencia.
            // System.out.println(colegio.getAulas().values());

            Set<String> aulasTotales = colegio.getAulas().keySet();

            for (String aula : aulasTotales) {
                System.out.println("Recorriendo el aula... " + aula);
                Collection<List<Alumno>> collectionListaAlumno = colegio.getAulas().values();
                for (List<Alumno> alumnosLista : collectionListaAlumno) {
                    for (Alumno alumnitos : alumnosLista) {
                        System.out.println("El alumno " +
                                alumnitos.getNombre() + ", de apellido " + alumnitos.getApellidos()
                                + ", tiene la nota media de: " + alumnitos.getNotaMedia());
                    }

                }

            }
        }

    }

}