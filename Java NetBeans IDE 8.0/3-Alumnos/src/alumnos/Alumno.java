package alumnos;

/**
 *
 * @author Benjamin
 */
public class Alumno {
    private String nombre;
    private int edad;
    private float calificacion;
    
    public Alumno(String nombre){
        this.nombre=nombre;
    }
    
    public Alumno(String nombre,int edad,float calificacion){
        this.nombre=nombre;
        this.edad=edad;
        this.calificacion=calificacion;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Calificacion: "+calificacion);
        System.out.println("----------------------------------------------------");
    }
    
    public void MayoriaEdad(){
        if (edad>17) {
            System.out.println("Mayor de Edad");
        }
        else System.out.println("Menor de Edad");
    }
    
    public void Promedio(){
        if (calificacion<8) {
            System.out.println("Reprobado");
        }
        else if (calificacion>=8 && calificacion<10) {
            System.out.println("Aprobado");
        }
        else if (calificacion==10) {
            System.out.println("Excelente");
        }
        else System.err.println("Calificacion Invalida");
    }
}
