package es.cursojava.excepciones.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Principal {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Datos del alumno " + (i + 1));
            try {
                String nombre = Utilidades.pideDatoCadena("Introduce nombre del alumno " + (i + 1));
                int edad = Utilidades.pideDatoNumerico("Introduce edad del alumno " + (i + 1));
                double notaMedia = Utilidades.pideDatoDecimal("Introduce la nota media del alumno " + (i + 1));

                Alumno alumno = new Alumno(nombre, edad, notaMedia);
                alumnos.add(alumno);

            } catch (NotaInvalidaException | IllegalArgumentException e) {
                System.err.println("Alumno no se ha podido crear correctamente " + e.getMessage());
                // e.printStackTrace();

            }

            System.out.println("Numeros de alumnos guardados: " + alumnos.size());
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
}

/*
 * COMO LO HICE YO ---->
 * 
 * 
 * Scanner scan = new Scanner(System.in);
 * System.out.println("¿Cuántos alumnos quieres inscribir en el instituto?");
 * int cantidadAlumnos = scan.nextInt();
 * 
 * for (int i = 0; i < cantidadAlumnos; i++) {
 * 
 * try {
 * System.out.println("Ingresa los datos del alumno " + (i + 1) + ".");
 * 
 * Scanner scan2 = new Scanner(System.in);
 * System.out.println("¿Cuál es su nombre?");
 * String nombre = scan2.nextLine();
 * 
 * System.out.println("¿Qué edad tiene?");
 * int edad = scan.nextInt();
 * 
 * System.out.println("¿Cuál es la nota?");
 * double notaMedia = scan.nextDouble();
 * 
 * Alumno alumno = new Alumno(nombre, edad, notaMedia);
 * 
 * System.out.println("El alumno " + (i + 1) +
 * ", se ha inscrito correctamente.");
 * System.out.println("El alumno " + alumno.getNombre() + ", con la edad " +
 * alumno.getEdad()
 * + " y con la nota: " + alumno.getNotaMedia() + ".");
 * 
 * } catch (IllegalArgumentException e) {
 * System.out.println("Error: " + e.getMessage());
 * } catch (NotaInvalidaException e) {
 * System.out.println("Error: " + e.getMessage());
 * } finally {
 * System.out.println("El finally se imprime siempre.");
 * }
 * 
 * }
 * 
 */