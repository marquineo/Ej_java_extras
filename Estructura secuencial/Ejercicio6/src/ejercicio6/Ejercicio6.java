package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

    
    public static void main(String[] args) {
    float vel;
    Scanner sc = new Scanner(System.in);
        System.out.println("Dame una velocidad en Km/s :");
        vel = sc.nextInt();
        System.out.println(vel + " Km/h = "+ 0.2777778 * vel + " m/s");
    }
    
}
