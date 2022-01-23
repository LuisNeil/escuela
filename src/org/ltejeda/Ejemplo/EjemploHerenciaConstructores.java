package org.ltejeda.Ejemplo;

import org.ltejeda.pooherencia.Alumno;
import org.ltejeda.pooherencia.AlumnoInternacional;
import org.ltejeda.pooherencia.Persona;
import org.ltejeda.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=========Creando la instancia clase Alumno ==========");
        Alumno alumno = new Alumno("LuisNe",  "Tejeda", 34,"Universidad de Cartagena");
        alumno.setNotaHistoria(8.2);
        alumno.setNotaLenguaje(7.8);
        alumno.setNotaMatematica(9.5);
        alumno.setEmail("ltejeda@mail.com");

        System.out.println("=========Creando la instancia clase Alumno Internacional==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter","Parker","Inglaterra");
        alumnoInternacional.setEdad(18);
        alumnoInternacional.setInstitucion("Universidad de Cartagena");
        alumnoInternacional.setNotaIdiomas(8.8);
        alumnoInternacional.setNotaHistoria(6.0);
        alumnoInternacional.setNotaLenguaje(6.0);
        alumnoInternacional.setNotaMatematica(9.0);
        alumnoInternacional.setEmail("pparker@mail.com");

        System.out.println("=========Creando la instancia clase Profesor ==========");
        Profesor profesor = new Profesor("Miguel","Mueses","Matematicas");
        profesor.setEdad(40);
        profesor.setEmail("mmueses@mail.com");

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos en comun del tipo Persona");
        System.out.println("Nombre: " + persona.getNombre()
                + ". Apellido: " +persona.getApellido()
                + ". Edad: " + persona.getEdad()
                + ". Email: " +persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del timpo alumno Internacional");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("==========sobre escritura metodo calcular Promedio============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("====================================================");
        }

        if(persona instanceof Profesor){
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("==========sobre escritura metodo saludar============");
        System.out.println(persona.saludar());
        System.out.println("====================================================");
    }
}
