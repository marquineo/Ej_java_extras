
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {
    final static float GRAVEDAD = 9.8f;
    
    public static void main(String[] args) {
        float time;
        float vel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor de tiempo");
        time = sc.nextInt();
        if (time <= 0){
            System.out.println("Tiempo incorrecto");
        } else {
            vel = (GRAVEDAD * time);
            System.out.println("velocidad =");
        }
    }
    
}
