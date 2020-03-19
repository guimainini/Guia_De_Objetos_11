/*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 ... 23
b. Minuto: 0 ... 59
c. Segundo: 0 ... 59
Considere el siguiente comportamiento:
1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
usando zero a la izquierda ejemplo 13:04:22 .
2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
4. Instanciar el objeto y probar los métodos creados.*/

package Ejercicio_5;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import java.util.Scanner;

public class Principal_5 {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Hora horita1 = new Hora();
        horita1.agregarHora();
        System.out.println(horita1.toString());

        do{
            System.out.println("1 <- para avanzar");
            System.out.println("2 <- para retroceder");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 :
                    horita1.avanzar();
                    System.out.println(horita1.toString());
                    break;
                case 2 :
                    horita1.retroceder();
                    System.out.println(horita1.toString());
                    break;
                case 3 :
                    break;
                default:
                    System.out.println("Tocaste cualquier cosa");
            }
        }while(opcion!=3);




    }
}
