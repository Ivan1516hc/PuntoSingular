package alumnos;

import javax.swing.JOptionPane;

/**
 Benjamin Ivan Hernandez Castro
 Instituto Tecnologico de La Piedad
 * Punto Singular
 *1.- Desarrollar una clase que permita ingresar tres valores por teclado. Luego mostrar el mayor y el menor.
 */
public class Alumnos {
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=(JOptionPane.showInputDialog("Ingresa el nombre: "));
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
        float calificacion=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion: "));
        Alumno alum1 = new Alumno(nombre);
        Alumno alum2 = new Alumno (nombre,edad,calificacion);
        alum2.MostrarDatos();
        alum2.MayoriaEdad();
        alum2.Promedio();
    }
    
}
