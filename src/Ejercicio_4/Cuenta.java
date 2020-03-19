package Ejercicio_4;

public class Cuenta {
    private int identificar;
    private String nombre;
    private double balance;

    public Cuenta(int identificar, String nombre, double balance) {
        this.identificar = identificar;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdentificar() {
        return identificar;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setIdentificar(int identificar) {
        this.identificar = identificar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Cuenta{" +
                "identificar=" + identificar +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double credito(double deposito){
        balance += deposito;
        return balance;
    }
    public double debito(double sustraccion){
        //boolean tata = true;
        //while(tata == true) {
            if (balance - sustraccion > 0) {
                balance += sustraccion;
                //tata = false;
            } else {
                System.out.println("No se puede realizar la operacion...");
            }
        //}

        return balance;
    }


}
