package Ejercicio_3;

public class Principal_3 {
    public static void main(String[] args) {
        Venta ventin1 = new Venta();
        int total;

        ventin1.setCantidad(5);
        ventin1.setDescripcion("Cepillo de dientes");
        ventin1.setIdentificador(2);
        ventin1.setPrecioUnitario(15);

        ventin1.precioTotal();

        System.out.println(ventin1.toString());

    }

}
