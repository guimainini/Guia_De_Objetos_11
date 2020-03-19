package Ejercicio_1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int alto,ancho;
        Scanner entrada = new Scanner(System.in);

        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangulo rectan1 = new Rectangulo();

        //b. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        System.out.println("El alto del rectangulo es : "+rectan1.getAlto());
        System.out.println("El ancho del rectangulo es : "+rectan1.getAncho());

        //c. Imprimir por pantalla el área y perímetro.
        System.out.println("El area de ese rectangulo es : "+rectan1.calcularArea());
        System.out.println("El perimetro de ese rectangulo es : "+rectan1.calcularPerimetro());

        //d. Modificar el alto y el ancho de la instancia.
        System.out.print("Ingrese de nuevo el ancho : ");
        ancho = entrada.nextInt();
        rectan1.setAncho(ancho);

        System.out.print("Ingrese de nuevo el alto : ");
        alto = entrada.nextInt();
        rectan1.setAlto(alto);

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println("El area de ese rectangulo es : "+rectan1.calcularArea());
        System.out.println("El perimetro de ese rectangulo es : "+rectan1.calcularPerimetro());

        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        rectan1 = new Rectangulo();
        System.out.println("El alto del rectangulo es : "+rectan1.getAlto());
        System.out.println("El ancho del rectangulo es : "+rectan1.getAncho());

    }
}
