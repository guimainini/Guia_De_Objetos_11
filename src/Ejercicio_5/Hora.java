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

import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    Scanner entrada = new Scanner(System.in);



    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String toString (){
        String horita, minutito, segundito;
        if (this.hora < 10){
            horita = "0"+this.hora;
        }else{
            horita = ""+this.hora;
        }
        if (this.minuto < 10){
            minutito = ":0"+this.minuto;
        }else{
            minutito = ":"+this.minuto;
        }
        if (this.segundo < 10){
            segundito = ":0"+this.segundo;
        }else{
            segundito = ":"+this.segundo;
        }
        return horita+minutito+segundito;
    }
    public void agregarHora(){
        System.out.print("Ingrese una hora por favor... : ");
        hora = entrada.nextInt();
        while(hora < 0 || hora > 24){
            System.out.print("Digite una hora q este bien hijo de puta de 0 a 24...: ");
            hora = entrada.nextInt();
        }


        System.out.print("Ingrese los minutos por favor... : ");
        minuto = entrada.nextInt();
        /*if(minuto > 10){
        minuto += 00;
        }*/
        while(minuto < 0 || minuto > 59){
            System.out.print("Digite unos minutos q este bien hijo de puta de 0 a 59...: ");
            minuto = entrada.nextInt();
        }

        System.out.print("Ingrese los segundos por favor... : ");
        segundo = entrada.nextInt();
        while(segundo < 0 || segundo > 59){
            System.out.print("Digite unos segundos q este bien hijo de puta de 0 a 59...: ");
            segundo = entrada.nextInt();
        }
    }

    public void avanzar(){
        segundo++;
        if( segundo == 60){
            segundo = 0;
            minuto++;
        }else if (minuto == 60){
                minuto = 0;
                hora++;
            }else if(hora == 24){
                hora = 0;
            }
    }

    public void retroceder(){
        segundo--;
        if (segundo == -1){
            segundo = 59;
            minuto--;
        }else if (minuto == -1){
            minuto = 59;
            hora --;
        }else if (hora == -1){
            hora = 23;
        }

    }







}
