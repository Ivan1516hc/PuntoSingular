package valores;

import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class Operaciones {
    private float n1,n2,n3;
    public void Inicilizar(){
        try {
            this.n1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa primer valor: "));
            this.n2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa segundo valor: "));
            this.n3=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tercer valor: "));
        } catch (Exception e) {
            System.out.println("Error al ingresar datos, intenta de nuevo.");
        }
    }

    public void CalcularMayor(){
        if(n1>=n2 && n1>=n3){
            System.out.println("El numero mayor es "+n1);
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("El numero mayor es "+n2);
        }
        else if(n3>=n1 && n3>=n2){
            System.out.println("El numero mayor es "+n3);
        }
        else System.out.println("Numeros iguales");
    }
    public void CalcularMenor(){
        if(n1<=n2 && n1<=n3){
            System.out.println("El numero menor es "+n1);
        }
        else if(n2<=n1 && n2<=n3){
            System.out.println("El numero menor es "+n2);
        }
        else if(n3<=n1 && n3<=n2){
            System.out.println("El numero menor es "+n3);
        }
        else System.out.println("Numeros iguales");
    }
}
