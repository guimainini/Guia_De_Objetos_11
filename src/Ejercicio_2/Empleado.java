package Ejercicio_2;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int salario;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Empleado {"+"dni = " +dni+", nombre = "+nombre+", apellido = "+apellido+", salario = "+salario+'}';
    }

    public int salarioPorcentaje(int porciento){
        int salatioTotal = salario + ((salario*porciento)/100);
        return salatioTotal;
    }

    public int salarioAnual(){
        int totalAño = salario*12;
        return totalAño;
    }


}
