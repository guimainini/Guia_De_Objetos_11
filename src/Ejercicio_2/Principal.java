package Ejercicio_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int porciento;
        Empleado emplea1 = new Empleado();
        Empleado emplea2 = new Empleado();
        Scanner entrada = new Scanner(System.in);
        //a Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        emplea1.setNombre("Carlos");
        emplea1.setApellido("Gutierrez");
        emplea1.setDni("23456345");
        emplea1.setSalario(25000);

        //b Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        emplea2.setNombre("Ana");
        emplea2.setApellido("Sanchez");
        emplea2.setDni("34234123");
        emplea2.setSalario(27500);


        //c
        System.out.println(emplea1.toString());
        System.out.println(emplea2.toString());

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
        System.out.print("Digite el porcentaje q desea subierle el salario : %");
        porciento = entrada.nextInt();
        int tata = emplea1.salarioPorcentaje(porciento);
        //System.out.println(tata);
        emplea1.setSalario(tata);
        int toto = emplea1.salarioAnual();

        System.out.println("Carlos cobra un salario anual : "+toto);


        
    }
}
