package Ejercicio_4;

public class Principal_4 {

    public static void main(String[] args) {
        //1
        Cuenta cuentin1 = new Cuenta(1,"Guillermo",15000);
        //2
        cuentin1.credito(2500);
        //3
        cuentin1.debito(1500);
        //4
        cuentin1.debito(30000);

        System.out.println(cuentin1.toString());


    }
}
