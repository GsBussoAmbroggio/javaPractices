package Exercise1;
import javax.swing.JOptionPane;

public class CuadradoNum {

    public static void main(String[]args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >0 || numero <0){

        while(numero> 0){ //mientras el numero sea menor que cero sera negativo

            JOptionPane.showMessageDialog(null,"El numero "+ numero+" es Positivo");

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        while(numero<0){//mientras el numero sea mayor que cero sera positivo

                JOptionPane.showMessageDialog(null,"El numero "+ numero+" es Negativo");

                numero = Integer.parseInt(JOptionPane.showInputDialog("\n Ingrese otro numero: "
                    +"\n  Presione la tecla 0 (cero) para salir del sistema"));

                // HASTA ACA ESTA TODO BIEN
        }
        }
        if (numero == 0){
            JOptionPane.showMessageDialog(null, "Ha salido correctamente del sistema a presionado el numero 0");
    }
}
}





/*
public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while (numero >0 || numero <0 || numero ==0){


        while (numero>0){
        JOptionPane.showMessageDialog(null, "El numero " +numero+ " es positivo");

        numero = Integer.parseInt(JOptionPane.showInputDialog("\n Ingrese otro numero: "
        +"\n Presione la tecla 0 (cero) para salir del sistema"  ));
        JOptionPane.showMessageDialog(null, "Ha salido correctamente del sistema");
        }

        while (numero<0){
        JOptionPane.showMessageDialog(null, "El numero " +numero+ " es negativo");

        numero = Integer.parseInt(JOptionPane.showInputDialog("\n Ingrese otro numero: "
        +"\n  Presione la tecla 0 (cero) para salir del sistema"));
        JOptionPane.showMessageDialog(null, "Ha salido correctamente del sistema");
        }
        }
        }
        }


     */
