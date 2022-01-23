package org.ltejeda.Ejemplo;

import org.ltejeda.pooherencia.Alumno;
import org.ltejeda.pooherencia.AlumnoInternacional;
import org.ltejeda.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=========Creando la instancia clase Alumno ==========");
        Alumno alumno = new Alumno();
        alumno.setNombre("LuisNe");
        alumno.setApellido("Tejeda");
        alumno.setInstitucion("Universidad de Cartagena");
        alumno.setNotaHistoria(8.2);
        alumno.setNotaLenguaje(7.8);
        alumno.setNotaMatematica(9.5);

        System.out.println("=========Creando la instancia clase Alumno Internacional==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumno.setNombre("Peter");
        alumno.setApellido("Parker");
        alumnoInternacional.setPais("Inglaterra");
        alumnoInternacional.setEdad(18);
        alumnoInternacional.setInstitucion("Universidad de Cartagena");
        alumnoInternacional.setNotaIdiomas(8.8);
        alumnoInternacional.setNotaHistoria(6.0);
        alumnoInternacional.setNotaLenguaje(6.0);
        alumnoInternacional.setNotaMatematica(9.0);


        System.out.println("=========Creando la instancia clase Profesor ==========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Miguel");
        profesor.setApellido("Mueses");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " +alumno.getApellido());
        System.out.println("Profesor: " + profesor.getAsignatura() +
                ": " + profesor.getNombre() +
                " " + profesor.getApellido());

    }
}
