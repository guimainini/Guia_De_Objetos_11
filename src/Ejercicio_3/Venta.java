package Ejercicio_3;

public class Venta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int precioTotal(){
        int total = cantidad*precioUnitario;
        return total;
    }


    public String toString() {
        return "Venta -> identificador = "+identificador+", descripcion = "+descripcion+", cantidad = "+cantidad+", precioUnitario="+precioUnitario+", PrecioTotal = "+precioTotal();
    }
}
