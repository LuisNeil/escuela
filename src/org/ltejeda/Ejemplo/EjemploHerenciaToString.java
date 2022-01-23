package org.ltejeda.Ejemplo;

import org.ltejeda.pooherencia.Alumno;
import org.ltejeda.pooherencia.AlumnoInternacional;
import org.ltejeda.pooherencia.Persona;
import org.ltejeda.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("=========Creando la instancia clase Alumno ==========");
        Alumno alumno = new Alumno("LuisNe", "Tejeda", 34, "Universidad de Cartagena");
        alumno.setNotaHistoria(8.2);
        alumno.setNotaLenguaje(7.8);
        alumno.setNotaMatematica(9.5);
        alumno.setEmail("ltejeda@mail.com");

        System.out.println("=========Creando la instancia clase Alumno Internacional==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Parker", "Inglaterra");
        alumnoInternacional.setEdad(18);
        alumnoInternacional.setInstitucion("Universidad de Cartagena");
        alumnoInternacional.setNotaIdiomas(8.8);
        alumnoInternacional.setNotaHistoria(6.0);
        alumnoInternacional.setNotaLenguaje(6.0);
        alumnoInternacional.setNotaMatematica(9.0);
        alumnoInternacional.setEmail("pparker@mail.com");

        System.out.println("=========Creando la instancia clase Profesor ==========");
        Profesor profesor = new Profesor("Miguel", "Mueses", "Matematicas");
        profesor.setEdad(40);
        profesor.setEmail("mmueses@mail.com");

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}
