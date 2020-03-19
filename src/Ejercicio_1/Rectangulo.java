package Ejercicio_1;

public class Rectangulo {
    private int ancho = 1;
    private int alto = 1;



    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int calcularArea(){
        int area = (ancho * alto);
        return area;
    }
    public int calcularPerimetro(){
        int perimetro = (ancho*2 + alto*2);
        return perimetro;

    }



}
