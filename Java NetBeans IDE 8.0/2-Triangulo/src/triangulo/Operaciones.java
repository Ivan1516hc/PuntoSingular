package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class Operaciones {
    private float l1,l2,l3;
    public void Inicilizar(){
        try {
            this.l1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa primer lado: "));
            this.l2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa segundo lado: "));
            this.l3=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tercer lado: "));
        } catch (Exception e) {
            System.out.println("Error al ingresar datos, intenta de nuevo.");
        }
    }
    public void LadoMayor(){
        if(l1>=l2 && l1>=l3){
            System.out.println("El lado mayor es "+l1);
        }
        else if(l2>=l1 && l2>=l3){
            System.out.println("El lado mayor es "+l2);
        }
        else if(l3>=l1 && l3>=l2){
            System.out.println("El lado mayor es "+l3);
        }
        else System.out.println("Lados iguales");
    }
    public void Equilatero(){
        if (l1==l2 && l1==l3) {
            System.out.println("Este tringulo es equilatero");
        }
        else System.out.println("Este no es un triangulo equilatero");
    }
}
