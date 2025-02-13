package es.cursojava.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class EjercicioAlumnosCollection {
    public static void main(String[] args) {

        EjercicioAlumnosCollection instituto = new EjercicioAlumnosCollection();
        List<Alumno> alumnos = instituto.iniciarInstituto();
        instituto.mostrarInformacionAlumnos(alumnos);
        instituto.buscarAlumno(alumnos);

        Map<String, List<Alumno>> mapaAlumnos = new LinkedHashMap<>();

        mapaAlumnos.put("Aula 1", alumnos.subList(0, 2));
        mapaAlumnos.put("Aula 2", alumnos.subList(3, 5));
        mapaAlumnos.put("Aula 3", alumnos.subList(5, 7));

        System.out.println(mapaAlumnos.get("Aula 3"));
    }

    public List<Alumno> iniciarInstituto() {

        // Crear 6 alumnos

        Alumno alumno1 = new Alumno("NOMBRE1", "APELLIDO1", 16, 1, "alumno1@gmail.com");
        Alumno alumno2 = new Alumno("NOMBRE2", "APELLIDO2", 17, 2, "alumno2@gmail.com");
        Alumno alumno3 = new Alumno("NOMBRE1", "APELLIDO3", 18, 3, "alumno3@gmail.com");
        Alumno alumno4 = new Alumno("NOMBRE2", "APELLIDO4", 19, 4, "alumno4@gmail.com");
        Alumno alumno5 = new Alumno("NOMBRE5", "APELLIDO5", 20, 5, "alumno5@gmail.com");
        Alumno alumno6 = new Alumno("NOMBRE6", "APELLIDO6", 21, 6, "alumno6@gmail.com");

        // Añadir a los 6 alumnos en una lista

        List<Alumno> alumnos = new ArrayList<>();

        // Método para añadir los alumnos uno por uno.
        // alumnos.add(alumno1);
        // alumnos.add(alumno2);
        // alumnos.add(alumno3);
        // alumnos.add(alumno4);
        // alumnos.add(alumno5);
        // alumnos.add(alumno6);

        // Método para añadir a los alumnos en una linea de codigo.
        alumnos.addAll(Arrays.asList(alumno1, alumno2, alumno3, alumno3, alumno4, alumno5, alumno6));

        return alumnos;
    }

    public void mostrarInformacionAlumnos(List<Alumno> alumnos) {

        // Métodos para mostrar toda la información de los alumnos en una lista
        // Utilizando el fore

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        // Utilizando el for tradicional

        // for (int i = 0; i < alumnos.size(); i++) {
        // System.out.println(alumnos.get(i).toString());
        // }
    }

    public void buscarAlumno(List<Alumno> alumnos) {

        // Método para preguntar por el nombre de un alumno y nos dará la nota media de
        // todos los alumnos que se llamen igual.

        // System.out.println(
        // "Si deseas buscar un alumno recuerda que se mostrarán todas las notas medias
        // de los alumnos que se llamen igual.");
        // Scanner scan = new Scanner(System.in);
        // String alumnoBuscar = scan.nextLine();

        String alumnoBuscar = Utilidades.pideDatoCadena(
                "Si deseas buscar un alumno recuerda que se mostrarán todas las notas medias de los alumnos que se llamen igual.");

        for (Alumno alumno : alumnos) {
            if ((alumno.getNombre().equalsIgnoreCase(alumnoBuscar))) {
                System.out.println("La nota del alumno " + alumno.getNombre() + " " + alumno.getNotaMedia());
            }

        }
    }

}
